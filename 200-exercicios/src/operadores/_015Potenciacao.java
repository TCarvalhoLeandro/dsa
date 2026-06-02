package operadores;

import java.util.Scanner;

public class _015Potenciacao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		int base = sc.nextInt();
		System.out.print("Digite o expoente: ");
		int expoente = sc.nextInt();

		double potencia = Math.pow(base, expoente);
		
		System.out.println(base + " elevado a " + expoente + " = " + String.format("%.0f", potencia) );
		
		sc.close();
	}

}
