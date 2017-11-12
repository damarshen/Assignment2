package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter11_13 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter ten integers: ");
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<10; i++) {
			list.add(input.nextInt());
		}
		
		removeDuplicate(list);
		System.out.println("The distinct integers are "+list.toString());

	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for (int i=0; i<list.size()-1;i++) {
			for (int j = 1+i;j<list.size(); j++ ) {
				if (list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
	}

}
