package Generics;

public class GenericClass {

	public static void main(String[] args) {
		/*
		 * GenericClassExample g = new GenericClassExample(); g.setT("Passing");
		 * 
		 * 
		 * String str =(String) g.getT(); System.out.println(str);
		 */
		
		//int test = (int) g.getT();
		
		
		//Generic class
		GenericClassExample<String> g = new GenericClassExample<String>();
		
		g.setT("Hello"); // Type safety is added and avoid the typecasting
		System.out.println(g.getT());
		
	}

}


