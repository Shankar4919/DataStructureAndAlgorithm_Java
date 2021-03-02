package Array;
import java.util.Scanner;

public class arrayProgram {

	public static void main(String[] args) {
		char choice;
		Scanner keyboard=new Scanner(System.in);
		int[] someArray;
		System.out.print("Enter the size of the array");
		int size=keyboard.nextInt();
		someArray=new int[size];
		do {
			System.out.println();
			System.out.println("1. Enter Values.");
			System.out.println("2. Find maximum.");
			System.out.println("3. Calculate Sum");
			System.out.println("4. Check membership");
			System.out.println("5. Search array.");
			System.out.println("6. Display values.");
			System.out.print("Enter choice(1-7). ");
			choice=keyboard.next().charAt(0);
			switch(choice) {
			case '1':fillArray(someArray);break;
			case '2':int max=max(someArray);
			         System.out.println("Maximum array value = "+max);break;
			case '3':int total=sum(someArray);
			         System.out.println("Sum of the array values = "+total);break;
			case '4':System.out.print("Enter value to find:");
			         int value = keyboard.nextInt();
			         boolean found = contains(someArray, value);
			         if (found)
			         {
			               System.out.println(value + " is in the array");
			         }
			         else
			         {
			               System.out.println(value + " is not in the array");
			
			         }
			         break;
			case '5':System.out.print ("Enter value to find: ");
			         int item = keyboard.nextInt();
			         int index = search(someArray, item);
			         if (index == -999) // indicates value not found
			         {
			         System.out.println ("This value is not in the array");
			         }
			         else
			         {
			         System.out.println ("This value is at array index " + index);
			         }
			         break;
			case '6':System.out.println("Array Values");
			         displayArray(someArray);
			         break;
			}         
		}while(choice!='7');
		
	}
	static void fillArray(int[] arrayIn) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arrayIn.length; i++) {
			System.out.println("enter value");
			arrayIn[i]=sc.nextInt();
		}
	}
	static int sum(int[] arrayIn) {
		int total=0;
		for(int current:arrayIn) {
			total=total+current;
		}
		return total;
	}
	
	static int max(int[] arrayIn) {
		int result=arrayIn[0];
		for(int i=1;i<arrayIn.length;i++) {
			if(arrayIn[i]>result) {
				result=arrayIn[i];
			}
		}
		return result;
	}
	
	static boolean contains(int[]arrayIn, int valueIn) {
		for(int current:arrayIn) {
			if(current==valueIn) {
				return true;
			}
		}
		return false;
	}
	static int search(int[] arrayIn, int valueIn) {
		for(int i=0; i<arrayIn.length;i++) {
			if(arrayIn[i]==valueIn) {
				return i;
			}
		}
		return -999;
	}
	
	static void displayArray(int[] arrayIn) {
		System.out.println();
		for(int i=0; i<arrayIn.length;i++) {
			System.out.println("array("+i+")="+arrayIn[i]);
		}
	}

}
