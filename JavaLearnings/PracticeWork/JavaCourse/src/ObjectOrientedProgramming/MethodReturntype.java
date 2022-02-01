package ObjectOrientedProgramming;

public class MethodReturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = myMethod("Hello ");
		int result = myMethod(12,10, 10);
		int result1 = myMethod(40, 40);
		System.out.println(name);
		System.out.println(result);
		System.out.println(result1);


	}
	
	public static int myMethod(int x,int y) {
		int result = x+y;
		
		return result;
	}
	
	public static int myMethod(int x,int y,int z) {
		int result = x+y+z;
		
		return result;
	}
	
	public static String myMethod(String p) {
		String ss= p + "Hello";
		
		return ss;
	}

}
