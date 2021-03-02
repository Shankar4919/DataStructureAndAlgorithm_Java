package hwPractice;

import java.util.ArrayList;

public class blank {
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList();
		cars.add("a");
		cars.add("b");
		cars.add("ford");
		cars.add("Maz");
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(0, "Lamborgini");
		System.out.println(cars);
		cars.remove(1);
		System.out.println(cars);
		for(int i=0; i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		//for each loop
	}
}