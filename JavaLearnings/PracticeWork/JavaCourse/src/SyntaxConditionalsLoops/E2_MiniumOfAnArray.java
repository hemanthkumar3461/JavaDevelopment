package SyntaxConditionalsLoops;

public class E2_MiniumOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,55,88,662,63,6,4,2};
		
		int min = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			if(arr[i]<min) {
				min= arr[i];
				
			}
		}
		System.out.println(min + " Is the minimum of the array");

	}

}
