package desafiothiscontrutorjavabean;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	ContaReceber(){
		
	}
	
	ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode receber uma conta que j� est� paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("N�o pode receber uma conta que est� cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente " + this.getCliente().getNome() + ".");
				
			// altera situa��o da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public void cancelar() {
		if(super.getValor() > 50000) {
			System.out.println("N�o podemos fazer o cancelamento da conta");
		}
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
 
}
