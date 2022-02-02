package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Interface;

public class Circle implements Shapesuper {
	int x;
	int y;
	double radius;
	
	public Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
}
