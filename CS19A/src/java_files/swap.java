package java_files;

public class swap {
	public static void main(String[] args) {
		boolean isSnowing=true;
		boolean isRaining=true;
		double temperature=40;
		
		if (isSnowing || isRaining || temperature <50) {
			System.out.println("let's stay home");
		}else {
			System.out.println("let's go out");
		}
	}

}
