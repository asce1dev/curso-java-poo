package com.algaworks.cursojava.financeiro.modelo;

public class ContaPagar extends Conta {
		
	protected Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor,String dataVencimento) {
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento; 
	}
	
	public void pagar() {
		
		if(this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("Descricao da conta: " + descricao);
			System.out.println("Valor da conta: " + valor);
			System.out.println("Data de Vencimento: " + dataVencimento);
			System.out.println("Nome do fornecedor: " + fornecedor.getNome());
			System.err.println("Conta paga com sucesso!");
			System.out.println("----------------------------------------------------------");
			this.situacaoConta = SituacaoConta.PAGA;
		} else {
			System.out.println("A conta ja foi paga ou cancelada! Verifique.");
			System.out.println("----------------------------------------------------------");
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void exibirDetalhes() {
		System.out.println("Descricao da conta: " + descricao);
		System.out.println("Valor da conta: " + valor);
		System.out.println("Data de Vencimento: " + dataVencimento);
		System.out.println("Nome do fornecedor: " + fornecedor.getNome());
		System.err.println("Conta paga com sucesso!");
		System.out.println("----------------------------------------------------------");
	}
}
