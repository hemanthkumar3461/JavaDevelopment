package USTcodes;

class Human{//Parent class
	//Overridden method
	public void eat()
	{
		System.out.println("Human is eating");
	}
}
class Boy extends Human{//Child class
	//Overriding method
	public void eat(){
		System.out.println("Boy is eating");
	}
	public static void main( String args[]) {
		Boy obj = new Boy();
		//This will call the child class version of eat() by overriding the eat() method parent class by default 
		obj.eat();
	}
}
