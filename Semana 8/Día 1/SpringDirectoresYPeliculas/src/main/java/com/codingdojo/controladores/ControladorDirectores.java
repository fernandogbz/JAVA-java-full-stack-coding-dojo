package com.codingdojo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class ControladorDirectores {
	@GetMapping("/")
	public String cargarHome() {
		return "<h1> Hola desde nuestro primer controlador </h1>";
	}
	
	@GetMapping("/directores")
	public String directores() {
		return "<ul>" + 
					"<li> Alex Miller </li>" +
					"<li> Martha Gómez </li>" +
					"<li> Roger Anderson </li>" +
				"</ul>";
	}
	
	@GetMapping("/director")
	public String director(@RequestParam(value="nombre") String nombre) {
		return "<h1> Bienvenid@ de vuelta " + nombre + "</h1>"; 
	}
	
	@GetMapping("/director/{nombreCompleto}")
	public String directorParam(@PathVariable("nombreCompleto") String nombreCompleto) {
		return "<h1> Bienvenid@ de vuelta " + nombreCompleto + "</h1>";
	}
	
	@GetMapping("/director/{nombre}/{apellido}/{edad}")
	public String directorNombreApellido(@PathVariable("nombre") String nombre,
										 @PathVariable("edad") int edad,
										 @PathVariable("apellido") String apellido
										 ) {
		return "<h1> Bienvenid@ de vuelta " + nombre + " " + apellido+  "</h1>" +
			   "<p> Edad: " + edad + "</p>";
	}

}
