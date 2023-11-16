package com.puntoCom.claseComplejo;

public class complejoPrueba {
	public static void main(String[] args) {
		// Creo los numeros complejos
		Complejo complejo1 = new Complejo(2.0, 3.0);
		Complejo complejo2 = new Complejo(1.0, 4.0);

		// Sumo los numeros
		Complejo resultadoSuma = complejo1.sumar(complejo2);

		// Resto los numeros
		Complejo resultadoResta = complejo1.restar(complejo2);

		// Multiplico
		Complejo resultadoMultiplicacion = complejo1.multiplicar(complejo2);

		// Multiplico por un numero
		Complejo resultadoMultiplicacionPorN = complejo1.multiplicar(3);

		// Division
		Complejo resultadoDivision = complejo1.dividir(complejo2);

		// Muestro resultados
		System.out.println("Suma = " + resultadoSuma);
		System.out.println("Resta = " + resultadoResta);
		System.out.println("Multiplicacion = " + resultadoMultiplicacion);
		System.out.println("Multiplico por 3 = " + resultadoMultiplicacionPorN);
		System.out.println("Division = " + resultadoDivision);

	}
}
