package com.tiago.melo.estruturas;

import java.util.LinkedList;
import java.util.UUID;

import com.tiago.melo.estruturas.utils.Pessoa;
import com.tiago.melo.interfaces.TestaEstrutura;

public class TesteListaEncadeada implements TestaEstrutura {

	@Override
	public void geraEstruturaDefault(int tamanho) {
		long start = System.currentTimeMillis();

		LinkedList<Integer> listaEncadeadaStr = new LinkedList<Integer>();

		for (int indice = 0; indice < tamanho; indice++) {
			listaEncadeadaStr.add(indice);
		}

		long finish = System.currentTimeMillis();
		System.out.println("Tempo de execução do método geraListasAleatorias: " + (finish - start));

	}

	@Override
	public void geraEstruturaCustomizada(int tamanho) {
		long start = System.currentTimeMillis();

		LinkedList<Pessoa> listaEncadeadaStr = new LinkedList<Pessoa>();

		for (int indice = 0; indice < tamanho; indice++) {
			listaEncadeadaStr.add(new Pessoa(indice, UUID.randomUUID().toString()));
		}

		long finish = System.currentTimeMillis();
		System.out.println("Tempo de execução do método geraListasAleatorias: " + (finish - start));
	}

}
