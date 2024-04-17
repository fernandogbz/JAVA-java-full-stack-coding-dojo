package com.codingdojo.controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.modelos.Receta;
import com.codingdojo.modelos.Usuario;
import com.codingdojo.servicios.ServicioRecetas;
import com.codingdojo.servicios.ServicioUsuarios;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorRecetas {
	
	@Autowired
	private ServicioUsuarios servicioUsuario;
	
	@Autowired
	private ServicioRecetas servicioRecetas;
	
	@GetMapping("/recetas")
	public String despliegaRecetas() {
		return "recetas.jsp";
	}
	
	@GetMapping("/nueva/receta")
	public String despliegaFormularioNuevaReceta(@ModelAttribute("receta") Receta receta) {
		return "formularioReceta.jsp";
	}
	
	@PostMapping("/procesa/receta")
	public String agregarReceta(@Valid @ModelAttribute("receta") Receta recetaNueva,
			   BindingResult resultado,
			   HttpSession sesion) {
		if(resultado.hasErrors()) {
			return "formularioReceta.jsp";
		}
		
		Long idUsuario = (Long)sesion.getAttribute("idUsuario");
		Usuario usuarioActual = this.servicioUsuario.selectPorId(idUsuario);
		recetaNueva.setUsuario(usuarioActual);
		this.servicioRecetas.crearReceta(recetaNueva);
		
		return "redirect:/recetas";
	}
}