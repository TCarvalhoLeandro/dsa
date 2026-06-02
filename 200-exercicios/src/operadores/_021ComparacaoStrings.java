package operadores;

import java.util.Scanner;

public class _021ComparacaoStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String string1 = sc.nextLine();
		
		System.out.print("Digite uma frase: ");
		String string2 = sc.nextLine();
		
		if(string1.equals(string2)) {
			System.out.println("As frases são iguais.");
		}else {
			System.out.println("As frases são diferentes.");
		}

		sc.close();
	}

}
