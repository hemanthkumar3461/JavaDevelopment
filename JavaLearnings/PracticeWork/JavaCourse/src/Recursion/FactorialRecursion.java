package Recursion;

public class FactorialRecursion {

	public static void main(String[] args) {
		long result = findFactorial(5);
		
		System.out.println("The factorial value is :" + result);

	}
	
	public static long findFactorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*findFactorial(n-1);
		}
	}
}
