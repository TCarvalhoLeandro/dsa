package operadores;

import java.util.Scanner;

public class _030OperadoresCompostos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		

		System.out.print("Digite um número: ");
		int num2 = sc.nextInt();
		
		int soma = num1 += num2;
		int diferenca = num1 -= num2;
		int produto = num1 *= num2;
		int quociente = num1 /= num2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Diferença = " + diferenca);
		System.out.println("Produto = " + produto);
		System.out.println("Quociente = " + quociente);
		
		sc.close();
	}

}
