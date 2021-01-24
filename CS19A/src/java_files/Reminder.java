package java_files;
import java.util.Scanner;
import java.awt.datatransfer.SystemFlavorMap;
import java.time.LocalTime;   //to access different formate of time and date

public class Reminder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hour");
		int hr=sc.nextInt();
		System.out.println("Enter the Min: ");
		int min=sc.nextInt();
		alarm(hr, min);
		
	}
	public static void alarm(int hr, int min) {
		boolean on = checkAlarm(hr, min);
		while(on) {
			beep();
			on=checkAlarm(hr,min);
			if(on==false) {
				System.out.println("Alarm offed!");
			}
		}
		
	}
	public static boolean checkAlarm(int hr, int min) {
		LocalTime now=LocalTime.now();
		
		boolean set = false;
		if(hr==now.getHour() && min==now.getMinute()) {
			set=true;	
		}else if(hr<now.getHour()) {
			System.out.println("Alarm set for tomorrow");
		}else if(min<now.getMinute()) {
			System.out.println("Alarm set for tomorrow");
		}else if(hr>now.getHour()) {
			System.out.println("not set yet.");
		}else if(min>now.getMinute()) {
			System.out.println("Not set yet.");
		}
		return set;
		
	}
	
	public static void beep() {
		
		System.out.println("Beep Beep Beep");
		//System.out.println("Hour :"+now.getHour());
		//System.out.println("Min:"+now.getMinute());
		
	}
	
}
