package ObjectOrientedProgramming.Inheritance;

public class Polymorphism {
	String name = "heman";
	
	public Polymorphism(String name) {
		this.name = name;
		
	}
	public Polymorphism() {
		
		
	}
	//Method overloading is happening using the above parameterized constructors
	public static void main(String[] args) {
	Employee[] emp = new Employee[10];
	//emp[0] = Writer;
	
	Employee e1 = new Lawyer();
	Employee e2 = new Writer();
	Employee e3 = new JuniorWritter();
	//Here the subclass can be sent into parent class
	//Lawyer class is a subclass of employee class
	
	System.out.println(e1.getHolidays());
	System.out.println(e1.getHours());
	System.out.println(e1.getSalary());
	System.out.println(((Lawyer)e1).getClients());
	
	System.out.println(e2.getHolidays());
	System.out.println(e2.getHours());
	System.out.println(e2.getSalary());
	System.out.println(((Writer)e2).booksOver());
	System.out.println(((Writer)e2).costBook());

	//Only Employee class/parent class methods are available to use	
	//How to use Writer / Lawyer / Juniorwriter specific methods
	System.out.println(e3.getHolidays());
	System.out.println(e3.getHours());
	System.out.println(e3.getSalary());
	System.out.println(((Writer)e3).booksOver());
	System.out.println(((Writer)e3).costBook());
	System.out.println(((JuniorWritter)e3).booksOver());
	System.out.println(((JuniorWritter)e3).costBook());
	System.out.println(((JuniorWritter)e3).pagePrint());
	
	//More about objects
	Polymorphism p1 = new Polymorphism("John");
	Polymorphism p2 = new Polymorphism("John");
	Polymorphism p3 = new Polymorphism();
	p3=p2;
	System.out.println(p1.equals(p2));
	System.out.println(p2.equals(p3));
	//Object references/states are compared but not the values of objects
	
	
	
	}
}
//Code will actually behave differently depending on which type of object is used because each subclass overrides and changes some of the behavior of the superclass
//Get different from different object
//The ability of same code to be used with several different types of objects is called polymorphism