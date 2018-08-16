package herancaemodificadorprotected;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Jogador j = new Jogador();
		j.nome = "Edmilson Vasconcelos";
		j.idade = 33;
		
		//System.out.println(j.nome);
		//System.out.println(j.idade);
		
		j.seApresentar();
		
		j.aindaJoga = true;
		j.dizerSeAindaJoga();
		
	}

}
