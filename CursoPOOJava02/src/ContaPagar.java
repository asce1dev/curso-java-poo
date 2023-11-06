
public class ContaPagar {

	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	public ContaPagar() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor,String dataVencimento) {
		this();
		
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento; 
	}
	
	void pagar() {
		
		if(this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			System.out.println("Descricao da conta: " + descricao);
			System.out.println("Valor da conta: " + valor);
			System.out.println("Data de Vencimento: " + dataVencimento);
			System.out.println("Nome do fornecedor: " + fornecedor.getNome());
			System.out.println("----------------------------------------------------------");
			System.out.println("Conta paga com sucesso!");
			this.situacaoConta = SituacaoConta.PAGA;
		} else {
			System.out.println("A conta ja foi paga ou cancelada! Verifique.");
		}
		System.out.println("----------------------------------------------------------");
	}
	
	public void cancelar() {
		if (this.situacaoConta.equals(SituacaoConta.PENDENTE)) {
			
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Conta cancelada com sucesso!");
			System.out.println("----------------------------------------------------------");
		} else {
			System.err.println("So e possivel cancelar uma conta pendente! Verifique");
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
}
