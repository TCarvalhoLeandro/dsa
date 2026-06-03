package java_comoProgramar.arrays;

public class PassaArrayParametro {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println("Efeitos de passar a referência para o array inteiro. ");
		System.out.println("Os valores do array original são: ");
		
		for(int obj: array) {
			System.out.print(obj + " ");
		}
		
		modificaArray(array);// passa a referencia do array
		
		System.out.println("\n\nOs valores do array modificado são:");
		// array modificado
		for(int obj: array) {
			System.out.print(obj + " ");
		}
		
		System.out.println("\n\nEfeitos da passagem do valor do elemento do array:\n"
				+ "array[3] antes de modificar o elemento: " + array[3]);
		
		modificaElemento(array[3]);

	}
	
	public static void modificaArray(int[] arrayParametro) {
		for(int i = 0; i < arrayParametro.length; i++) {
			arrayParametro[i] *= 2;
		}
	}
	
	public static void modificaElemento(int elemento) {
		elemento *= 2;
		System.out.println("Valor do elemento em modifyElement: " + elemento);
	}

}
