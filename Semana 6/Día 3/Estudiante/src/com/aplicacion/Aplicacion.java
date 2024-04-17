package com.aplicacion;

import com.codingdojo.Estudiante;

public class Aplicacion {

	public static void main(String[] args) {
		Estudiante alex = new Estudiante("Alex", "Miller", 20, "Fundamentos de la Web");
		
		alex.imprimeInformacion();
		System.out.println("-----");
		alex.imprimeInformacion('T');
	}

}
