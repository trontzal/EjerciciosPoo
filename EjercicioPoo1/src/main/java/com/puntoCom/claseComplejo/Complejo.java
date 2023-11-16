package com.puntoCom.claseComplejo;

import org.apache.tomcat.jakartaee.commons.lang3.builder.EqualsBuilder;

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
		double multiplicacionReal = this.parteReal * otroComplejo.getParteReal()
				- this.parteImaginaria * otroComplejo.getParteImaginaria();
		double multiplicacionImaginaria = this.parteReal * otroComplejo.getParteImaginaria()
				+ this.parteImaginaria * otroComplejo.getParteReal();

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

	public Complejo multiplicar(double n) {
		double realPorN = this.parteReal * n;
		double imaginarioPorN = this.parteImaginaria * n;

		return new Complejo(realPorN, imaginarioPorN);
	}

	public Complejo dividir(Complejo otroComplejo) {
		double c2 = otroComplejo.getParteReal() * otroComplejo.getParteReal();
		double d2 = otroComplejo.getParteImaginaria() * otroComplejo.getParteImaginaria();

		double aPorC = this.parteReal * otroComplejo.getParteReal();
		double bPorD = this.parteImaginaria * otroComplejo.getParteImaginaria();
		double bPorC = this.parteImaginaria * otroComplejo.getParteReal();
		double aPorD = this.parteReal * otroComplejo.getParteImaginaria();

		double parteRealDivision = (aPorC + bPorD) / (c2 + d2);
		double parteImaginariaDivision = (bPorC - aPorD) / (c2 + d2);

		return new Complejo(parteRealDivision, parteImaginariaDivision);
	}

	@Override
	public String toString() {
		return "(" + parteReal + ", " + parteImaginaria + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Complejo otroComplejo = (Complejo) obj;
		return Double.compare(otroComplejo.getParteReal(), parteReal) == 0
				&& Double.compare(otroComplejo.getParteImaginaria(), parteImaginaria) == 0;
	}

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
