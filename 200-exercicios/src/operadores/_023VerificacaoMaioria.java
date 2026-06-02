package operadores;

import java.util.Scanner;

public class _023VerificacaoMaioria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira idade : ");
		int idade1 = sc.nextInt();

		System.out.print("Digite a segunda idade: ");
		int idade2 = sc.nextInt();
		
		System.out.print("Digite a terceira idade: ");
		int idade3 = sc.nextInt();
		
		int maior18 = 0;
		
		if(idade1 >= 18) maior18++;
		if(idade2 >= 18) maior18++;
		if(idade3 >= 18) maior18++;
		
		if(maior18 >= 2) {
			System.out.println("Pelo menos 2 idades são maiores ou iguais a 18.");
		}else if(maior18 >= 1){
			System.out.println("Pelo menos 1 idade é maior ou igual a 18.");
		}else{
			System.out.println("Nenhuma idade é maior ou igual a 18.");
		}
		
		sc.close();
	}

}
