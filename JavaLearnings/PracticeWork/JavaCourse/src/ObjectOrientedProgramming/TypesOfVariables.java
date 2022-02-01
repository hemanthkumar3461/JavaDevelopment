package ObjectOrientedProgramming;
/*3 types of variables
 * 
 *Local - Non static
 *instance - Non static
 *
 * static - static: when a variable is declared as static, then a single copy of variable is created and shared across all objects in class levels
 *It is generally used to count the number of objects created
 *static is for class, it is shared across all objects in the class
 *
 *We can create static variable, class, method, block 
 *static is used as common property for all objects across the class
 *ID can be common across all objects over the class but not name, age and phone
 */

/*
 * Local variables are defined in a block, method, constructor
 * intialisation of local variables is mandatory
 *  int k=5;
 */

/*
 * Instance are declared in a class outside any method, constructor or block
 */


/*Static variables can be accessed using class name
 * Non static can be accessed using instance of a class
 * Static variables can be accessed by static and non static methods 
 * Non static variables cant be access inside a static method
 * Static variables reduce memory used by program whereas non static dont
 * Static variables are shared among all instance of a class but not non static 
 * Static is a global variable available to all methods
 * Non static are like local variable and they can be accessed through instance of a class
 * 
 */


public class TypesOfVariables {
	
	int i =10; //instance variables
	private int age = 25;
	private static int id=0; //Static variables
	private static int eat=0;

	public static void main(String[] args) {

		int l = 25; //Local variables
		TypesOfVariables t = new TypesOfVariables();
		System.out.println(id);
		t.eat();
		t.eat();
		System.out.println(eat);

	}
	public void eat() {
		System.out.println("eating");
		eat++;
	}
	
	public TypesOfVariables() {
		id++;
	}
}
