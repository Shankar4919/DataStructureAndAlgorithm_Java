package Array;

public class trapping_rain_water {

	public static void main(String[] args) {
		int[] height= {3,0,2,0,4};
		System.out.println("We trapped "+trapWater(height)+" unit's of water.");

	}
	public static int trapWater(int[] height) {
		int length=height.length;
		int total=0;
		
		int[] leftmax=new int[length];
		int[] rightmax=new int[length];
		
		leftmax[0]=height[0];
		for (int i=1; i<length; i++) {
			leftmax[i]=Math.max(height[i], leftmax[i-1]);
		}
		
		rightmax[length-1]=height[length-1];
		for (int i=length-2; i>=0;i--) {
			rightmax[i]=Math.max(height[i], rightmax[length-1]);
		}
		
		for (int i=0; i<length; i++) {
			total=total+(Math.min(leftmax[i], rightmax[i])-height[i]);
		}
		return total;
	}

}
