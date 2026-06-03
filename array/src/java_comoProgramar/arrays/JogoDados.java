package java_comoProgramar.arrays;

import java.util.Random;

public class JogoDados {

	public static void main(String[] args) {
		
		Random random = new Random();// aleatorizar as jogadas
		int frequencia[] = new int[7];// contar a frequencia de faces
		
		// rola o dado e incrementa 1 na face resultado
		for(int i = 1; i < 6000000; i++) {
			++frequencia[1 + random.nextInt(6)];
		}
		
		// mostra resultado
		System.out.printf("%s%13s\n", "Face", "Frequência");
		
		for(int j = 1; j < frequencia.length; j++) {
			System.out.printf("%d%13d\n", j, frequencia[j]);
		}
	}

}
