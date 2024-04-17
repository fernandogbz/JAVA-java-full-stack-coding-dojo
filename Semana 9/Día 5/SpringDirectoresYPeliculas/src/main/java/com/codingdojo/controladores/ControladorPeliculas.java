package com.codingdojo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.modelos.Pelicula;
import com.codingdojo.servicios.ServicioPeliculas;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorPeliculas {
	private static ServicioPeliculas servicioPeliculas;
	
	public ControladorPeliculas(ServicioPeliculas sP) {
		this.servicioPeliculas = sP;
	}
	
	@GetMapping("/pelicula/{id}")
	public String detallePelicula(Model model, 
								  @PathVariable("id") Long id,
								  HttpSession sesion) {
		String correo = (String)sesion.getAttribute("correo");
		
		if(correo == null) {
			return "redirect:/";
		}
		
		Pelicula peliculaActual = this.servicioPeliculas.obtenerUnoPorId(id);
		model.addAttribute("pelicula", peliculaActual);
		
		return "detallePelicula.jsp";
	}
	
}
