package hwPractice;

public class controlFlow {

	public static void main(String[] args) {
		// else if statement
		/*int marks=80;
		if(marks<40) {
			System.out.println("Fail");
		}
		else if(marks<60) {
			System.out.println("Pass");
		}
		else if(marks<80) {
			System.out.println("Merit");
		}
		else if(marks>=80){
			System.out.println("Distinctions");
		}
		else {
			System.out.println("Invalid");
		}*/
		
		//Switch statement
		int a=10;
		switch(a) {
		case 1:
			System.out.println("one");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
