package java_files;

public class control {

	public static void main(String[] args) {
		boolean isRaining=false;
		//if statement
		if(isRaining) {
			System.out.println("Hey idiot! take an umbrella.");
		}
		
		// if statement with variable scope
		if(isRaining) {
			int person=2; 
			System.out.println("We need two umbrella for "+person+" person.");
			
		}
		
		// if-else statement
		if(isRaining) {
			System.out.println("Take an Umbrella.");
		}else {
			System.out.println("U dont need an Umbrella.");
		}

	}

}
