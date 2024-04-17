package com.codingdojo;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int edad;
	private String curso;
	
	public Estudiante(String nombre, String apellido, int edad, String curso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}
	
	public Estudiante() {
		this.nombre = "N/A";
		this.apellido = "N/A";
		this.edad = -1;
		this.curso = "N/A";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void imprimeInformacion() {
		System.out.println(this.nombre);
		System.out.println(this.apellido);
		System.out.println(this.edad);
		System.out.println(this.curso);
	}
	
	public void imprimeInformacion(char opcion) {
		if(opcion == 'N') {
			System.out.println(this.nombre + " " + this.apellido);
		}
		else if(opcion == 'E') {
			System.out.println(this.edad);
		}
		else if(opcion == 'C') {
			System.out.println(this.curso);
		}
		else if(opcion == 'T') {
			this.imprimeInformacion();
		}
		else {
			System.out.println("Opción incorrecta");
		}
	}
	
}
