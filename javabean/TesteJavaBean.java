package javabean;

public class TesteJavaBean {

	public static void main(String[] args) {
		
		PessoaBean p = new PessoaBean();
		p.setNome("Edmilson Vasconcelos");
		p.setIdade(28);
		
		System.out.println("A pessoa " + p.getNome() +" tem "+ p.getIdade() + " anos.");
	}

}
