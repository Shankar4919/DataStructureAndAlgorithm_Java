package hwPractice;

public class longestString {

	public static void main(String[] args) {
		String club[]= {"Barcelona","Real Madrid","Everton","Manangmarsandhi","Swarswoti","Manchester City"};
		String ans=longest(club);
		System.out.println(ans);
	}
	public static String longest(String club[]) {
		int index=0;
		
		int Length=club[0].length();
		for (int i=1; i<club.length; i++) {
			if (club[i].length()>Length) {
				index=i; Length=club[i].length();
			}
		}
		return club[index];
	}

}
	
