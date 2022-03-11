package USTcodes;


public class BasicIncDecOperator{
	public static void main(String args[]){
		int i = 5, j = 5, sum = 0;

		System.out.println("Value of i is " + i + ", j is " + j +" and sum is " + sum);
		sum = i + j--;
		System.out.println("Value of i is " + i + ", j is " + j +" and sum is " + sum);
	}
}
