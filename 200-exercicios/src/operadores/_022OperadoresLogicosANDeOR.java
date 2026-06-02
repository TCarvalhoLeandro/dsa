package operadores;

import java.util.Scanner;

public class _022OperadoresLogicosANDeOR {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num1 = sc.nextInt();

		System.out.print("Digite um número inteiro: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite um número inteiro: ");
		int num3 = sc.nextInt();
		
		if(num1 > 10 || num2 > 10 || num3 > 10) {
			System.out.println("Pelo menos um é maior que 10");
		}else {
			System.out.println("Nenhum é maior que 10.");
		}
		
		if(num1 > 10 && num2 > 10 && num3 > 10) {
			System.out.println("Todos são maiores que 10.");
		}else {
			System.out.println("Nem todos é maior que 10.");
		}
		
		sc.close();

	}

}
