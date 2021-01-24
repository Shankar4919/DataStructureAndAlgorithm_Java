package java_files;

public class casting {

	public static void main(String[] args) {
		double cur=10;
		double rate=2.1;
		double future=cur*rate;
		System.out.println("Future value "+future);
		
		//Casting double into integer val
		int nexFut=(int)future;
		System.out.println("Next Future "+nexFut);
		
		//Double casting
		int x=5;
		int y=2;
		int divOne=x/y;
		System.out.println("Int div value: "+divOne);
		
		// casting int into double
		double nexDiv=(double)x/y;
		System.out.println("Double div val: "+nexDiv);
		
		

	}

}
