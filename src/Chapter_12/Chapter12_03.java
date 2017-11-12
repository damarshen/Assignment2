package Chapter_12;

import java.util.*;
public class Chapter12_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Enter an index of the array: ");
		int index = input.nextInt();
		try {
			System.out.println("The the value of index " + index + " is: " + array[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Out of Bounds");
		}
		
		
	}

	

}
