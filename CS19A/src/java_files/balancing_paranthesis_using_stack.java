package java_files;

public class balancing_paranthesis_using_stack {
	
//	int size;
//	int top=-1;
//	char [] stk;
//	
//	stack(int size){
//		this.size=size;
//		stk=new char[size];
//	}
//	
//	void push(char data) {
//		stk[++top]=data;
//	}
//	
//	char pop() {
//		return stk[top--];
//	}
//	
//	int peak() {
//		return top;
//	}
	boolean checkBalanced(String data) {
		String openbracket="[{(";
		String closedbracket="]})";
		int lngth=data.length();
		
		stack stk=new stack(lngth);
		
		for(int i=0; i<lngth;i++) {
			char bracket=data.charAt(i);
			if(openbracket.indexOf(bracket)!=-1) {
				stk.push(bracket);
			}else {
				int indx=closedbracket.indexOf(bracket);
				char crossopen=openbracket.charAt(indx);
				
				if(stk.pop()!=crossopen) {
					return false;
				}
			}
			
		}
		if(stk.peak()==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String parenthesis="{()}";
		balancing_paranthesis_using_stack a=new balancing_paranthesis_using_stack();
		System.out.println(a.checkBalanced(parenthesis));
	}


}
