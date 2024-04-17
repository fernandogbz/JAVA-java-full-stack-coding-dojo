package com.codingdojo.repositorios;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.modelos.Director;

@Repository
public interface RepositorioDirectores extends CrudRepository<Director, Long>{
	/* SELECT *
	 * FROM directores;
	 */
	List<Director> findAll();
	
	/* SELECT *
	 * FROM directores
	 * WHERE correo = ? AND contrasena = ? 
	 */
	Director findByCorreoAndContrasena(String correo, String contrasena);
	
}
