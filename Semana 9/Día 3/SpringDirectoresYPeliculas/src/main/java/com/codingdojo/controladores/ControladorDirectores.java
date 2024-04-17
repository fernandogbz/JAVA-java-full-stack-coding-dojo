package com.codingdojo.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.modelos.Director;
import com.codingdojo.servicios.ServicioDirectores;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorDirectores {
	
	private final ServicioDirectores servicioDirectores;
	
	public ControladorDirectores(ServicioDirectores sd){
		this.servicioDirectores = sd;
	}
	
	@GetMapping("/")
	public String loginRegistro(@ModelAttribute("director") Director director) {
		return "index.jsp";
	}

	@GetMapping("/directores")
	public String directores(Model model, HttpSession sesion) {
		String correo = (String)sesion.getAttribute("correo");
		
		if(correo == null) {
			return "redirect:/";
		}
		
		List<Director> directores = this.servicioDirectores.obtenerTodos();
		
		for(int i = 0; i < directores.size(); i ++) {
			System.out.println(directores.get(i).getNombre() + " " + directores.get(i).getApellido());
			System.out.println(directores.get(i).getPeliculas());
		}
		
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
			sesion.setAttribute("id", directorActual.getId());
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

	@PostMapping("/registro")
	public String procesaRegistro(@Valid @ModelAttribute("director") Director director,
								  BindingResult result,
								  HttpSession sesion) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		else {
			int directorId = this.servicioDirectores.agregarDirector(director);
			sesion.setAttribute("correo", director.getCorreo());
			sesion.setAttribute("nombre", director.getNombre() + " " + director.getApellido());
			sesion.setAttribute("id", directorId);
			
			return "redirect:/directores";
		}
	}
	
	@DeleteMapping("/director/eliminar/{id}")
	public String eliminaDirector(@PathVariable("id") Long id) {
		this.servicioDirectores.eliminarDirector(id);
		
		return "redirect:/logout";
	}
	
	@GetMapping("/director/editar/{id}")
	public String mostrarEditarDirector(@PathVariable("id") Long id,
										@ModelAttribute("director") Director director,
										Model model,
										HttpSession sesion) {
		String correo = (String)sesion.getAttribute("correo");
		
		if(correo == null) {
			return "redirect:/";
		}
		
		Director directorActual = this.servicioDirectores.obtenerUnoPorId(id);
		model.addAttribute("directorActual", directorActual);
		return "editarDirector.jsp";
	}
	
	@PutMapping("/editar")
	public String editarDirector(@Valid @ModelAttribute("director") Director director,
								 BindingResult result,
								 HttpSession sesion) {
		if(result.hasErrors()) {
			return "editarDirector.jsp";
		}
		else {
			Long idDirector = (Long)sesion.getAttribute("id");
			director.setId(idDirector);
			/*
			Long idDirector = (Long)sesion.getAttribute("id");
			Director directorEdicion = this.servicioDirectores.obtenerUnoPorId(idDirector);
			directorEdicion.setNombre(director.getNombre());
			directorEdicion.setApellido(director.getApellido());
			directorEdicion.setCorreo(director.getCorreo());
			directorEdicion.setContrasena(director.getContrasena());
			*/
			
			this.servicioDirectores.actualizarDirector(director);
			return "redirect:/directores";
		}
		
	}

}
