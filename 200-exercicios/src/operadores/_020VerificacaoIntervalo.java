package operadores;

import java.util.Scanner;

public class _020VerificacaoIntervalo {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		
		if(num1 >= 10 && num1 <= 20) {
			System.out.println(num1 + " está entre 10 e 20.");
		}else {
			System.out.println(num1 + " não está entre 10 e 20.");
		}
		
		sc.close();

	}

}
