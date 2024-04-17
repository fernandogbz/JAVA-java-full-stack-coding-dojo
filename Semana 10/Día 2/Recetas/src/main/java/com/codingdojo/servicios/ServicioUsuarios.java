package com.codingdojo.servicios;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.modelos.LoginUsuario;
import com.codingdojo.modelos.Usuario;
import com.codingdojo.repositorios.RepositorioUsuarios;

@Service
public class ServicioUsuarios {
	
	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	public BindingResult validarRegistro(BindingResult resultado, Usuario nuevoUsuario) {
		if(! nuevoUsuario.getContraseña().equals(nuevoUsuario.getConfirmacionContraseña())) {
			resultado.rejectValue("confirmacionContraseña", "Matches", "Las contraseñas no coinciden!");
		}
		Usuario usuarioExistente = this.repositorioUsuarios.getByCorreo(nuevoUsuario.getCorreo());
		if(usuarioExistente != null) {
			resultado.rejectValue("correo", "Unique", "Este correo ya está dado de alta, por favor seleccionar otro.");
		}
		
		
		return resultado;
	}
	
	public BindingResult validarLogin(BindingResult resultado, LoginUsuario loginUsuario) {
		Usuario usuarioExistente = this.repositorioUsuarios.getByCorreo(loginUsuario.getCorreoLogin());
		if(usuarioExistente == null) {
			resultado.rejectValue("correoLogin", "Missing", "Credenciales incorrectas!");
		}
		else {
			if(! BCrypt.checkpw(loginUsuario.getContraseñaLogin(), usuarioExistente.getContraseña())) {
				resultado.rejectValue("correoLogin", "Matches", "Credenciales incorrectas!");
			}
		}
		
		return resultado;
	}
	
	
	public Usuario insertarUsuario(Usuario nuevoUsuario) {
		String contraseñaEncriptada = BCrypt.hashpw(nuevoUsuario.getContraseña(), BCrypt.gensalt());
		nuevoUsuario.setContraseña(contraseñaEncriptada);
		return this.repositorioUsuarios.save(nuevoUsuario);
	}
	
	public Usuario selectPorCorreo(String correo) {
		return this.repositorioUsuarios.getByCorreo(correo);
		
	}
	
	public Usuario selectPorId(Long id) {
		return this.repositorioUsuarios.getById(id);
	}
}
