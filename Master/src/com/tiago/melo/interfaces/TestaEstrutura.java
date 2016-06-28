package com.tiago.melo.interfaces;

public interface TestaEstrutura {
	
	/**
	 * Cria estrutura com Tipo Integer
	 * 
	 * @param tamanho tamanho da estrutura gerada
	 */
	public void geraEstruturaDefault(int tamanho);

	/**
	 * Cria estrutura com tipo de dado customizado usando
	 * classe Pessoa
	 * 
	 * @param tamanho tamanho da estrutura gerada
	 */
	public void geraEstruturaCustomizada(int tamanho);
	
	public void adicionaTempoDeExecucao();
}
