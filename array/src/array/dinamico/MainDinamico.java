package array.dinamico;

import array.utils.PrintArray;

public class MainDinamico {

	public static void main(String[] args) {
		
		ArrayDinamico array = new ArrayDinamico(5);
				
		array.insert(5);
		array.insert(15);
		array.insert(97);
		array.insert(57);
		array.insert(34);
		array.insert(36);
		PrintArray.printAll(array);
	 
		System.out.println("Valor do índice [3] =  " +  array.findByIndex(3));
		
		array.update(2, 48);
		PrintArray.printAll(array);
 
		System.out.print("Deleta o valor do index [1]: ");
		array.delete(1);
		PrintArray.printAll(array);
		System.out.print("Deleta o valor do index [3]: ");
		array.delete(3);
		PrintArray.printAll(array);
		System.out.print("Deleta o valor do index [3]: ");
		array.delete(3);
		PrintArray.printAll(array);
		System.out.println("Novo tamanho " + array.getArray().length);
		
	}

}
