package construtor;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Edmilson Vasconcelos", 28);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		
		Pessoa p2 = new Pessoa("Edmilson Vasconcelos");
		
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		
	}

}
