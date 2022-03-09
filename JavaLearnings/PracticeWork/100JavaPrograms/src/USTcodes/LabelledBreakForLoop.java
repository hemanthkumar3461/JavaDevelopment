package USTcodes;

/*In Labelled Break Statement, we give a label/name to a loop.

When this break statement is encountered with the label/name of the loop, it skips the execution any statement after it and takes the control right out of this labelled loop.

And, the control goes to the first statement right after the loop.*/

class LabelledBreakForLoop {
	public static void main(String[] args) {

		// the for loop is labeled as first   
		first:
			for( int i = 1; i < 5; i++) {

				// the for loop is labeled as second
				second:
					for(int j = 1; j < 3; j ++ ) {
						System.out.println("i = " + i + "; j = " +j);

						// the break statement breaks the first for loop
						if ( i == 2)
							break first;
					}
			}
	}
}
//Comes out of first loop because of line 23 



