package USTcodes;

class Test_this1
{
   int val_a;
   int val_b;
 
    //Default constructor
   Test_this1()
    {
        val_a = 10;
        val_b = 20;
    }
 
   Test_this1 get()
    {
        return this;
    }
 
   void display()
    {
         System.out.println("val_a = " + val_a + "  val_b = " + val_b);
    }
}
 
public class ThisKeyword4{
    public static void main(String[] args)
    {
        Test_this1 object = new Test_this1();
        object.get().display();
    }
}
