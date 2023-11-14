package com.puntoComEjercicios.claseContador;

public class PruebaContador {
	public static void main(String[] args) {
		Contador contador1 = new Contador();

		System.out.println("Posicion inicial " + contador1.getCont());

		contador1.incrementar();
		System.out.println("Despues de incrementar " + contador1.getCont());

		contador1.decrementar();
		System.out.println("Depues de decrementar " + contador1.getCont());
	}
}
