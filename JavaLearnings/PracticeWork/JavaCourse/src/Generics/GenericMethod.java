package Generics;
//Creating generic constructor is also possible
public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcome("Hi");
		Welcome(2);
		Welcome(true);
	}

	public static <T> void Welcome(T t){
		System.out.println(t);
	}
	
	
	/*	
	public static void Welcome(String i) {
		System.out.println(i);
	}
	
	public static void Welcome(int i) {
		System.out.println(i);
	}
	
	public static void Welcome(boolean i) {
		System.out.println(i);*/
	

}





