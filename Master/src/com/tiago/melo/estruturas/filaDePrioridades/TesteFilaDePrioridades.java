package com.tiago.melo.estruturas.filaDePrioridades;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class TesteFilaDePrioridades {

	public void geraFilaDePrioridadesDefault(int tamanho) {
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(tamanho);
		Random rand = new Random();
		for (int i = 0; i < tamanho; i++) {
			Integer randomInteger = new Integer(rand.nextInt(100));
			System.out.println("Adicionando: " + randomInteger);
			integerPriorityQueue.add(randomInteger);
		}
		for (int i = 0; i < tamanho; i++) {
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processando inteiro:" + in);
		}
	}

	public void geraFilaDePrioridadesCustomizada(int tamanho) {
		// Fila de prioridade com comparador
		Queue<Pessoa> customerPriorityQueue = new PriorityQueue<>( idComparator);
		adicionaDadosNaFila(customerPriorityQueue, tamanho);

		pollDataFromQueue(customerPriorityQueue);
	}

	// Classe anonima de comparador para fila com classe customizada
	public static Comparator<Pessoa> idComparator = new Comparator<Pessoa>() {

		@Override
		public int compare(Pessoa c1, Pessoa c2) {
			return (int) (c1.getId() - c2.getId());
		}
	};

	// utility method to add random data to Queue
	private static void adicionaDadosNaFila(Queue<Pessoa> customerPriorityQueue, int tamanho) {
		Random rand = new Random();
		for (int i = 0; i < tamanho; i++) {
			int id = rand.nextInt(100);
			customerPriorityQueue.add(new Pessoa(id, "Tiago" + id));
		}
	}

	// REmovendo elementos da fila de prioridade
	private static void pollDataFromQueue(Queue<Pessoa> customerPriorityQueue) {
		while (true) {
			Pessoa cust = customerPriorityQueue.poll();
			if (cust == null)
				break;
			System.out.println("Processando Pessoa com ID=" + cust.getId());
		}
	}

}
