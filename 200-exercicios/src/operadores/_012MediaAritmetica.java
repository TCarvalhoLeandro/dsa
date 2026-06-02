package operadores;

import java.util.Scanner;

public class _012MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("Digite um número inteiro: ");
		int num2 = sc.nextInt();
		System.out.print("Digite um número inteiro: ");
		int num3 = sc.nextInt();
		
		double media = (num1 + num2 + num3) / 3.0;
		
		System.out.println("Média aritmética = " + String.format("%.2f", media) );
		
		sc.close();
	}

}
