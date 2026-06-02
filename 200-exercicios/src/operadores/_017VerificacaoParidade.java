package operadores;

import java.util.Scanner;

public class _017VerificacaoParidade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();

		if(num1 % 2 == 0) {
			System.out.println(num1 + " é par.");
		}else {
			System.out.println(num1 + " é impar.");
		}
		
		sc.close();
	}

}
