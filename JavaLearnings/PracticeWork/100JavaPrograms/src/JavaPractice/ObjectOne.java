package JavaPractice;

public class ObjectOne{
	public ObjectOne(String name){
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :"+ name );
	}
	public static void main(String[]args){
		// Following statement would create an object myPuppy
		ObjectOne myPuppy =new ObjectOne("tommy");
	}
}
