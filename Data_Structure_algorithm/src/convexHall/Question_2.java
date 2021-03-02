package convexHall;

// write the java program which take 3-bit binary number and as a result must be its equivalent decimal value

public class Question_2 {
	public static void main(String[] args) {

		
		int[] bit= {1,1,0};
//		bit[0]=1;
//		bit[1]=1;
//		bit[2]=1;
		int num=0;
		int multipler=1;
		
		for(int i=bit.length-1; i>=0; i--) {
			if(bit[i] ==1) {
				num=num+multipler;
			}
			multipler=multipler*2;
		}
		
		
		System.out.println(num);
	}
	

}
