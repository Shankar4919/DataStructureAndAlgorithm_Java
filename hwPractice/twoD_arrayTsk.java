package hwPractice;

import java.util.Scanner;

public class twoD_arrayTsk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int random[][]=new int[size][size];
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.println("Input at position ("+i+","+j+"):");
				int input =sc.nextInt();
				random[i][j]=input;
			}
		}
		
		sc.close();
		System.out.println("-------------");
		for (int row[]:random) {
			for (int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
