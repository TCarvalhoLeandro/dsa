package operadores;

import java.util.Scanner;

public class _025VerificacaoPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número : ");
		int num1 = sc.nextInt();

		System.out.print("Digite um número: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite um número: ");
		int num3 = sc.nextInt();
		
		int nums = 0;

		if(num1 > 0) nums++;
		if(num2 > 0) nums++;
		if(num3 > 0) nums++;
		
		if(nums >= 2) {
			System.out.println("Pelo menos 2 números são positivos.");
		}else if(nums >= 1) {
			System.out.println("Pelo menos 1 número é positivo.");
		}else {
			System.out.println("Nenhum número é positivo");
		}
		
		sc.close();
	}

}
