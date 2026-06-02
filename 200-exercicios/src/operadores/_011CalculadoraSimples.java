package operadores;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _011CalculadoraSimples {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Digite um número inteiro: ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Digite um número inteiro: ");
		int num2 = Integer.parseInt(br.readLine());
		
		int soma = num1 + num2;
		int diferenca = num1 - num2;
		int produto = num1 * num2;
		int quociente = num1 / num2;
		int modulo = num1 % num2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Diferença = " + diferenca);
		System.out.println("Produto = " + produto);
		System.out.println("Quociente = " + quociente);
		System.out.println("Módulo = " + modulo);
	}

}
