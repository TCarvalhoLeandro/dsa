package array.estatico;

import array.exceptions.ArrayException;
import array.utils.EstruturaDeArray;

public class ArrayEstatico implements EstruturaDeArray{
	
	private int[] array;
	private int quant;

	public ArrayEstatico(int capacidade) {
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
	
	public int insert(int value) {
		if(this.quant > this.array.length) {
			throw new ArrayException("Array Cheio!!");
		}
		array[this.quant] = value;
		this.quant++;
		
		return quant;
	}
	
	public int findByIndex(int index) {
		if(index > this.quant || index < 0) {
			throw new ArrayException("Index inválido!!");
		}
		for(int i = 0; i < this.quant; i++) {
			if(i == index) {
				return this.array[i];
			}
		}
		return -1;
	}
	
	public void update(int index, int value) {
		if(index > this.quant || index < 0) {
			throw new ArrayException("Index inválido!!");
		}
		for(int i = 0; i < this.quant; i++) {
			if(i == index) {
				this.array[i] = value;
			}
		}
	}
	
	public void delete(int index) {
		if(index > this.quant || index < 0) {
			throw new ArrayException("Index inválido!!");
		}
		for(int i = index; i < quant - 1; i++) {
			this.array[i] = this.array[i+1];
		}
		quant--;
	}
	
	
}
