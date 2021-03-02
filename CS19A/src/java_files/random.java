package java_files;


public class random {
	public static void main(String[] args) {
		int roll1=rollDice(6);
		int roll2=rollDice(100);
		
		System.out.println("First roll:"+roll1);
		System.out.println("Second roll: "+roll2);
	}
	
	public static int rollDice(int x) {
		double randomNumber=Math.random();
		System.out.println("random Number "+randomNumber);
		
		// changing range to 0 to almost(10)
		randomNumber=randomNumber*x;
		
		//casting to integer
		
		int randomInt=(int) randomNumber;
		
		//shifting range to 1-10
		randomInt=randomInt+1;
		return randomInt;
	}

}
