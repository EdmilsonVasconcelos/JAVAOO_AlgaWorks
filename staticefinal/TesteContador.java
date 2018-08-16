package staticefinal;

public class TesteContador {

	public static void main(String[] args) {

		/*Contador.count++;
		
		int valorDoCount = Contador.count;
		
		System.out.println("O valor: "+valorDoCount);*/
		
		Contador c = new Contador();
		c.incrementar();
		System.out.println(Contador.COUNT);
		
		Contador.COUNT++;
		System.out.println(Contador.COUNT);
		
		Contador.imprimirContador();
		
	}

}
