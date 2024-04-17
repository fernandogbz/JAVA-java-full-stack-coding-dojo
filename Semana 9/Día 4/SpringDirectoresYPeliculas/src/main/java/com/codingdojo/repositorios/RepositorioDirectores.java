package com.codingdojo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.modelos.Director;

import jakarta.transaction.Transactional;

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
	
	@Query("SELECT d FROM Director d")
	List<Director> selectTodos();
	
	@Query("SELECT d FROM Director d WHERE correo = ?1")
	Director selectWithCorreo(String correo);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE directores SET nombre = ?1, apellido = ?2, correo = ?3, contrasena = ?4 WHERE id = ?5",
		   nativeQuery = true)
	void updateDirector(String nombre, String apellido, String correo, String contrasena, Long id);
	
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO directores(nombre, apellido, correo, contrasena) VALUES(?1, ?2, ?3, ?4)",
			nativeQuery = true)
	int insertDirector(String nombre, String apellido, String correo, String contrasena);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM directores WHERE id = ?1", nativeQuery = true)
	void deleteFromDirectores(Long id);
	
}
