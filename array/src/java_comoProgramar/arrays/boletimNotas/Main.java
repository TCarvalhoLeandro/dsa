package java_comoProgramar.arrays.boletimNotas;

public class Main {

	public static void main(String[] args) {
		
		double[] notas = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		BoletimNotas boletim = new BoletimNotas("Java - Como Programar", notas);
		
		boletim.processaNotas();
	}

}
