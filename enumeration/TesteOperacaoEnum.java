package enumeration;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		
		//System.out.println(OperacaoAritmetica.ADICAO.operacao(2, 2));
		//System.out.println(OperacaoAritmetica.SUBTRACAO.operacao(2, 2));
		
		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " --> " + oa.operacao(2, 2));
		}

	}

}
