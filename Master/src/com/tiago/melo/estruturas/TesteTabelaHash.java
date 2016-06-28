package com.tiago.melo.estruturas;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.UUID;

import com.tiago.melo.estruturas.utils.Pessoa;
import com.tiago.melo.interfaces.TestaEstrutura;

public class TesteTabelaHash implements TestaEstrutura {

	@Override
	public void geraEstruturaDefault(int tamanho) {
		long start = System.currentTimeMillis();
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		for (int i = 0; i < tamanho; i++) {

			numbers.put(UUID.randomUUID().toString(), i);
		}

		Enumeration<String> elements = numbers.keys();

		while (elements.hasMoreElements()) {
			System.out.println("--------");
			String key = elements.nextElement();
			System.out.println("Key = " + key);
			System.out.println("Value = " + numbers.get(key));
		}
		long finish = System.currentTimeMillis();
		System.out.println("Tempo de execução do método geraEstruturaDefault: " + (finish - start));
	}

	@Override
	public void geraEstruturaCustomizada(int tamanho) {
		long start = System.currentTimeMillis();
		Hashtable<String, Pessoa> numbers = new Hashtable<String, Pessoa>();
		for (int i = 0; i < tamanho; i++) {

			String randomStr = UUID.randomUUID().toString();
			numbers.put(randomStr, new Pessoa(i, randomStr));
		}

		Enumeration<String> elements = numbers.keys();

		while (elements.hasMoreElements()) {
			System.out.println("--------");
			String key = elements.nextElement();
			System.out.println("Key = " + key);
			System.out.println("Value = " + numbers.get(key));
		}
		long finish = System.currentTimeMillis();
		System.out.println("Tempo de execução do método geraEstruturaCustomizada: " + (finish - start));

	}

}
