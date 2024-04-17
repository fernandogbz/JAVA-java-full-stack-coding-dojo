package com.codingdojo.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.modelos.Director;
import com.codingdojo.servicios.ServicioDirectores;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorDirectores {
	
	private final ServicioDirectores servicioDirectores;
	
	public ControladorDirectores(ServicioDirectores sd){
		this.servicioDirectores = sd;
	}
	
	@GetMapping("/")
	public String loginRegistro() {
		return "index.jsp";
	}

	@GetMapping("/directores")
	public String directores(Model model, HttpSession sesion) {
		String correo = (String)sesion.getAttribute("correo");
		
		if(correo == null) {
			System.out.println("No has hecho login debidamente!");
			return "redirect:/";
		}
		
		List<Director> directores = this.servicioDirectores.obtenerTodos();
		
		model.addAttribute("directores", directores);
		return "directores.jsp";
	}
	
	// @RequestMapping(value="/login", method=RequestMethod.POST)
	@PostMapping("/login")
	public String procesaLogin(@RequestParam(value="correo") String correo,
							   @RequestParam(value="contrasena") String contrasena,
							   RedirectAttributes redirectAttribute,
							   HttpSession sesion) {
		Director directorActual = this.servicioDirectores.obtenerUno(correo, contrasena);
		System.out.println(directorActual);
		
		if(directorActual != null) {
			sesion.setAttribute("correo", directorActual.getCorreo());
			sesion.setAttribute("nombre", directorActual.getNombre() + " " + directorActual.getApellido());
			return "redirect:/directores";
		}
		else {
			redirectAttribute.addFlashAttribute("errorLogin", "Credenciales incorrectas");
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/logout")
	public String procesaLogout(HttpSession sesion) {
		//sesion.removeAttribute("correo");
		//sesion.removeAttribute("nombre");
		sesion.invalidate();
	
		return "redirect:/"; 
	}


}
