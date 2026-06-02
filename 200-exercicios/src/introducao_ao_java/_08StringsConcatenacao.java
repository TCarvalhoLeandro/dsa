package introducao_ao_java;

import java.util.Scanner;

public class _08StringsConcatenacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		//sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();

		System.out.println("Bem vindo " + nome + " " + sobrenome + "!");
		
		sc.close();
	}

}
