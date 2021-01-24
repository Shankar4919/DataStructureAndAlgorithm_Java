package Array;

public class matSum {

	public static void main(String[] args) {
		
		int matA[][]= {{1,2},{3,4}};
		int matB[][]= {{5,6},{7,8}};
		
		int row=matA.length;
		int column=matA[0].length;
		
		int matSum[][]=new int[row][column];
		//calculating sum
		for(int i=0; i<row;i++) {
			for(int j=0; j<column; j++) {
				matSum[i][j]=matA[i][j]+matB[i][j];
			}
			System.out.println("Value after sum: ");
		}
		//Displaying using for each loop
		for (int rows[]:matSum) {
			for (int col:rows) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}

	}

}
