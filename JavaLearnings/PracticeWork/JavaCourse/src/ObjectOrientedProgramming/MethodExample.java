package ObjectOrientedProgramming;

public class MethodExample {

	public static void main(String[] args)
	//There should a main method always for interpreter to execute our code
		{
		String captain = "America";
		FirstMethod();
		SecondMethod("hemanth");//Arguments are provided here
		SecondMethod(captain);
		}//end of main method
	
	//New method declared inside class and outside any other method
	public static void FirstMethod() 
	{
		System.out.println("Hey!!, This is my first method");
	}
	
	public static void SecondMethod(String name) //Parameters are accepted in user side of the function
	{
		System.out.println("" + name);
	}//Static means method belongs to main class but not an object of main class

}//end of class

