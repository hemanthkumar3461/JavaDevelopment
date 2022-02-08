package Collections.QueueInterfaceFromCollectionInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

	public static void main(String[] args) {
		//Queue:
		//An ordered collection that allows adding the "back" element and removing the "Front element" 
		//This follows FIFO access principle
		//Queue can implemented using Linkedlist and priorityQueue methods present Queue interface
		String[] s = {"name1","name2","name3","name4","name5","name6"};
		
		Queue<String> queue = new LinkedList<>();
		//Add data to queue
		for(String str: s) {
			queue.add(str);
		}
		
		//Printing and analyzing the queue behavior
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		
		//Removing elements from queue
		while(!queue.isEmpty()) {
			System.out.println(queue.remove()); //It removes and returns the value from the front .
		}

	}

}
