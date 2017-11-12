package Chapter_13;

import java.util.Scanner;

import Chapter_13.ObjectClasses.Triangle;



public class Chapter13_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		System.out.println("Enter if the triangle is filled (true/false)");
		boolean filled = input.nextBoolean();
		
		Triangle triangle = new Triangle(a,b,c);
		
		triangle.setFilled(filled);
		
		System.out.println("What color is the triangle?");
		String color = input.next();
		
		triangle.setColor(color);
		
		System.out.println("The Area of the triangle is: " + triangle.getArea() + "\nThe perimeter of the triangle is: "  + triangle.getPerimeter() + "\nThe color of the triangle is: " + triangle.getColor());
		System.out.print("The triangle ");
		System.out.print(triangle.isFilled()? "is filled":"is not filled");
	}

}
