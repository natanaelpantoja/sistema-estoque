package br.com.caelum.estoque.integration;

import br.com.caelum.estoque.model.Movimentacao;

public class MessageHandler {
	
	public Movimentacao handler(Movimentacao movimentacao) {
		System.out.println("Roteando movimenta����o: "+movimentacao);
		return movimentacao;
	}
}
