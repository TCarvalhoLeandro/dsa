package java_comoProgramar.arrays;

public class GraficoBarras {

	public static void main(String[] args) {
		
		int array[] = {10, 5, 8, 7, 3, 9, 2, 6, 4, 1};
		
		System.out.println("Distribuição de notas:");
		
		for(int i = 0; i < array.length;i++) {
			// gera o intervalo de notas
			if(i == 9) {
				System.out.printf("%5d:", 100);
			}
			else {
				System.out.printf("%02d-%02d:", i * 10, i * 10 + 9); 
			}
			// gera o grafico de barras
			for(int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
