package convexHall;
import java.util.Scanner;

// find the coordinate to create convexHall; As the number of points must be asked 
// by user; also the x-coordinate and y-coordinate must be generated randomly up to 1-100

public class question_1 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the number of Coordinates");
	        int size = input.nextInt();
	        input.close();
	 
	        Cordinate point[] = new Cordinate[size];
	        for (int i = 0; i < size; i++) {
	            point[i] = new Cordinate(randomNumber(), randomNumber());
	 
	        }
	 
	        int n = point.length;
	 
	        GiftWrapping gfw = new GiftWrapping();
	        gfw.convexHall(point, n);
	 
	    }
	 
	    public static int randomNumber() {
	        /* Providing the valid random number of the current dice */
	        int number = (int) (Math.random() * 100) + 1;
	        return number;
	    }
	 
}
