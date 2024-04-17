package com.codingdojo;

public class Aplicacion {

	public static void main(String[] args) {
		Persona alan = new Persona("Alan", "Morales", 20);
		alan.imprimeInformacion();
		alan.mensaje();
		
		Estudiante alex = new Estudiante("Alex", "Miller", 18, "Java/Spring", 12345);
		alex.imprimeInformacionEstudiante();
		alex.mensaje();

	}

}
