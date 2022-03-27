package USTcodes;

class Teacher2 {
	void teach() {
		System.out.println("Teaching subject");
	}
}
class Student2 extends Teacher2 {
	void listen() {
		System.out.println("Listening");
	}
}
class homeTution extends Student2 {
	void explains() {
		System.out.println("Does homework");
	}
}
public class MethodOverride4 {
	public static void main(String argu[]) {
		homeTution h = new homeTution();
		h.explains();
		h.teach();
		h.listen();
	}
}
