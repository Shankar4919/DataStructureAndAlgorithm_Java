package hwPractice;

import java.util.Scanner;

public class road_map {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int rows=sc.nextInt();
		
		System.out.println("Enter the size of column: ");
		int columns=sc.nextInt();
		
		int matA[][]=new int[rows][columns];
		int matB[][]=new int[rows][columns];
		matA=input(rows,columns);
		matB=input(rows,columns);
		
		int matSum[][]=new int[rows][columns];
		
		//sum
		for(int i=0;i<rows;i++) {
			for(int j=0; j<columns; j++) {
				matSum[i][j]=matA[i][j]+matB[i][j];
			}
		}
		System.out.println("The product of two matric is: ");
		//for each loop
		for(int row[]:matSum) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] input(int x, int y) {
		Scanner sc=new Scanner(System.in);
		int value[][]=new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.println("Enter the value in position "+"("+i+","+j+")");
				value[i][j]=sc.nextInt();
			}
		}
		return value;
	}
	
		

}
