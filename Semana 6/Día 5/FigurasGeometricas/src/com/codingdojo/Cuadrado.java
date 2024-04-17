package com.codingdojo;

public class Cuadrado implements FiguraGeometrica {
	private double longitud;
	
	public Cuadrado(double longitud){
		this.longitud = longitud;
	}
	
	@Override
	public double perimetro() {
		return this.longitud * 4;
	}
	
	@Override
	public double area() {
		return this.longitud * this.longitud;
	}
	
	public void imprimeInformacion() {
		System.out.println("Longitud: " + this.longitud);
		System.out.println("Área: " + this.area());
		System.out.println("Perímetro: " + this.perimetro());
	}
	
	public double getLongitud() {
		return this.longitud;
	}
	
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
}
