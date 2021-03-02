package convexHall;

public class Main {
	public static void main(String[] args) {
		Cordinate point[] = new Cordinate[7];
		
		point[0]=new Cordinate(1,3);
		point[1]=new Cordinate(0,0);
		point[2]=new Cordinate(2,4);
		point[3]=new Cordinate(3,1);
		point[4]=new Cordinate(2,2);
		point[5]=new Cordinate(4,5);
		point[6]=new Cordinate(3,1);
		
		int n=point.length;
		
		GiftWrapping gfw=new GiftWrapping();
		
		gfw.convexHall(point, n);
		
		
	}

}
