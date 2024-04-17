package com.codingdojo;

public class Circulo implements FiguraGeometrica{
	private double radio;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.radio * 2;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
