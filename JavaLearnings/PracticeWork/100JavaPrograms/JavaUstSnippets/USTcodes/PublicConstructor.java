package USTcodes;


public class PublicConstructor{
	String name;

	// public constructor
	public PublicConstructor() {
		name = "ABC";
	}
}

class Main {
	public static void main(String[] args) {

		// object is created in another class
		PublicConstructor obj = new PublicConstructor();
		System.out.println("Company name = " + obj.name);
	}
}
