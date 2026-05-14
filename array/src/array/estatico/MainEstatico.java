package array.estatico;

import array.utils.PrintArray;

public class MainEstatico {

	public static void main(String[] args) {
	
		ArrayEstatico array = new ArrayEstatico(10);
		
		System.out.print("Array com 5 primeiros inteiros pares: ");
		PrintArray.printAll(array);
		
		System.out.print("Insere 10 ao final: ");
		array.insert(10);
		PrintArray.printAll(array);
		
		int value = array.findByIndex(3);
		System.out.println("Valor do index [3] = " + value);
		
		array.update(3, 36);
		System.out.print("Atualiza o valor do index [3] para 36: ");
		PrintArray.printAll(array);
		
		array.delete(3);
		System.out.print("Deleta o valor do indice [3]: "); 
		PrintArray.printAll(array);


	}

}
