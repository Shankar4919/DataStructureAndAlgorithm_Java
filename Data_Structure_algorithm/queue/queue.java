package queue;

public class queue {
	int queue[]= new int[6];
	int front,rear;
	int size;
	public void enqueue(int value) {
		
		queue[rear]=value;
		rear=(rear+1)%queue.length;
		size++;
	}
	public void dequeue() {
		front=(front+1)%queue.length;
		size--;
	}
	public void isFull() {
		if(queue.length>=6) {
			
		}
	}
	public void display() {
		System.out.println("Size "+ size);
		System.out.println("Front "+size);
		System.out.println("Rear "+rear);
		
		System.out.print("Element in Queue ");
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println("\n\nActual Array: ");
		for(int i:queue) {
			System.out.print(i+" ");
		}
	}
	
	

}