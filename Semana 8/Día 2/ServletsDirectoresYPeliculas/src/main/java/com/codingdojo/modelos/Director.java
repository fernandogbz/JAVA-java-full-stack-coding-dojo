package com.codingdojo.modelos;

public class Director {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private int edad;
	
	public Director(String nombre, String apellido, String nacionalidad, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		String informacion = "Nombre del director: " + this.nombre + " " + this.apellido + "\n";
		informacion += "Nacionalidad: " + this.nacionalidad + "\n";
		informacion += "Edad: " + this.edad;
		
		return informacion;
	}
	
}
