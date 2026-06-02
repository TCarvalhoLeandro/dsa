package operadores;

import java.util.Scanner;

public class _028SomaAcumulada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;

		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		soma += num1;

		System.out.print("Digite um número: ");
		int num2 = sc.nextInt();
		soma += num2;
		
		System.out.print("Digite um número: ");
		int num3 = sc.nextInt();
		soma += num3;
		
		System.out.print("Digite um número: ");
		int num4 = sc.nextInt();
		soma += num4;
		
		System.out.print("Digite um número: ");
		int num5 = sc.nextInt();
		soma += num5;
		
		System.out.println("Soma total = " + soma);
		
		sc.close();

	}

}
