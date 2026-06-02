package introducao_ao_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _07EntradaDados {

	public static void main(String[] args) throws Exception {

		lendoComBuffered();
		
		lendoComScanner();
	}
	
	

	public static void lendoComScanner() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int num1 = sc.nextInt();

		System.out.println("Digite um número inteiro: ");
		int num2 = sc.nextInt();

		int soma = num1 + num2;
		System.out.println("A soma = " + soma);

		sc.close();

	}
	
	public static void lendoComBuffered() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite um número inteiro: ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Digite um número inteiro: ");
		int num2 = Integer.parseInt(br.readLine());

		int soma = num1 + num2;
		System.out.println("A soma = " + soma);
		
	}

}
