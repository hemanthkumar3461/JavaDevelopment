package USTcodes;

/*The this keyword refers to the current object in a method or constructor. 
The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name*/ 

/*this can be used to:
•	Invoke current class constructor
•	Invoke current class method
•	Return the current class object
•	Pass an argument in the method call
•	Pass an argument in the constructor call
*/


class this_Test//Another class
{
     int val1;
     int val2;//Class variables
 
    // Parameterized constructor
    this_Test(int val1, int val2)//Constructor
    {
        this.val1 = val1 + val1;//Left expression is saying this.val1 is belongs to class variable
        this.val2 = val2 + val2;
    }
 
   void display()//Method
    {
          System.out.println("Value val1 = " + val1 + " Value val2 = " + val2);
    }
}

 
public class ThisKeyword1{//This is our main class
 
       public static void main(String[] args)
       {
            this_Test object = new this_Test(5,10);
            object.display();
       }
}

