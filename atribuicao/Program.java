package atribuicao;

public class Program {

	public static void main(String[] args) {
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("--------------------");
		
		n1 *= 2;
		
		System.out.println(n1);
		
		n2 += n1;
		
		System.out.println(n2);
		
		s += s; //concatenação de String
		
		System.out.println(s);
		
		int a = 10;
		int b = a++;
		int c = a++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
