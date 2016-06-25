package com.tiago.melo;

import com.tiago.melo.estruturas.TesteListaEncadeada;
import com.tiago.melo.estruturas.TestePilha;
import com.tiago.melo.estruturas.filaDePrioridades.TesteFilaDePrioridades;

public class Comparacoes {

	private static int TAMANHO_MAXIMO = 100_000;

	public static void main(String[] args) {
		// testaListaEncadeada();
		// testaFilaDePrioridades();
		testaPilha();
	}

	private static void testaPilha() {
		TestePilha testePilha = new TestePilha();
		testePilha.geraPilhaDefault(TAMANHO_MAXIMO);

	}

	private static void testaFilaDePrioridades() {
		TesteFilaDePrioridades testeFilaDePrioridades = new TesteFilaDePrioridades();

		testeFilaDePrioridades.geraFilaDePrioridadesDefault(TAMANHO_MAXIMO);
		testeFilaDePrioridades.geraFilaDePrioridadesCustomizada(TAMANHO_MAXIMO);
	}

	private static void testaListaEncadeada() {
		TesteListaEncadeada testeListaEncadeada = new TesteListaEncadeada();

		testeListaEncadeada.geraListaEncadeada(TAMANHO_MAXIMO);

	}

}
