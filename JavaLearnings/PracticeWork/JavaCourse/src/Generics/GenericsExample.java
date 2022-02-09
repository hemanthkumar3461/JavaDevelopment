package Generics;
//In order overcome the disadvantage of this way of programming we need use generics for implementing  code reusability
public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcome("Hi");
		Welcome(2);
		Welcome(true);
	}
	
	public static void Welcome(String i) {
		System.out.println(i);
	}
	
	public static void Welcome(int i) {
		System.out.println(i);
	}
	
	public static void Welcome(boolean i) {
		System.out.println(i);
	}

}
