package hwPractice;

public class task1_ifelseSt {

	public static void main(String[] args) {
		
		boolean isSnowing,isRaining;
		double temperature;
		isSnowing=true;
		isRaining=true;
		temperature=50;
		//if else statement
		if(isSnowing||isRaining||temperature<50) {
			System.out.println("Let's stay home.");
		}else {
			System.out.println("Let's go out!");
		}

	}

}
