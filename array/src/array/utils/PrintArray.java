package array.utils;

public class PrintArray {

	public static void printAll(EstruturaDeArray array) {
		System.out.print("[ ");
		for(int i = 0; i < array.getQuant(); i++) {
			System.out.print(array.getArray()[i] + " ");
		}
		System.out.println("]"); 
	}

}
