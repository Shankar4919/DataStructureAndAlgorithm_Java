package Array;

public class twoD_array {

	public static void main(String[] args) {
		// defining 2D Array
		//first []=rows and second[]=columns
		
		int random[][]= {{2,4,8},{8,9,10},{22,10,13}};
		
		int rows=random.length;
		int column=random[0].length;
		
		// for calculating for loop
		for(int i=0; i<rows; i++) {
			for(int j=0; j<column; j++) {
				
				System.out.print(random[i][j]+" ");
				
			}//end of j loop
			System.out.println();
		}// end of i loop
		
		
		System.out.println("------------------");
		
		// for viewing for each loop
		for(int row[]:random) {
			for(int data: row) {
				System.out.print(data+" ");
			}
			System.out.println();
			
		}

	}

}
