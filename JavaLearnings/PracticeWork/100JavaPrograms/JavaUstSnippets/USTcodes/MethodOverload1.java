package USTcodes;

public class MethodOverload1 {  

	//Method 1    
	int sum(int x,int y){
	    return x+y;
	    
	}  

	//Method 2
	int sum(int x,int y,int z){
	    return x+y+z;
	    
	}  

	    
	public static void main(String[] args){  
	    
		MethodOverload1  obj = new MethodOverload1 ();
	    
	System.out.println(obj.sum(20,30)); 

	System.out.println(obj.sum(20,30,40));  


	}}
