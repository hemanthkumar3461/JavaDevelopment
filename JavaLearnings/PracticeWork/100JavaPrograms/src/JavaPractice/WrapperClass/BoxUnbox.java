package JavaPractice.WrapperClass;

//All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.


public class BoxUnbox{
	public static void main(String args[]){
		Integer x =5;// boxes int to an Integer object
		x = x +10;// unboxes the Integer to a int
		System.out.println(x);
	}
}
