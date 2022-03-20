package USTcodes;

class Teacher {
	void teach() {
		System.out.println("Teaching subjects");
	}
}
class Students extends Teacher {
	void listen() {
		System.out.println("Listening to teacher");
	}
}
public class MethodOverride3 {
	public static void main(String args[]) {
		Students s1 = new Students();
		s1.teach();
		s1.listen();
	}
}
