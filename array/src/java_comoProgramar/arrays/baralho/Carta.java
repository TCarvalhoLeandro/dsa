package java_comoProgramar.arrays.baralho;

public class Carta {

	private  String face = "";// face da carta (As, 2, 3, 4, 5, 6, 7, 8, 9, 10, valete, dama, rei) 
	private  String naipe = "";// naipe da carta( copas, ouros, espadas e paus)
	
	public Carta(String face, String naipe) {
		super();
		this.face = face;
		this.naipe = naipe;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	public String toString() {
		return face + " de " + naipe;
	}

}
