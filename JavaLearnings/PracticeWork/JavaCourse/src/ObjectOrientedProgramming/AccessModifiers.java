package ObjectOrientedProgramming;

public class AccessModifiers {

	public static void main(String[] args) {
		
		String name ="Hemanth";
		double salary = 100;
		//How to add more security to your java project???
	
		
//Public is available everywhere till outside package as well
		
//Protected is available upto package level and subclass
		
//Default is available upto package level
		
//Private is restricted to class level

	}

}
/*
										Access Levels
Modifiers		class 		package		Subclass 	Outside World

Public			y             y               y          y    

Protected		y			  y       		  y          N

No modifier/    y             y               N          N
Defalut

Private         y             N               N          N

*/