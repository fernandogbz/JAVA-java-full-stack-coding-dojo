package com.codingdojo;

public class Perro extends Mascota {
	private String nombre;
	private String raza;
	private String dueño;

	public Perro(String nombre, String raza, String dueño) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueño = dueño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	@Override
	public void imprimeInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Raza: " + this.raza);
		System.out.println("Dueño: " + this.dueño);	
	}

}
