package hwPractice;

public class multi_array {

	/*public static void main(String[] args) {
		int multi[][]=new int[4][5];
		int i, j, k=0;
		for (i=0;i<4;i++) {
			for(j=0; j<5; j++) {
				multi[i][j]=k;
				k++;
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<5;j++) {
				System.out.print(multi[i][j]+" ");
				//System.out.println();
			}
		}
	}*/
	
	public static void main(String args[]) {
		int arr[][]= {{1,2,3},{2,3,5},{4,4,5}};
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
