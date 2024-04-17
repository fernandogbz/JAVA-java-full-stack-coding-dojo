package com.codingdojo.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.modelos.Pelicula;

@Repository
public interface RepositorioPeliculas extends CrudRepository<Pelicula, Long> {
	List<Pelicula> findAll();
}
