package Chapter_11;

import java.util.Scanner;

import Chapter_11.objectClasses.MyStack;

public class Chapter11_10 {

	public static void main(String[] args) {
		
		MyStack testStack = new MyStack();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five Strings");
		
		for (int i=0; i<5; i++) {
			testStack.push(input.nextLine());
		}
		
		System.out.println(testStack.toString());

	}

}
