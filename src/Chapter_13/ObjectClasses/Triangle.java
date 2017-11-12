package Chapter_13.ObjectClasses;

public class Triangle extends GeometricObject {
	private double side1 =1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle() {
		 side1 = 1.0;
		 side2 = 1.0;
		 side3 = 1.0;
	}

	public Triangle (double a, double b, double c) {
		side1 = a;
		side2 = b;
		side3 = c;
	}
		
	@Override
	public double getArea() {
		double area;
		double s = .5 * (side1 + side2 + side3);
	    area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	    return area;	
	}

	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter(); 
	}

}
