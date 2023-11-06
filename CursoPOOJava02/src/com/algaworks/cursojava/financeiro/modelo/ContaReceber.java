package com.algaworks.cursojava.financeiro.modelo;


public class ContaReceber extends Conta {

	public Cliente cliente;
	
	public ContaReceber() {
		
	}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void cancelar() {
		if (this.situacaoConta.equals(SituacaoConta.PENDENTE) && valor < 50000) {
			
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Descricao da conta: " + descricao);
			System.out.println("Valor da conta: " + valor);
			System.out.println("Data de Vencimento: " + dataVencimento);
			System.out.println("Nome do cliente: " + cliente.getNome());
			System.err.println("Conta a receber cancelada com sucesso !");
			System.out.println("----------------------------------------------------------");

		} else {
			System.out.println("Descricao da conta: " + descricao);
			System.out.println("Valor da conta: " + valor);
			System.out.println("Data de Vencimento: " + dataVencimento);
			System.out.println("Nome do cliente: " + cliente.getNome());
			System.err.println("A conta a ser cancelada tem valor acima de 50 mil!");
			System.out.println("----------------------------------------------------------");
		}
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void receber() {
		
	if(this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
		System.out.println("Descricao da conta: " + descricao);
		System.out.println("Valor da conta: " + valor);
		System.out.println("Data de Vencimento: " + dataVencimento);
		System.out.println("Nome do fornecedor: " + cliente.getNome());
		System.err.println("Conta recebida com sucesso!");
		System.out.println("----------------------------------------------------------");
	} else {
		System.out.println("A conta ja foi paga ou cancelada! Verifique.");
		System.out.println("----------------------------------------------------------");
	}
}

	public void exibirDetalhes() {
		System.out.println("Descricao da conta: " + descricao);
		System.out.println("Valor da conta: " + valor);
		System.out.println("Data de Vencimento: " + dataVencimento);
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.err.println("Conta recebida com sucesso !");
		System.out.println("----------------------------------------------------------");
	}

}
