package ObjectOrientedProgramming.Inheritance.InheritanceConceptExample.Composition.Example2;

public class Engine {
	int productionyear;
	String manufacturingCompany;
	
	public int setMaxRoation() {
		return 5000;
	}

	public Engine(int productionyear, String manufacturingCompany) {
		super();
		this.productionyear = productionyear;
		this.manufacturingCompany = manufacturingCompany;
	}
}
