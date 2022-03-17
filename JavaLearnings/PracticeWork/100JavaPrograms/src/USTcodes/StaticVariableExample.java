package USTcodes;

 public class StaticVariableExample
{
   static int count=0;
   public void increment()
   {
       count++;
   }
   public static void main(String args[])
   {
	   StaticVariableExample obj1=new StaticVariableExample();
	   StaticVariableExample obj2=new StaticVariableExample();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+obj1.count);
       System.out.println("Obj2: count is="+obj2.count);
   }
}
 //We can use static class without creating an object

