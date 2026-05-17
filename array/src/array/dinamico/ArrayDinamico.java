package array.dinamico;

import array.exceptions.ArrayException;
import array.utils.EstruturaDeArray;

public class ArrayDinamico implements EstruturaDeArray{
	
	
	private int[] array;
	private int quant;

	public ArrayDinamico(int capacidade) {
		this.array = new int[capacidade];
		this.quant = 0;
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
		if(this.quant >= this.array.length) {
			int[] newArray = new int[quant * 2];
			for(int i = 0; i < quant; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			System.out.print("Novo tamanho " +  array.length + ": ");
		}
		this.array[quant] = value;
		quant++;
	}
	
	public int findByIndex(int index) {
		if( index < 0 || index >= this.quant) {
			throw new ArrayException("Indice inválido!");
		}
		for(int i = 0; i < this.quant; i++) {
			if(index == i) {
				return this.array[i];
			}
		}
		
		return -1;
	}
	
	public void update(int index, int value) {
		if( index < 0 || index >= this.quant) {
			throw new ArrayException("Indice inválido!");
		}
		for(int i = 0; i < this.quant; i++) {
			if(index == i) {
				this.array[i] = value;
			}
		}
		System.out.print("Atualiza o índice " + "[" + index + "] " + "para " + value + ": ");
	}
	
	public void delete(int index) {
		if( index < 0 || index >= this.quant) {
			throw new ArrayException("Indice inválido!");
		}
		for(int i = index; i < quant; i++) {
			this.array[i] = this.array[i+1];
		}
		quant--;
		
		if(quant == this.array.length / 3) {
			int[] newArray = new int[this.array.length / 2];
			for(int i = 0; i < quant; i++) {
				newArray[i] = this.array[i];
			}
			array = newArray;
			
		}
	}
	
}
