package com.tiago.melo.estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class TestePilha {
	public void geraPilhaDefault(int tamanho) {

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = tamanho; i >= 0; i--)
			queue.add(i);

		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
