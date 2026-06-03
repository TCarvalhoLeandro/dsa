package java_comoProgramar.arrays.boletimNotas;

public class BoletimNotas {

	private String nomeCurso; // nome do curso
	private double[] notas; // notas do aluno

	public BoletimNotas() {
	}

	public BoletimNotas(String nomeCurso, double[] nota) {
		this.nomeCurso = nomeCurso;
		this.notas = nota;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] nota) {
		this.notas = nota;
	}
	
	public void processaNotas() {
		
		printNotas();
		
		System.out.printf("\nMaior nota: %s",  getMaiorNota());

		System.out.printf("\nMenor nota: %s",  getMenorNota());
		
		System.out.printf("\nMedia da turma: %s", getMedia());
		
		graficoBarra();
	}

	// localiza menor nota
	public String getMenorNota() {

		double menorNota = notas[0]; // assume a primeira nota como a menor
		int index = 0;

		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < menorNota) {
				menorNota = notas[i];
				index = i + 1;
			}
		}

		return "estudante " + index + " - " + menorNota;
	}

	// localiza maior nota
	public String getMaiorNota() {

		double maiorNota = notas[0]; // assume a primeira nota como a menor
		int index = 0;

		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
				index = i + 1;
			}
		}

		return "estudante " + index + " - " + maiorNota;
	}

	// calcula a media do aluno
	public String getMedia() {
		
		double sum = 0.0;
		
		for (int i = 1; i < notas.length; i++) {
			sum += notas[i];
		}
		
		double media = sum / notas.length;
		return " "+ media;
	}
	
	// gera a saida do array de notas
	public void printNotas() {
		System.out.println("As notas são: \n");
		
		for(int i = 0; i < notas.length;i++) {
			System.out.printf("Estudante %02d: %.1f\n", i + 1, notas[i]);
		}
		
	}
	
	public void graficoBarra() {
		System.out.println("\n");
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Estudante %02d ", i + 1);
			
			for(int j = 0; j < (int) notas[i]/10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

