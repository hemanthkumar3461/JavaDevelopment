package JavaPractice;

public class LocalVariable{
	public void pupAge(){ // Variable inside a method are known as local variables
		
		int age = 0; //Here age is local variable and pupAge() is the only scope where our variable age is valid 
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]){
		LocalVariable test = new LocalVariable();
		test.pupAge();
	}
}
//There are mainly 2 types of errors 1) Run time error 2) Compile time error 
//This is one of the most important classification