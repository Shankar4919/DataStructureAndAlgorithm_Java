package Array;

import java.util.*;

public class DynamicList {
	public static void main(String[] args) {
		ArrayList soft = new ArrayList(); //init ArrayList
		// arrrayList means unbounded list-unbounded capacity,
		// arrylist class is a resizable array, the difference between a built-in array and
		// arrylist in Java, is that the size of an array cannot be modified(if you
		//want to add or remove element you have to create a new one).While elements can
		// be added and removed from an arraylist wheneverYouwant.
		
		// Defining ArrayList of Specific Type
//		ArrayList <String> soft1 = new ArrayList(); 
//		ArrayList <Integer> soft2 = new ArrayList(); 
//		ArrayList<Double> soft3 = new ArrayList(); 
		//Add method
		
		soft.add("Batch 28");
		soft.add("Batach 29");
		soft.add("Batch 30");
		soft.add(12);
		soft.add(34.4);
		soft.add(true);
		
		soft.add(1,"Batch 27");
		
		System.out.println("Size of ArrayList"+soft.size());
		System.out.println("Batch in softwarica"+soft);
		
		
		// get method
		
		System.out.println("Value in Softwarica in index 1 "+soft.get(1));
		
		// remove
		soft.remove("Batch 28");
		
		System.out.println("Batch in softwarica after removal"+soft);
		
//		for(int i=0; i<soft.size();i++) {
//			System.out.println(soft.get(i));
//		}
		
		
	}
}

