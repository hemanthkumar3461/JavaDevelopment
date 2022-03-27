package USTcodes;
/*
* int[] arr1 = { 1, 2, 77 };
* 
* //Initialize with 10 zeroes int[] arr2 = new int[10];
* 
* //General form int[] arr3 = new int[] { 1, 2, 77 };

*/



class BasicArrayLooping{
	 public static void main(String[] args) {
	  
	   // create an array
	   int[] age = {12, 4, 5};

	   // loop through the array
	   // using for loop
	   System.out.println("Using for Loop:");
	   for(int i = 0; i < age.length; i++) {
	     System.out.println(age[i]);
	   }
	   for(int j:age) {
		     System.out.println(j);
		   }
	 }
	}

