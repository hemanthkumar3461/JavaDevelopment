package Collections.SetInterfaceFromCollectionInterface;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LotterySetProject {
	public static final int NUMBERS = 6;
	public static final int MAX_NUMBERS = 40;
	public static final int PRIZE = 100;
	
	public static void main(String[] args) {
		
		// Getting winning number and ticket sets
		Set<Integer> winning = createWinningNumbers();
		Set<Integer> ticket = getTicket();
		
		//Keeping only winning numbers from users ticket
		Set<Integer> matches = new TreeSet(ticket);
		matches.retainAll(winning);
		
		System.out.println(ticket + "Is your ticket");
		System.out.println(winning + "Winning numbers");
		if(matches.size()>0) {
			double prize = PRIZE * Math.pow(2, matches.size());
			System.out.println("Matched numbers: " + matches);
			System.out.println("Your prize is " + prize);
			  
		}
		
		
		

	}
	//Method - 1 : Generates a set of the winning lotto numbers
	public static Set<Integer> createWinningNumbers(){
		Set<Integer> winning = new TreeSet();
		Random random = new Random();
		
		while(winning.size()<NUMBERS) {
			int number = random.nextInt(MAX_NUMBERS)+1;
			winning.add(number);
		}
		return winning;
	}
	
	//Method 2 : Reading the player's  lottery ticket from the console
	public static Set<Integer> getTicket(){
		Set<Integer> ticket = new TreeSet<>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter" + NUMBERS + " Lotto numbers :");
		
		while(ticket.size()<NUMBERS) {
			int number = scanner.nextInt();
			if(number<=MAX_NUMBERS)
			ticket.add(number);
			
		}
		return ticket;
		
		
		
 	}
	
	

}
