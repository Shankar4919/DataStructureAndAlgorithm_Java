package hwPractice;
import java.util.Scanner;

public class guessGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int secret=(int)(Math.random()*99+1);
		System.out.println("Welcome to Guess Game.\nYou will be asked to guess a number to win the game\nYou have Maximum 10 attemp Limit.");
		for(int i=1;i<=10;i++) {
			System.out.println("Enter your Guess From 1-100");
			int userInput=sc.nextInt();
			if(userInput==secret) {
				System.out.println("Congralution! You Win in Attempt "+ i);
				break;
			}else if(userInput<secret) {
				System.out.println("Opps! Your guess is Less than secret number.");
			}else {
				System.out.println("Opps! Your guess is greater than secret number");
			}
		}
	}

}
