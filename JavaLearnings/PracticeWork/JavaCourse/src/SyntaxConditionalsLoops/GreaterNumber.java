package SyntaxConditionalsLoops;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = scanner.nextInt();
		
		System.out.println("Enter the second number");
		int b=scanner.nextInt();
		
		if(a>b) {
			System.out.println("First num is greater than second number");
		}
		else if(a<b) {
			System.out.println("First num is smaller than second number");
		}
		else {
			System.out.println("First is same as second");
		}

	}

}
