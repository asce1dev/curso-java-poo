package com.algaworks.cursojava.financeiro.modelo;

public abstract class Conta {

	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() {
		if (this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Descricao da conta: " + descricao);
			System.out.println("Valor da conta: " + valor);
			System.out.println("Data de Vencimento: " + dataVencimento);
			System.err.println("Conta cancelada com sucesso!");
			System.out.println("----------------------------------------------------------");
		} else {
			System.err.println("So e possivel cancelar uma conta pendente! Verifique");
			System.out.println("----------------------------------------------------------");
		}
	}
	
	public abstract void exibirDetalhes();
	
}
