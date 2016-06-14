package com.tiago.melo.estruturas;

import java.util.LinkedList;
import java.util.UUID;

public class TesteListaEncadeada {
	/**
	 * Gera listas aleatórias
	 */
	public void geraListasAleatorias(long tamanhoMaximoDaLista) {
		for (long indice = 10; indice < tamanhoMaximoDaLista; indice *= 10) {

			long startTime = System.currentTimeMillis();
			geraListaEncadeada(indice);
			long endTime = System.currentTimeMillis();

			System.out.println("Tamanho da lista = " + indice + " millisegundos.");
			System.out.println("Tempo de execução total = " + (endTime - startTime) + " millisegundos.");
		}
	}

	/**
	 * 
	 * Cria lista dinamicamente
	 * 
	 * @param tamanhoDaLista tamanho da lista aleatória que deve ser criada
	 */
	public void geraListaEncadeada(long tamanhoDaLista) {
		LinkedList<String> listaEncadeadaStr = new LinkedList<String>();

		for (long indice = 0; indice < tamanhoDaLista; indice++) {
			listaEncadeadaStr.add(UUID.randomUUID().toString());
		}
	}

}
