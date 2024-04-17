package com.codingdojo.servicios;

import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Director;
import com.codingdojo.repositorios.RepositorioDirectores;

import java.util.List;
import java.util.Optional;

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
	
	public Director agregarDirector(Director nuevoDirector) {
		return repositorioDirectores.save(nuevoDirector);
	}
	
	public void eliminarDirector(Long id) {
		repositorioDirectores.deleteById(id);
	}
	
	public Director obtenerUnoPorId(Long id) {
		Optional<Director> directorEncontrado = repositorioDirectores.findById(id);
		return directorEncontrado.get();
	}
	
	public Director actualizarDirector(Director director) {
		return repositorioDirectores.save(director);
	}
}
