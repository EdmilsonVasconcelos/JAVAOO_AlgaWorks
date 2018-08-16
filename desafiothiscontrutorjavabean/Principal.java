package desafiothiscontrutorjavabean;

public class Principal {

	public static void main(String[] args) {
		/*Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();*/
		
	/*	Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		
		// pagamento de conta pendente (ok, deve funcionar)
		conta1.pagar();
		
		// tentativa de pagar uma conta cancelada (não deve aceitar pagamento)
		conta2.cancelar();
		conta2.pagar();
		
		// tentativa de pagar uma conta duas vezes (não deve aceitar na segunda vez)
		conta3.pagar();
		conta3.pagar();*/
		
		// instanciando fornecedores
				Fornecedor imobiliaria = new Fornecedor();
				imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
				Fornecedor mercado = new Fornecedor();
				mercado.setNome("Mercado do João");
				
				// instanciando clientes
				Cliente atacadista = new Cliente();
				atacadista.setNome("Triângulo Quadrado Atacadista");
				Cliente telecom = new Cliente();
				telecom.setNome("FoneNet Telecomunicações");
				
				// instanciando contas a pagar
				ContaPagar contaPagar1 = new ContaPagar();
				contaPagar1.setDescricao("Aluguel da matriz");
				contaPagar1.setValor(1230d);
				contaPagar1.setDataVencimento("10/05/2012");
				contaPagar1.setFornecedor(imobiliaria);
				
				ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
				
				// instanciando contas a receber
				ContaReceber contaReceber1 = new ContaReceber();
				contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
				contaReceber1.setValor(89500d);
				contaReceber1.setDataVencimento("23/05/2012");
				contaReceber1.setCliente(atacadista);
				
				ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 
					53200d, "13/05/2012");
				
				// pagamento e cancelamento de contas a pagar
				contaPagar1.pagar();
				contaPagar2.cancelar();

				// recebimento e cancelamento de contas a receber
				contaReceber1.receber();
				contaReceber2.cancelar();
		
		
	}

}
