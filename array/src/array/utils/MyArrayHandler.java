package array.utils;

public class MyArrayHandler {

	private int[] myArray;
	private int size;

	public MyArrayHandler(int[] array) {
		// Inicializa o seu array com a capacidade exata do array que chegou
		this.myArray = new int[array.length];
		// Define que o seu "size" (itens preenchidos) é igual ao tamanho total dele
		this.size = array.length;
		// Copia os elementos um por um para dentro do seu myArray
		for (int i = 0; i < array.length; i++) {
			this.myArray[i] = array[i];
		}
	}

	public MyArrayHandler(int capacidade) {
		this.myArray = new int[capacidade];
		this.size = 0;
	}

	// Método padrão de DSA para verificar se está vazio
	public boolean isEmpty() {
		return this.size == 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void insert(int value) {
		// Verifica se o myArray encheu
		if (size == myArray.length) {
			// Cria o novo array direto, já com o dobro do tamanho
			int[] array = new int[myArray.length * 2];
			// Copia os elementos do antigo para o novo
			for (int i = 0; i < size; i++) {
				array[i] = myArray[i];
			}
			// Faz a variável da sua classe apontar para o novo array.
			// O Java Garbage Collector vai jogar o array velho fora sozinho.
			this.myArray = array;
		}
		// Insere sempre no final
		if (size < myArray.length) {
			myArray[size] = value;
			size++;
		}

	}

	public void insertAT(int index, int value) {

		// Garante que o usuário não tente inserir numa posição impossível
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Índice inválido para inserção: " + index);
		}

		// Verifica se o array encheu
		if (size == myArray.length) {
			int[] array = new int[myArray.length * 2];
			// Copia os elementos do antigo para o novo
			for (int i = 0; i < size; i++) {
				array[i] = myArray[i];
			}
			// Faz a variável da sua classe apontar para o novo array.
			// O Java Garbage Collector vai jogar o array velho fora sozinho.
			this.myArray = array;
		}

		// Começa no último elemento (size - 1) e vai descendo até chegar no index
		for (int i = size - 1; i >= index; i--) {
			myArray[i + 1] = myArray[i];
		}

		// Agora que os elementos foram movidos, o 'index' está "vazio".
		// Podemos colocar o valor novo com segurança.
		myArray[index] = value;
		// Atualiza o tamanho total
		size++;
	}

	public void deleteAt(int index, int value) {

	}

	public void update(int index, int newValue) {

	}

	public void bubbleSort() {
		// Loop de FORA: Controla quantas passadas vamos dar.
		// Vai até size - 1 para que não estoure o array
		for (int i = 0; i < size - 1; i++) {
			// Loop de DENTRO: Faz as comparações lado a lado.
			// A sacada aqui é o (size - 1 - i).
			// A cada passada, o maior número vai pro final, então não precisamos comparar o final de novo!
			for (int j = 0; j < size - 1 - i; j++) {
				if (myArray[j] > myArray[j + 1]) {
					int aux = myArray[j + 1];
					myArray[j + 1] = myArray[j];
					myArray[j] = aux;
				}
			}
		}
	}

	public void selectSort() {

	}

	public void insertSort() {

	}

	public void quickSort() {

	}

	public void mergeSort() {

	}

	public int linearSearch(int value) {
		for(int i = 0; i < size; i++) {
			if(myArray[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int binarySearch(int value) {

		return -1;
	}

	public void print() {
		System.out.print("[ ");
		for (int i = 0; i < size; i++) {
			System.out.print(this.myArray[i] + " ");
		}
		System.out.println("]");
	}

}
