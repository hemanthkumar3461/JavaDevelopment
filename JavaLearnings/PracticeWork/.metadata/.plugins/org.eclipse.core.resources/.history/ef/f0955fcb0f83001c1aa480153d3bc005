package SyntaxConditionalsLoops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number till which you want prime");
		
		int a =scanner.nextInt();
		String primeNumbers = "";
		int num = 0;
		
		for(int i =1; i<=a; i++) {
			
			int count = 0;
			for(num =i; num>=1; num--) {
				if(i%num ==0) {
					count++;
				}
				}
			if(count ==2) {
				primeNumbers = primeNumbers + i + " ";
				
			}
		}
		System.out.println("Prime are " + primeNumbers);

	}

}
