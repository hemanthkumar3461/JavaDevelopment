
package SyntaxConditionalsLoops;

public class E2_InsertElementIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,25,78,98,52,36};
		
		int rmid = 1;
		
		for(int i=arr.length-1;i<rmid;i--) {
			arr[i] = arr[i-1];
			
			
		}
		
		arr[rmid] = 10;
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}//If you see in o/p, 25 is missing because arrays are not dynamic. We cant increase the size once once defined means
