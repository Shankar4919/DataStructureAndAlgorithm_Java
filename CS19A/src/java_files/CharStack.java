package java_files;

public class CharStack {
    int size;
    char arr[];
    int top = -1;

    CharStack(int size){
        this.size = size;
        arr = new char[this.size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(char newValue) {
        if (isFull()) {
            System.out.println("stack overflow");
        } else {
            arr[++top] = newValue;
        }
    }

    char pop() {
        /*
        if (isEmpty()) {
            System.out.println("Stack underflow");
        } else {
            return arr[top--];
        }*/
        return arr[top--];
    }

    int peak() {
        return arr[top];
    }

    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

}
