package java_files;

public class stack {
	int size=5;
	int stk[]=new int[size];
	int top=-1;
	void push(int data) {
		if (isFull()) {
			System.out.println("stack overflow");
		}
		else {
			stk[++top]=data;
		}
	}
	
	int pop() {
//		int temp=top;
//		top=top-1;
//		return stk[top];
		if (isEmpty()) {
			System.out.println("Stack under flow");
			return -1;
		}
		else {
			return stk[top--];
		}
	}
	
	boolean isFull() {
		return top==size-1;
	}
	boolean isEmpty() {
		return top==-1;
	}
	
	int peak() {
		return stk[top];
	}
	
	void printStack() {
		for(int i=0;i<=top; i++) {
			System.out.println("Start printing stack value");
	
		}
	}


}
