package USTcodes;

public class MethodOverload2{  

	//Method 1    
	double sum(int x,double y){
	    return x+y;
	    
	}  

	//Method 2
	double sum(double x,int y){
	    return x+y;
	    
	}  

	    
	public static void main(String[] args){  
	    
		MethodOverload2 obj = new MethodOverload2();
	    
	System.out.println(obj.sum(30,30.2)); 

	System.out.println(obj.sum(50.2,20));  


	}}

