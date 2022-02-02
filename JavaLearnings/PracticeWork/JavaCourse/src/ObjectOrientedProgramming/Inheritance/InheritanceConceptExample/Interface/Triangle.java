package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Interface;

public class Triangle implements Shapesuper {
	double height;
	double width;
	double a;
	double b;
	double c;

	public Triangle(double height, double width, double a, double b, double c) {
		super();
		this.height = height;
		this.width = width;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0.5*(height*width);
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
}
