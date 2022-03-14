package USTcodes;

public class PrivateConstructor {

	int a;
	boolean b;

	// a private constructor
	private PrivateConstructor() {
		a = 0;
		b = false;
	}

	public static void main(String[] args) {
		// call the constructor
		PrivateConstructor obj = new PrivateConstructor();

		System.out.println("Default Value:");
		System.out.println("a = " + obj.a);
		System.out.println("b = " + obj.b);
	}
}
