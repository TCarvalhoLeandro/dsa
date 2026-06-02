package introducao_ao_java;

public class _10FormatacaoSaida {

	public static void main(String[] args) {
	
		double valorDecimal = 452.9867;
		
		System.out.println("Valor com 2 casas decimais: " + String.format("%.2f", valorDecimal));
		
		System.out.printf("Valor com 3 casas decimais: %.3f", valorDecimal);

	}

}
