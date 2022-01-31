package SamplePracticePrograms;

public class E2_RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,25,78,98,52,36};
		
		int rmid = 1;
		
		for(int i=rmid;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
			
			
		}
		
		for(int i =0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
