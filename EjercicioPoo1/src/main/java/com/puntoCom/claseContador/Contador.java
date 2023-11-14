package com.puntoCom.claseContador;

public class Contador {
	private int cont;

	public Contador() {
		cont = 0;
	}

	public Contador(int valorInicial) {
		super();
		cont = (valorInicial < 0) ? 0 : valorInicial;
	}

	public Contador(Contador otroContador) {
		cont = otroContador.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void incrementar() {
		cont++;
	}

	public void decrementar() {
		if (cont > 0) {
			cont--;
		} else {
			cont = 0;
		}
	}

}
