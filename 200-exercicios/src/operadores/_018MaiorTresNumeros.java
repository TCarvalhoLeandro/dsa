package operadores;

import java.util.Scanner;

public class _018MaiorTresNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();

		System.out.print("Digite um número inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite um número inteiro: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior número.");
		}else if(num2 > num3) {
			System.out.println(num2 + " é o maior número.");
		}else {
			System.out.println(num3 + " é o maior número.");
		}
		
		sc.close();
	}

}
