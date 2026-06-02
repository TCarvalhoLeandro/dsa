package operadores;

public class _029PreIncrmentoPosIncremento {

	
	public static void main(String[] args) {
		
		int valorInicial = 10;
	
		System.out.println("Valor inicial = " + valorInicial);
		
		int preIncremento = ++valorInicial;
		System.out.println("Valor após pré incremento = " + preIncremento);
		
		int posIncremento = valorInicial++;
		System.out.println("Valor após pós incremento = " + posIncremento);
		
		System.out.println("Valor final após pós incremento = " + valorInicial);
		

	}

}
