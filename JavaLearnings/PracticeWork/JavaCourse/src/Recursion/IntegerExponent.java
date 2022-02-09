package Recursion;

public class IntegerExponent {

	public static void main(String[] args) {
	int result = CalculatePower(2,2);//(Base , Exponent(power))
	/*
	 * 
	 * pow(2,3)
	 * 2 * pow(2,2) 
	 * 2 * pow(2,2)
	 * 2 * 2 * pow(2,1)
	 * 
	 */
	System.out.println("The power is "+ result);
	
	}
	
	public static int CalculatePower(int x, int y) {
		if(y==0) {
			return 1;
		}else {
			return x*CalculatePower(x, y-1);
		}
		
	}

}
