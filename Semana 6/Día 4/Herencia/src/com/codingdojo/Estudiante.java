package com.codingdojo;

public class Estudiante extends Persona {
	private String curso;
	private int matricula;
	
	public Estudiante(String nombre, String apellido, int edad, String curso, int matricula) {
		super(nombre, apellido, edad);
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void imprimeInformacionEstudiante() {
		super.imprimeInformacion();
		System.out.println(this.matricula);
		System.out.println(this.curso);
	}
	
	public void mensaje() {
		System.out.println("Hola desde Estudiante");
	}
}
