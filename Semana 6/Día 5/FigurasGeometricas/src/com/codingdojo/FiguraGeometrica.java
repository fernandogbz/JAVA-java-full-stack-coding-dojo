package com.codingdojo;

public interface FiguraGeometrica {
	double perimetro();
	double area();
	
	static void staticMethod() {
        System.out.println("Hola desde el metodo static de la interfaz.");
    }
}

