package com.puntoCom.claseComplejo;

public class Complejo {
	private double parteReal;
	private double parteImaginaria;

	// Constructor por defecto
	public Complejo() {
		this.parteReal = 0;
		this.parteImaginaria = 0;
	}

	// Constructor con dos parámetros
	public Complejo(double parteReal, double parteImaginaria) {
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public Complejo sumar(Complejo otroComplejo) {
		double nuevaParteReal = this.parteReal + otroComplejo.getParteReal();
		double nuevaParteImaginaria = this.parteImaginaria + otroComplejo.getParteImaginaria();

		return new Complejo(nuevaParteReal, nuevaParteImaginaria);
	}

	public Complejo restar(Complejo otroComplejo) {
		double nuevaParteReal = this.parteReal - otroComplejo.getParteReal();
		double nuevaParteImaginaria = this.parteImaginaria - otroComplejo.getParteImaginaria();

		return new Complejo(nuevaParteReal, nuevaParteImaginaria);
	}
	
	public Complejo multiplicar(Complejo otroComplejo) {
	    double multiplicacionReal = this.parteReal * otroComplejo.getParteReal() - this.parteImaginaria * otroComplejo.getParteImaginaria();
	    double multiplicacionImaginaria = this.parteReal * otroComplejo.getParteImaginaria() + this.parteImaginaria * otroComplejo.getParteReal();
	    
	    return new Complejo(multiplicacionReal, multiplicacionImaginaria);
	}
	
	// mi logica principal para hacer la multiplicacion
//	public Complejo multiplicar(Complejo otroComplejo) {
//		double multiplicacionReal = this.parteReal * otroComplejo.getParteReal();
//		double multiplicacionImaginaria = this.parteImaginaria * otroComplejo.getParteImaginaria();
//		double multiplicacionRealImaginaria = this.parteReal * otroComplejo.getParteImaginaria();
//		double multiplicacionImaginariaReal = this.parteImaginaria * otroComplejo.getParteReal();
//		nuevaParteReal = multiplicacionReal.restar(multiplicacionRealImaginaria);
//		nuevaParteImaginaria = multiplicacionImaginaria.sumar(multiplicacionImaginariaReal);
//		
//		return new Complejo(nuevaParteReal, nuevaParteImaginaria);
//	}

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

}
