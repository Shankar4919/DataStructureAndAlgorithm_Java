package java_files;

public class whileLoop {

	public static void main(String[] args) {
		//display odd number from 1 to 100
		/*int i=1;
		while(i<=100) {
			if(i%2 != 0) {
				System.out.println(i);
			}
			i+=2;
		}*/
		doWhileLoop();
		Break();
		Continue();

	}
	public static void doWhileLoop() {
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while (j<100);
	}
	
	// Break Statement: WAP to display first five odd numbers
	public static void Break() {
		int i=0;
		int counter=0;
		while(true) {
			if(i%2 != 0) {
				System.out.println(i);
				counter++;
			}
			if(counter>5) {
				break;
			}
			i++;
		}
	}
	
	// Continue Statement: WAP to display from 1 to 100. But don't display multiple of 5
	public static void Continue() {
		for(int j=1; j<=100; j++) {
			if(j%5 == 0) {
				continue;
			}
			System.out.println(j);
		}

	}
}
