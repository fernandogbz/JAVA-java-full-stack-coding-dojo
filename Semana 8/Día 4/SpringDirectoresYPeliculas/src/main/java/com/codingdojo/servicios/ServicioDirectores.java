package com.codingdojo.servicios;

import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Director;
import com.codingdojo.repositorios.RepositorioDirectores;

import java.util.List;

@Service
public class ServicioDirectores {
	
	private final RepositorioDirectores repositorioDirectores;
	
	public ServicioDirectores(RepositorioDirectores rd) {
		this.repositorioDirectores = rd;
	}
	
	public List<Director> obtenerTodos(){
		return repositorioDirectores.findAll();
	}
	
	public Director obtenerUno(String correo, String contrasena) {
		return repositorioDirectores.findByCorreoAndContrasena(correo, contrasena);
	}
}
