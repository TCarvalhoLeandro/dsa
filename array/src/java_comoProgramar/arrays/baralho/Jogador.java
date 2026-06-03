package java_comoProgramar.arrays.baralho;

import java.util.Arrays;

public class Jogador {

	protected Carta[] minhasCartas = new Carta[7];
	
	public Jogador() {

	}
	public void setMinhasCartas(Carta[] minhasCartas) {
		this.minhasCartas = minhasCartas;
	}
	public Carta[] getMinhasCartas() {
		return minhasCartas;
	}

	public String toString() {
		return Arrays.toString(minhasCartas);
	}
	
}
