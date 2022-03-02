package Collections;

import java.util.ArrayList;
import java.util.Iterator;
//Iterable -> Collection -> List -> Arraylist
/*
 * Iterator is an object that implements the iterable interface 
 * The purpose of iterators is to provide a uniform way of accessing collection elements in sequence 
 * Iterable works with anything that implements the interface
 * Iterator is used to iterate any list or any collection type 
 *
 */
public class IterableInterface {
	public static void main(String[]args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Hello");
		arr.add("Hello hemanth");
		arr.add("Hello world");
		
		//Using iterable lets iterate a list
		Iterator<String> iterator = arr.iterator();
		while(iterator.hasNext()) {
			String obj = iterator.next();
			System.out.println(obj);
			
		}
		//YOu can use for-each for all collections 
		
		for(String s:arr) {
			System.out.println(s);
			
		}
	}
}
