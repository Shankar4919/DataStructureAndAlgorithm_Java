package hwPractice;

public class Operator {

	public static void main(String[] args) {
		//String operator
		String statement="My country name is"+" "+"Nepal.";
		String first_name,last_name, full_name;
		first_name="James";
		last_name="Bond";
		full_name=first_name+" "+last_name;
		
		//arithmetic operator
		int a, b, c;
		a=10;
		b=++a; 
		int d=100;

		/*
		 * System.out.println("Value of a: "+a);
		System.out.println(b);
		System.out.println(++d);
		
		c=--a;
		System.out.println(a);
		System.out.println(c);
		*/
		
		
		//System.out.println(a==b);
		
		
		
		
		
		
		// string operator
		//System.out.println(statement);
		//System.out.println("Nepal is on "+1+"st position. It is "+true);
		//System.out.println(1+" Nepal");
		
		/*if(a!=0 && b>40) {
			System.out.println("hello");
		}else {
			System.out.println("Oh no no no");
		}
		*/
		String result=(10%3==0)?"Even":"Odd";
		System.out.println(result);
	}

}
