package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Conta;
public class RelatorioContas {

	public void exibirListagem(Conta[] contas) {
		System.out.println("----------------------------------");
		System.out.println("-------Relatorio de Contas--------");
		System.out.println("----------------------------------");
		System.out.println();
		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
	}
}
