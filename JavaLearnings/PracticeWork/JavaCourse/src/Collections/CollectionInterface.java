package Collections;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection interface extends iterable interface, All methods of iterable are available for collection interface for use
 * Map does not extend collection interface.So we can not use its methods
 * Arrylist inherits and implements the list interface and list interface extends collection interface so the add method is available for us
 * 
 * 
 * 
 * 
 * 
 */
public class CollectionInterface {

	public static void main(String[] args) {
		//Collection: Since it is an interface we can directly implement
		//Collection is an interface while collections is a class
		
		Collection<String> bestApps = new ArrayList<>();
		bestApps.add("Master");
		bestApps.add("Master1");
		bestApps.add("Master2");
		bestApps.add("Master3");
		System.out.println(bestApps.toString());
		
	}

}
