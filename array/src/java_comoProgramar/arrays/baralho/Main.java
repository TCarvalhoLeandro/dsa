package java_comoProgramar.arrays.baralho;

public class Main {

	public static void main(String[] args) {
		
		Baralho baralho = new Baralho();
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		Jogador jogador3 = new Jogador();
		Jogador jogador4 = new Jogador();
		
		baralho.embaralha();
		
		for(int i = 0; i < jogador1.getMinhasCartas().length; i ++) {
			jogador1.minhasCartas[i] = baralho.ofertaCarta();
			jogador2.minhasCartas[i] = baralho.ofertaCarta();
			jogador3.minhasCartas[i] = baralho.ofertaCarta();
			jogador4.minhasCartas[i] = baralho.ofertaCarta();
		}
	
		System.out.println(jogador1);
		System.out.println(jogador2);
		System.out.println(jogador3);
		System.out.println(jogador4);
		

	}

}
