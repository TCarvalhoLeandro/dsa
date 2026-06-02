package operadores;

import java.util.Scanner;

public class _013AreaRetangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("Digite a largura do retângulo: ");
		double largura = sc.nextDouble();
		
		
		System.out.print("Digite a altura do retângulo: ");
		double altura = sc.nextDouble();
		
		double area = largura * altura;
		
		System.out.println("Área do retângulo = " + String.format("%.2f", area));
		
		sc.close();

	}

}
