package JavaPractice.AccessModifiers;


public class Private{
	
	private String format;//This is an instance variable
	
	
	public String getFormat(){//In order to use this software
		
		return this.format;
	}
	public void setFormat(String format){
		this.format = format;
	}
}
//Methods, variables and constructors that are declared private can accessed within the declared class itself.
//Class and interfaces cannot be private.
//Variables that are declared private can be accessed outside the class if public getter and setter methods are present in the class.
//Using the private modifier is the main way that an object encapsulates itself and hide data from the outside world
//We can only access this format variable outside class using getter and setter methods