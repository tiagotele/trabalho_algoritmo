package com.tiago.melo;

import com.tiago.melo.estruturas.TesteListaEncadeada;

public class Comparacoes {

	private static long TAMANHO_MAXIMO = 100_000_000;

	public static void main(String[] args) {

		testaListaEncadeada();
	}

	private static void testaListaEncadeada() {
		TesteListaEncadeada testeListaEncadeada = new TesteListaEncadeada();

		testeListaEncadeada.geraListaEncadeada(TAMANHO_MAXIMO);
	}

}
