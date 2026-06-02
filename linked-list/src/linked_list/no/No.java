package linked_list.no;

public class No {
	
	private int value;// o valor armazenado dentro do nó 
	private No next;// a referencia para o proximo nó da lista
	
	public No(int value) {
		this.value = value;
		this.next = null; // por padrao , o proximo nó é nulo ate que seja conectado
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public No getNext() {
		return next;
	}

	public void setNext(No next) {
		this.next = next;
	}
	
	
}
