package java_comoProgramar.arrays.baralho;

import java.util.Random;

public class Baralho {

	private static final int QUANTIDADE_CARTAS = 52;// numero de cartas
	private Carta[] cartas;// array de cartas
	private int cartaAtual; // indice da proxima carta a ser distribuída (0 - 52)
	
	private Random rand = new Random(); // gerador de numeros aleatórios

	public Baralho() {
		String[] faces = {"As", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete",
				"Oito", "Nove", "Dez", "Valete", "Rainha", "Rei"};
		String[] naipes = {"Ouros", "Copas", "Espadas", "Paus"};
		this.cartas = new Carta[QUANTIDADE_CARTAS];// cria array de Carta
		cartaAtual = 0;// primeira carta sera no cartas[0]
		
		// preenche o baralho com objetos Carta
		for(int i = 0; i < cartas.length; i++) {
			cartas[i] = new Carta(faces[i % 13], naipes[i / 13]);
		}
	}
	
	// embaralha as cartas com um algoritmo de uma passagem
	public void embaralha() {
		
		// a proxima chamada para o método ofertaCarta deve começar no baralho[0]
		cartaAtual = 0;
		
		// para cada carta, seleciona outra carta aleatoriamente e as compara
		for(int primeiraCarta = 0; primeiraCarta < cartas.length; primeiraCarta++) {
			
			// seleciona um numero aleatorio entre 0 e 51
			int segundaCarta = rand.nextInt(QUANTIDADE_CARTAS);
			
			// compara a carta Atual com a carta aleatoriamente selecionada
			Carta temp = cartas[primeiraCarta];
			cartas[primeiraCarta] = cartas[segundaCarta];
			cartas[segundaCarta] = temp;
		}
	}
	
	// distribui uma carta
	public Carta ofertaCarta() {
		// determina se ainda existe cartas a serem distribuídas
		if(cartaAtual < cartas.length) 
			return cartas[cartaAtual++];// retorna a carta Atual do array
		else
			return null;// retorna null para indicar que todas as cartas foram distribuidas
	}
	
	public void printBaralho() {
		for(Carta carta: cartas) {
			System.out.println(carta);
		}
	}
	
	
	
	
}
