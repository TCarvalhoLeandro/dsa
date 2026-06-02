package operadores;

import java.util.Scanner;

public class _014ConversaoTemperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura (Celsius): ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println(celsius + " graus Celsius equivale a " + fahrenheit + " graus Fahrenheit.");
		
		sc.close();

	}

}
