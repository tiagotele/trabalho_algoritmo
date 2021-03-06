package com.tiago.melo.estruturas.utils;

public class Pessoa {
	private int id;
	private String nome;

	public Pessoa(int i, String nome) {
		this.id = i;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNaome() {
		return nome;
	}

	@Override
	public String toString() {
		return "id:" + nome + ": nome: " + nome;
	}
}
