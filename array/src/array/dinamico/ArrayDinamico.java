package array.dinamico;

import array.utils.EstruturaDeArray;

public class ArrayDinamico implements EstruturaDeArray{
	
	private int[] array;
	private int quant;

	public ArrayDinamico(int capacidade) {
		this.array = new int[capacidade];
		this.quant = 0;
		// cria array com os 5 primeiros numeros pares
		for(int i = 0; i < 5; i++) {
			this.array[i] = i * 2;
			this.quant++;
		}
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public void insert(int value) {
		
	}
	
	public void insertSort(int value) {
		
	}
	
	public int findByIndex(int index) {
		
		
		return -1;
	}
	public void update(int index, int value) {
		
	}
	
	public void delete(int index) {
		
	}
	
}
