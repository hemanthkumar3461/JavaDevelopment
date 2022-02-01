package ObjectOrientedProgramming;
//Inheritance share code between classes so that code reusability is present

class Vehicle{
	protected String brand = "ford";
	public void honk() {
		System.out.println("BEEEEEEEEEEEEEEP");
	}
}


public class Inheritance extends Vehicle {
	private String model = "Mustang";
	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		
		
		
		System.out.println(i.model + " " +i.brand);
		i.honk();

	}

}
//Follow car and vehicle class