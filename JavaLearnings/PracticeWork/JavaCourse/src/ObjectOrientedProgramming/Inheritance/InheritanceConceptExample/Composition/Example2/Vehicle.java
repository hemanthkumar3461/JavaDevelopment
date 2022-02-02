package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example2;

public class Vehicle {
	int modelYear;
	String companyName;
	
	public int calculatePrice() {
		return 10000;
	}

	public Vehicle(int modelYear, String companyName) {
		super();
		this.modelYear = modelYear;
		this.companyName = companyName;
	}
	
	
}
