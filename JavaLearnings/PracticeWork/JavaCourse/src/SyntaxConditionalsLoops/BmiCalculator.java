package SyntaxConditionalsLoops;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight ?");
		float weight =scanner.nextFloat();
		System.out.println("Enter your Height ?");

		float height = scanner.nextFloat();
		
		float Bmi = weight/(height*height);
		
		
		
		System.out.println("Your BMI value is = " + Bmi);
		// TODO Auto-generated method stub

	}

}
