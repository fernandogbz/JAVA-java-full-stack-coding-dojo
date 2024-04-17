package com.codingdojo.servicios;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Pelicula;
import com.codingdojo.repositorios.RepositorioPeliculas;

@Service
public class ServicioPeliculas {
	
	private static RepositorioPeliculas repositorioPeliculas;
	
	public ServicioPeliculas(RepositorioPeliculas rp) {
		this.repositorioPeliculas = rp;
	}
	
	public Pelicula obtenerUnoPorId(Long id) {
		Optional<Pelicula> directorEncontrado = repositorioPeliculas.findById(id);
		return directorEncontrado.get();
	}

}
