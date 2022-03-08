package USTcodes;

import java.util.Scanner;

public class BasicIfElseConditional {  
	public static void main(String[] args) {  
		//defining a variable  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new number");
		int a = sc.nextInt();
		int number=a;  
		//Check if the number is divisible by 2 or not  
		if(number%2==0){  
			System.out.println("even number");  
		}else{  
			System.out.println("odd number");  
		}  
	}  
}  
