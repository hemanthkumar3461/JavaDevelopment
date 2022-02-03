package Arraylist;


import java.util.ArrayList;

public class BoxingUnboxing {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		 //int x = 10; 
		 //Integer y = new Integer("10");
		 //Integer z = y.intValue();
		 
		Integer k = 15;//Advanced -->Wrapping into object
		arr.add(k);
		arr.add(21);
		//arr.add(2);
		/*
		 * int x = 10; 
		 * Integer y = new Integer("10");
		 * Integer z = y.intValue(); --> Wrapping out - Conversion from Object to primitive type
		 */
		
		//Understanding Boxing and Unboxing
		int n = 15;	
		arr.add(n); // This possible in java because each integer is simply wrapped up as an object
		//This will convert int into corresponding integer object
		//Boxing is conversion of primitive data into wrapper object
		System.out.println(arr);
		
		
		
		
		//Unboxing is conversion of object type into primitive datatype
		int x = arr.get(0); // This is known as unboxing, here we are converting object which wrapped to primitive data type by unwrapping
		
	}

}
