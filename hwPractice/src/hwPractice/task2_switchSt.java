package hwPractice;
import java.util.Scanner;

public class task2_switchSt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1-7 to see the routine: ");
		int day=sc.nextInt();
		String schedule;
		switch(day) {
		case 1:
			schedule="Monday:Gym in the morning.";
			break;
		case 2:
			schedule="Tuesday: Class after work.";
			break;
		case 3:
			schedule="Wednesday: Meetings all day.";
			break;
		case 4:
			schedule="Thursday: Work from home.";
			break;
		case 5:
			schedule="Friday: Game night after work.";
			break;
		default:
			schedule="Saturday and Sunday: Free!";
		}
		System.out.println(schedule);
	}

}
