package java_files;

public class stack$2 {

	public static void main(String[] args) {
		stack obj=new stack();
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.printStack();
		System.out.println("Pop value is = "+obj.pop());
		System.out.println("Pop value is = "+obj.pop());
		obj.printStack();

	}

}
