package com.codingdojo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.modelos.LoginUsuario;
import com.codingdojo.modelos.Usuario;
import com.codingdojo.servicios.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorUsuarios {
	
	@Autowired
	private ServicioUsuarios servicioUsuario;
	
	@GetMapping("/")
	public String mostrarInicio(@ModelAttribute("usuario") Usuario usuario,
								@ModelAttribute("loginUsuario") LoginUsuario loginUsuario) {
		return "index.jsp";
	}
	
	@PostMapping("/registro")
	public String procesaRegistro(@Valid @ModelAttribute("usuario") Usuario nuevoUsuario,
								 BindingResult resultado,
								 @ModelAttribute("loginUsuario") LoginUsuario loginUsuario,
								 HttpSession sesion) {
		
		resultado = this.servicioUsuario.validarRegistro(resultado, nuevoUsuario);
		if(resultado.hasErrors()) {
			return "index.jsp";
		}
		nuevoUsuario = this.servicioUsuario.insertarUsuario(nuevoUsuario);
		
		sesion.setAttribute("idUsuario", nuevoUsuario.getId());
		sesion.setAttribute("nombre", nuevoUsuario.getNombre());
		sesion.setAttribute("apellido", nuevoUsuario.getApellido());
		
		return "redirect:/";
		
	}
	
	@PostMapping("/login")
	public String procesaLogin(@Valid @ModelAttribute("loginUsuario") LoginUsuario loginUsuario,
							   BindingResult resultado,
							   @ModelAttribute("usuario") Usuario usuario,
							   HttpSession sesion) {
		resultado = this.servicioUsuario.validarLogin(resultado, loginUsuario);
		if(resultado.hasErrors()) {
			return "index.jsp";
		}
		
		Usuario usuarioExistente = this.servicioUsuario.selectPorCorreo(loginUsuario.getCorreoLogin());
		
		sesion.setAttribute("idUsuario", usuarioExistente.getId());
		sesion.setAttribute("nombre", usuarioExistente.getNombre());
		sesion.setAttribute("apellido", usuarioExistente.getApellido());
		
		return "redirect:/";
	}
}
