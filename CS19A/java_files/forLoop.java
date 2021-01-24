package java_files;
import java.util.Scanner;

public class forLoop {
	public static void main(String[] args) {
		/*display 1 to 10*/
		/*for(int i=1;i<10;i++) {
			System.out.println("Hello");
		}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number: ");
		int num=sc.nextInt();
		multiplication(num);
		fact(num);
	}
	public static void multiplication(int num) {
		for(int i=0; i<10; i+=2) {
			System.out.println(num+i);
		}
	}
	public static void fact(int num) {
		int factorial=1;
		for (int i=1; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of "+num+" is: "+factorial);
	}

}
