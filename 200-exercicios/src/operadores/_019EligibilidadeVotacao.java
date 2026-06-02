package operadores;

import java.util.Scanner;

public class _019EligibilidadeVotacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você está elegível para votar.");
		}else {
			System.out.println("Você não está elegível para votar.");
		}

		sc.close();
	}

}
