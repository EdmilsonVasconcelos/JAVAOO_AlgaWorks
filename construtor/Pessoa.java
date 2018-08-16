package construtor;

public class Pessoa {
	
	String nome;
	int idade;
	
	Pessoa(String nome){
		this.nome = nome;
	}
	
	Pessoa(String nome, int idade){
		this(nome); //Chamando o construtor sem precisar copiar c�digo do construtor de cima para o de baixo e deve ser a primeira instru��o
		this.idade = idade;
	}

}
