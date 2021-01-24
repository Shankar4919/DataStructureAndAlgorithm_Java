package java_files;

public class monthTemp {

	public static void main(String[] args) {
		double temp[]= {72.6,75.6,78,4.55,66,55,45.5};
		
		double avg=calculateAvg(temp);
		System.out.println("Our avg week temp is: "+avg);

	}
	
	public static double calculateAvg(double temp[]) {
		
		int size=temp.length;
		double total=0;
		for (int i=0;i<size; i++) {
			total+=temp[i];
		}
		return total/size;
	}

}
