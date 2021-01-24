package java_files;

public class rubicCube {

	public static void main(String[] args) {
		double speed[]= {10.2, 6.4, 8.8,3.2, 9.9,12.6};
		double min=minSearch(speed);
		System.out.println("The champ record: "+min);

	}
	
	public static double minSearch(double speed[]) {
		
		int size=speed.length;
		double min=speed[0];
		for(int i=0; i<size; i++) {
			if(speed[i]<min) {
				min=speed[i];
			}
			
		}
		return min;
		
	}

}
