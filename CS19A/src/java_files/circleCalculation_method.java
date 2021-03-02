package java_files;
import java.util.Scanner;
public class circleCalculation_method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double radius=1;
		char choice;
		do {
			System.out.println("***Circle Calculation***");
			System.out.println("1. Radius Choice.");
			System.out.println("2. Area of Circle.");
			System.out.println("3. Circumstance of Circle.");
			System.out.println("3. Quit.");
			System.out.println();
			System.out.print("Enter a number from 1-4: ");
			choice=sc.next().charAt(0);
			switch(choice) {
			case '1':radius=option1();break;
			case '2':option2(radius);break;
			case '3':option3(radius);break;
			case '4':break;
			default: System.out.println("Enter from 1-4.");
			
			}
		}while(choice!='4');
		
	}
	static double option1() {
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of circle");
		radius=sc.nextDouble();
		return radius;
	}
	static void option2(double radi) {
		double area;
		area=3.14*radi*radi;
		System.out.println("The area of circle is "+area);
	}
	static void option3(double radi) {
		double pari;
		pari=2*3.14*radi;
		System.out.println("The Circumstance of circle is "+pari);
	}
}
