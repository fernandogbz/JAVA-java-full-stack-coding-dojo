package com.codingdojo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Receta;
import com.codingdojo.repositorios.RepositorioRecetas;

@Service
public class ServicioRecetas {
	@Autowired
	private RepositorioRecetas repositorioRecetas;
	
	public Receta crearReceta(Receta nuevaReceta) {
		return this.repositorioRecetas.save(nuevaReceta);
	}
}
