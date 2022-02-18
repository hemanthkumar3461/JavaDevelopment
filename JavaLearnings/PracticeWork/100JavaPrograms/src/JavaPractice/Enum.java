package JavaPractice;

//Enums restrict a variable to have one of only a predefined values
//If we consider the Juice glass example, we have only 3 sizes available. No other size can be ordered

class FreshJuice
{
	enum FreshJuiceSize{ SMALL, MEDUIM, LARGE }
	FreshJuiceSize size;
}
public class Enum{
	public static void main(String args[]){
		FreshJuice juice =new FreshJuice();
		juice.size =FreshJuice.FreshJuiceSize.MEDUIM ;
		System.out.println(juice.size);
	}
}
// enums can be declared as their own or inside a class. Methods, variables, constructors can be defined inside enums as well.