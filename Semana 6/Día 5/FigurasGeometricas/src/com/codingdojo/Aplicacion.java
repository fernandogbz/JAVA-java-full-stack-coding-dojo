package com.codingdojo;

public class Aplicacion {

	public static void main(String[] args) {
		Cuadrado cuadro1 = new Cuadrado(8.5);
		cuadro1.imprimeInformacion();
		
		System.out.println("-------");
		
		Circulo circulo1 = new Circulo(3.5);
		System.out.println("Radio: " + circulo1.getRadio());
		System.out.println("Área: " + circulo1.area());
		System.out.println("Perímetro: " + circulo1.perimetro());
		
		System.out.println("-------");
		
		Perro jagger = new Perro("Jagger", "Golden", "Alan");
		jagger.mensaje();
		jagger.imprimeInformacion();
		
		System.out.println("----Método estático----");
		FiguraGeometrica.staticMethod();

	}

}
