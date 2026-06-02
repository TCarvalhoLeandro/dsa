package linked_list.main;

import linked_list.simple.SimpleLinkedList;

public class Main {

	public static void main(String[] args) {
		
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		list.print();
		System.out.println();
		list.remove(0);
		list.print();
		

	}

}
