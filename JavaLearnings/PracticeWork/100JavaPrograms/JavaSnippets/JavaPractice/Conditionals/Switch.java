package JavaPractice.Conditionals;


public class Switch{
	public static void main(String args[]){
		
		char grade = 'A';
		switch(grade)
		{
		case'A':
			System.out.println("Excellent!");
			break;
		case'B':
			System.out.println("Well done");
			break;
		case'C':
			System.out.println("You passed");
		case'D':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is "+ grade);
	}
}
