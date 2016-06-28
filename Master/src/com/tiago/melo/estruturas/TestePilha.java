package com.tiago.melo.estruturas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

import com.tiago.melo.estruturas.utils.Pessoa;
import com.tiago.melo.estruturas.utils.Utils;
import com.tiago.melo.interfaces.TestaEstrutura;

public class TestePilha implements TestaEstrutura {

	@Override
	public void geraEstruturaDefault(int tamanho) {
		long start = System.currentTimeMillis();
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int indice = tamanho; indice >= 0; indice--)
			queue.add(indice);

		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		long finish = System.currentTimeMillis();
		System.out.println("Tempo de execução do método geraEstruturaDefault: " + (finish - start));
		Utils.criaLogDeExecucao("Tempo de execução do método geraEstruturaDefault: " + (finish - start));
	}

	@Override
	public void geraEstruturaCustomizada(int tamanho) {
		long start = System.currentTimeMillis();
		Queue<Pessoa> queue = new LinkedList<Pessoa>();

		for (int i = tamanho; i >= 0; i--)
			queue.add(new Pessoa(i, UUID.randomUUID().toString()));

		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		long finish = System.currentTimeMillis();
		System.out.println("Tempo de execução do método geraEstruturaCustomizada: " + (finish - start));
		Utils.criaLogDeExecucao("Tempo de execução do método geraEstruturaCustomizada: " + (finish - start));
	}

	@Override
	public void adicionaTempoDeExecucao() {
		// TODO Auto-generated method stub

	}
}
