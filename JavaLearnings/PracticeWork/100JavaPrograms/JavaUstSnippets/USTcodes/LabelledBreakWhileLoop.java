package USTcodes;



public class LabelledBreakWhileLoop{
	
	public static void main(String[] args)
	{

		int i=7;

		loop1:
			while(i<20)
			{	
				if(i==10)
					break loop1;

				System.out.println("i ="+i); 
				i++;
			}

		System.out.println("Out of the loop");

	} //main method ends

} //class ends