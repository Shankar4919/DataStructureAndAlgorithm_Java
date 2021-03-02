package graphs;

public class linklist_stack {
	// * Stack Implementation Using LinkedList
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    
    public Node head = null;
    public Node tail = null;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public int pop() {
        if (head == null) {
            System.out.println("No Item left");
            return -1;
        } else if (head == tail) {
            int value = tail.data;
            head = null;
            tail = null;

            return value;

        } else {
            int value = tail.data;
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            return value;

        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            current = current.next;
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static void main(String[] args) {
    	linklist_stack newObj = new linklist_stack();
        newObj.push(1);
        System.out.println(newObj.pop());
        System.out.println(newObj.pop());
        newObj.push(3);
        newObj.push(2);
        System.out.println(newObj.pop());
        System.out.println(newObj.pop());
    }

}
