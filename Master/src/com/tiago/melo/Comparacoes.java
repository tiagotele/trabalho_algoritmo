package com.tiago.melo;

import com.tiago.melo.estruturas.TesteFilaDePrioridades;
import com.tiago.melo.estruturas.TesteListaEncadeada;
import com.tiago.melo.estruturas.TestePilha;
import com.tiago.melo.estruturas.TesteTabelaHash;
import com.tiago.melo.estruturas.utils.Utils;

public class Comparacoes {

	private static int TAMANHO_MAXIMO = 100_000;

	public static void main(String[] args) {
		Utils.apagaLogDeExecucao();
		Utils.criaLogDeExecucao("Log de execução");
		Utils.criaLogDeExecucao("Lista encadeada");
		testaListaEncadeada();
		Utils.criaLogDeExecucao("Fila de prioridades");
		testaFilaDePrioridades();
		Utils.criaLogDeExecucao("Pilha");
		testaPilha();
		Utils.criaLogDeExecucao("Tabela Hash");
		testeTabelaHash();
	}

	private static void testeTabelaHash() {
		TesteTabelaHash testeTabelaHash = new TesteTabelaHash();

		testeTabelaHash.geraEstruturaDefault(TAMANHO_MAXIMO);
		testeTabelaHash.geraEstruturaCustomizada(TAMANHO_MAXIMO);

	}

	private static void testaPilha() {
		TestePilha testePilha = new TestePilha();

		testePilha.geraEstruturaDefault(TAMANHO_MAXIMO);
		testePilha.geraEstruturaCustomizada(TAMANHO_MAXIMO);
	}

	private static void testaFilaDePrioridades() {
		TesteFilaDePrioridades testeFilaDePrioridades = new TesteFilaDePrioridades();

		testeFilaDePrioridades.geraEstruturaDefault(TAMANHO_MAXIMO);
		testeFilaDePrioridades.geraEstruturaCustomizada(TAMANHO_MAXIMO);
	}

	private static void testaListaEncadeada() {
		TesteListaEncadeada testeListaEncadeada = new TesteListaEncadeada();

		testeListaEncadeada.geraEstruturaDefault(TAMANHO_MAXIMO);
		testeListaEncadeada.geraEstruturaCustomizada(TAMANHO_MAXIMO);
	}
}
