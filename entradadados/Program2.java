package entradadados;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//nextLine() para a execução assim que quebra a linha, por isso devemos criar um vazio pra ele ler o outro
		
		int n1 = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.next().charAt(0); //next() retorna String, o chartAt vai pegar o primeiro caractere
		
		//b5
		
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		
		//4.32
		double n2 = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		
		sc.close();
		
	}

}
