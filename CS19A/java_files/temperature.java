package java_files;

public class temperature {

	public static void main(String[] args) {
		
		double temp[]= {72.6,75.6,78,4.55};
		String name[]= {"shankar", "samir","mamba"};
		
		temp[3]=66;
		int size = temp.length;
		// use or access of single dimensional array using for loop
		for(int i=0; i<size; i++) {
			System.out.println(temp[i]);
		}
		
		// for each
		
		for(String i:name) {
			System.out.println(i);
		}
		
		
		
		

	}

}
