package linked_list.simple;

import linked_list.no.No;

public class SimpleLinkedList {

	private No head; // primeiro nó da lista
	
	public SimpleLinkedList() {
	}
	
	public void add(int value) {
		No newNo = new No(value);
		
		// se a lista estiver vazia o novo nó é o head
		if(head == null) {
			head = newNo;
			return;
		}
		
		// se a lista não estiver vazia
		// percorre a lista até o ultimo nó
		No current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		// atualiza o ultimo nó com o novo nó
		current.setNext(newNo);
	}
	
	public void print() {
		
		No current = head;
		
		System.out.print("[ ");
		while(current.getNext() != null) {
			System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
		System.out.print("]");
	}
	
	public void remove(int alvo) {
		No atual = head; // sempre pegar a cabeça da lista como referencia
		No anterior = null; 
		
		// 1 caso:  alvo ser o primeiro elemento da lista
		if(atual.getValue() == alvo) {
			head = atual.getNext();
			return;
		}
		
		// 2 caso: a primeira ocorrência do alvo esta no meio da lista
		// Procurar o nó a ser removido, guardando o nó anterior
		while(atual != null && atual.getValue() != alvo) {
			anterior = atual; // marca o nó anterior
			atual = atual.getNext();// faz o movimento da lista pra frente (proximo)
		}
		
		// 3 caso: valor não encontrado
		if(anterior.getNext() == null) {
			System.out.println("Valor não encontrado!!");
			return;
		}
		
		anterior.setNext(atual.getNext());
		
		System.out.println("Removido com sucesso!");
		
	}
}









