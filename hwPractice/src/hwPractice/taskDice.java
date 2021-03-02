package hwPractice;
import java.util.Scanner;

public class taskDice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dice Side: ");
		int x=sc.nextInt();
		dice(x);
	}
	public static void dice(int x) {
		boolean bol=com(x);
		while (bol) {
			alert();
			bol=com(x);
		}		
	}
	public static boolean com(int x) {
		double random=Math.random();
		random=random*x;
		int intVal=(int) random;
		intVal=intVal+1;
		
		boolean set=true;
		if(x==intVal) {
			System.out.println("You Win.");
			set=false;
		}
		return set;
	}
	public static void alert() {
		System.out.println("Loser");
	}
}
