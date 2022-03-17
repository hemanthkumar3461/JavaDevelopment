package USTcodes;


 public class StaticMethodExample{
	  static int age;
	  static String name;
	  //This is a Static Method
	  static void disp(){
	      System.out.println("Age is: "+age);
	      System.out.println("Name is: "+name);
	  }
	  // This is also a static method
	  public static void main(String args[]) 
	  {
		  age = 30;
		  name = "Steve";
	      disp();
	      //No need for object when you deal with static content like class, methods and classes
	  }
	}

