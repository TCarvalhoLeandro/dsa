package array.main;

import array.utils.MyArrayHandler;

public class Main {

	public static void main(String[] args) throws Exception{
		
		int[] array = {12, 45, 26, 14, 89};
		
		MyArrayHandler myArray = new MyArrayHandler(array);
		
		System.out.print("Array original: ");
		myArray.print();
		
		System.out.print("Array insert: ");
		myArray.insert(47);
		myArray.print();
		
		System.out.print("Array insertAt: ");
		myArray.insertAT(2, 15);
		myArray.insertAT(0, 8);
		myArray.print();
		
		System.out.print("Linear Search Value 45 Index: " + myArray.linearSearch(45));
		System.out.println();
		
		
		System.out.print("Sort BubleSort: ");
		myArray.bubbleSort();
		myArray.print();
	}
}
