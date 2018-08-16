package entradadados;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Preencha corretamente os campos");
		
		String sentence = sc.nextLine();
		String x, y, z;
		
		x = sc.next(); //Pega as strings assim que o usuário der um espaço.
		y = sc.next();
		z = sc.next();
		
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();

	}

}
