package queue;

public class queue_call {
	public static void main(String[] args) {
		queue soft = new queue();
		soft.enqueue(10);
		soft.enqueue(20);
		soft.enqueue(30);
		soft.enqueue(40);
		soft.enqueue(50);
		soft.enqueue(60);
		
		soft.enqueue(70);
		soft.display();
		
	}

}
