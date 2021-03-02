package convexHall;
import java.util.*;

public class GiftWrapping {
	
	public int direction(Cordinate p, Cordinate q, Cordinate r) {
		int area=((q.x-p.x)*(r.y-q.y))-((q.y-p.y)*(r.x-q.x));
		
		return area;
		
	}
	
	
	public void convexHall(Cordinate point[], int n) {
		Stack<Cordinate> stack=new Stack<Cordinate>();
		
		int left=0;
		for(int i=1; i<n; i++) {
			if(point[i].x < point[left].x) {
				left=i;
			}
		}
		int p=left;
		
		do {
			stack.add(point[p]);
			int q=(p+1)%n;
			
			for(int r=0; r<n; r++) {
				if(direction(point[p],point[q],point[r])>0) {
					q=r;
					
				}
			}
			p=q;
		
			
		}while(p != left);
		
		stack.add(point[p]);
		
		// display
		
		System.out.println("Coordinate for Cone hall");
		for(Cordinate i:stack) {
			System.out.println("("+i.x+","+i.y+")");
		}
		
	}
}

