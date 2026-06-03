package java_comoProgramar.arrays;

/*
Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 a qualidade 
da comida no refeitório estudantil, com 1 sendo “horrível” e 5 sendo “excelente”.
Coloque as 20 respostas em um array de inteiros e determine a frequência de cada
classificação.
*/
public class EnqueteEstudantil {

	public static void main(String[] args) {

		int[] respostas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5 };
		int[] enquete = new int[6];
		
		for(int i = 1; i < respostas.length; i++) {
			++enquete[respostas[i]]; 
		}
		
		//System.out.printf("%-9s: \n%-9s: \n%-9s: \n%-9s: \n%-9s: \n", "Péssimo", "Ruim", "Razoável", "Bom", "Ótimo");
		for(int j = 1; j < enquete.length; j++) {
			if(j == 1)
				System.out.printf("%-9s: %d\n", "Péssimo", enquete[j]);
			if(j == 2)
				System.out.printf("%-9s: %d\n", "Ruim", enquete[j]);
			if(j == 3)
				System.out.printf("%-9s: %d\n", "Razoável", enquete[j]);
			if(j == 4)
				System.out.printf("%-9s: %d\n", "Bom", enquete[j]);
			if(j == 5)
				System.out.printf("%-9s: %d\n", "Ótimo", enquete[j]);
		}
	}

}
