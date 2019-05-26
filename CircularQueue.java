class CircularQueue {
	
	Node head;
	static class Node {
		int data;
		Node next;
		Node (int value){
			data = value;
			next = null;
		}
	}
	
	static class Queue{  
	     Node  front, rear;  
	}
	
	static void enQueue(Queue queue,int value){
		Node new_node = new Node(value);
		if (queue.front==null) {
			queue.front = new_node;
		} else {
			queue.rear.next = new_node;
		}
		
		queue.rear = new_node;
		queue.rear.next = queue.front;
	}
	
	static void deQueue(Queue queue){
		if (queue.front == null) {
			System.out.println("Queue is empty");
			return;
		}
		if (queue.front == queue.rear) {
			queue.front = null;
			queue.rear = null;
		} else {
			queue.front = queue.front.next;
			queue.rear.next = queue.front;
		}
	}
	
	static void printQueue(Queue queue){
		Node current = queue.front;
		while (current.next != queue.front) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.print(current.data+" ");
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.front = null;
		queue.rear = null;
		
		enQueue(queue,1);
		enQueue(queue,2);
		enQueue(queue,3);
		enQueue(queue,4);
		deQueue(queue);
		enQueue(queue,1);
		printQueue(queue);
		  
	}
}