package JavaPractice;

public class AddingTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




import java.util.Scanner;

class AddingTwoMatrices{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);




	 
m = in.nextInt(); n = in.nextInt();
int first[] [] = new int[m] [n];
int second[] [] = new int[m] [n]; int sum[] [] = new int[m] [n];
System .out.print1n(”Enter the elements of first matrix”);
for( c=0;c<m; c++ )
for ( d = 0 ; d	n ; d++ ) int m, n, c, d;
first[c] [d] = in.nextInt();
System .out.println(”Enter the elements of second matrix”); for ( c = 0 ; c < m ; c++ )
for ( d = 0 ; d < n ; d++ )
second[c][d] = in.nextInt(); for ( c = 0 ; c < m ; c++ ) for ( d = 0 ; d < n ; d++ )
sum [c] [d] = first[c] [d] + second[c]
System .out.println(”Sum of entered matrices:-”); for ( c = 0 ; c < m ; c++ )

for ( d = 0 ; d < n ; d++ )
System.out.print(sum[c][d] +”\t”); System .out.println();

	}


}


