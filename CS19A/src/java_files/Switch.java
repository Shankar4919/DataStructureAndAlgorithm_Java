package java_files;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("When your birth month: ");
		int passcode=sc.nextInt();
		String Horoscopes;
		switch(passcode) {
		case 1:
			Horoscopes=" January is not good for Capricon";
			break;
		case 3:
			Horoscopes=" March is worst for Leo";
			break;
		case 12:
			Horoscopes="Worst for everyone!";
			break;
		default:
			Horoscopes="Good for everyone.";
		}
		System.out.println(Horoscopes);

	}

}
