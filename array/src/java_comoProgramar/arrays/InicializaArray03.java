package java_comoProgramar.arrays;

public class InicializaArray03 {

	public static void main(String[] args) {
		
		final int TAMANHO = 10; // constante
		
		int array[] = new int[TAMANHO];
		
		for(int i = 0; i < TAMANHO; i++) {
			array[i] = 2 + 2 * i; 
		}
		
		for(int i = 0; i < TAMANHO; i++) {
			System.out.println(array[i]); 
		}

	}

}
