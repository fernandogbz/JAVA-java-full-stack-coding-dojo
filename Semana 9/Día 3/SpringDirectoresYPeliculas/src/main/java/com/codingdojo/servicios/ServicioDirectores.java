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
		return repositorioDirectores.selectTodos();
		// return repositorioDirectores.findAll();
	}
	
	public Director obtenerUno(String correo, String contrasena) {
		return repositorioDirectores.selectWithCorreoAndContrasena(correo, contrasena);
		// return repositorioDirectores.findByCorreoAndContrasena(correo, contrasena);
	}
	
	public int agregarDirector(Director nuevoDirector) {
		return repositorioDirectores.insertDirector(nuevoDirector.getNombre(),
													nuevoDirector.getApellido(),
													nuevoDirector.getCorreo(),
													nuevoDirector.getContrasena());
		// return repositorioDirectores.save(nuevoDirector);
	}
	
	public void eliminarDirector(Long id) {
		repositorioDirectores.deleteFromDirectores(id);
		// repositorioDirectores.deleteById(id);
	}
	
	public Director obtenerUnoPorId(Long id) {
		Optional<Director> directorEncontrado = repositorioDirectores.findById(id);
		return directorEncontrado.get();
	}
	
	public void actualizarDirector(Director director) {
		repositorioDirectores.updateDirector(director.getNombre(),
													director.getApellido(),
													director.getCorreo(),
													director.getContrasena(),
													director.getId());
		// return repositorioDirectores.save(director);
	}
}
