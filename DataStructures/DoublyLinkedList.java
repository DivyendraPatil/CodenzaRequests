import java.awt.*;

class DoublyLinkedList {
	static Node head;
	
	class Node {
		int data;
		Node previous;
		Node next;
		Node (int value){
			data = value;
			previous = null;
			next = null;
		}
	}
	
	void printList(){
		Node last = null;
		Node current = head;
		
		System.out.println("Traversal in forward Direction"); 
		while (current!=null) {
			System.out.print(current.data+" ");
			last = current;
			current = current.next;
		}
		
		System.out.println();
		System.out.println("Traversal in reverse direction"); 
		while (last != null) { 
			System.out.print(last.data + " "); 
			last = last.previous; 
		}
		System.out.println();
	}
		
	void addAtFront(int value){
		Node new_node = new Node(value);
		if (head!=null) {
			new_node.next = head;
			new_node.previous = null;
			head.previous = new_node; 		
		}		
		head = new_node;
	}
	
	public void insertAfter(Node temp, int new_data) { 
		Node new_node = new Node(new_data); 
		new_node.next = temp.next; 
		temp.next = new_node; 
  		new_node.previous = temp; 
		if (new_node.next != null) {
			new_node.next.previous = new_node;
		}
	} 
	
	void insertAtEnd(int value){
		Node new_node = new Node(value);
		Node current = head;
		if (head == null) { 
			new_node.previous = null; 
			head = new_node; 
			return; 
		}
		while (current.next!=null) {
			current = current.next;
		}
		current.next = new_node;
		new_node.previous = current;
	}
	
	void deleteNode(int value){
		Node current = head;
		if (head.data == value) {
			head = head.next;
			return;
		}
		while (current.data!=value) {
			current = current.next;
		}
		
		if (current.next!=null) {
			current.next.previous = current.previous;
			current.previous.next = current.next;
		} else {
			current.previous.next = null;
		}
	}
	
	void deleteNodeAtPosition(int position){
		if (position == 0) {
			head = head.next;
			head.previous = null;
		} else {
			Node current = head;
			for (int i = 1; current!=null && i<position; i++) {
				current = current.next;
			}
			if (current.next!=null) {
				current.next.previous = current.previous;
				current.previous.next = current.next;
			} else {
				current.previous.next = null;
			}
		}
	}
	
	// From sorted
	void removeDuplicates(){
		Node current = head;
		if (current==null) {
			return;
		}
		while (current.next!=null && current.next.next!=null) {
			if (current.data == current.next.data) {
				current = current.next;
				current.next.previous = current.previous;
				current.previous.next = current.next;
			}
			current = current.next;
		}
	}
	
	// From unsorted DLL, use hashset and do operations similar to SLL
	
	void deleteAllOccurOfX(int value){
		Node current = head;
		while (current!=null) {
			if (current.data == value) {
				// If it is the first element
				if (current.previous == null) {
					head = head.next;
					head.previous = null;
				}
				// If it is the last element
				if (current.next == null) {
					current.previous.next = null;
				} else {
					current.next.previous = current.previous;
					current.previous.next = current.next;
				}
			}
			current = current.next;
		}
	}
	
	void reverse(){
		Node current = head;
		Node temp = null;
		
		while (current!=null) {
			temp = current.previous;
			current.previous = current.next;
			current.next = temp;
			current = current.previous;
		}
		if (temp != null) { 
			head = temp.previous; 
		}
	}
	
	int countLength(){
		Node current = head;
		int length = 0;
		while (current!=null) {
			length++;
			current = current.next;
		}
		return length;
	}
	
	void swapKthElement(int elementPosition){
		int length = countLength();
		
		//Check if elementPosition is value
		if (length < elementPosition) {
			return;
		}
		// If x and y are the same
		if (2*elementPosition - 1 == length) {
			return;
		}
		// Find xth element from beggining
		Node x = head;
		Node x_prev = null;
		for (int i = 1; i<elementPosition;i++) {
			x_prev = x;
			x = x.next;
		}
		// kth element from end is (n-k+1)
		Node y = head;
		Node y_prev = null;
		for (int i =1;i<length-elementPosition+1;i++) {
			y_prev = y;
			y = y.next;
		}
		// Change next pointers for x and y prev's
		if (x_prev != null) {
			x_prev.next = y; 
		}
		if (y_prev != null) {
			y_prev.next = x; 
		}	
		// Swap next pointers of x and y
		Node temp = x.next; 
		x.next = y.next; 
		y.next = temp; 
		
		if (elementPosition == 1) {
			head = y;
		}
		if (elementPosition == length) {
			head = x; 
		}
	}
	
	void pairSum(int value){
		Node start = head;
		Node last = head;
		while (last.next!=null) {
			last = last.next;
		}
		
		while (start!=null && last!=null && start!=last){
			if (start.data+last.data == value) {
				System.out.println("Element Found at "+start.data+" & "+last.data);
				break;
			} else {
				if (start.data+last.data < value) {
					start = start.next;
				} else {
					last = last.previous;
				}
			}
		}
	}
	
	void insertSorted(int value){
		Node current = head;
		Node new_node = new Node(value);
		// If node is to be inserted at the head
		if (head.data >= value) {
			new_node.next = head;
			head.previous = new_node;
			head = new_node;
			return;
		} else {
			// Find the approp node to insert the new node after 
			while (current.next.data < value && current.next!=null) {
				current = current.next;
			}
			new_node.next = current.next;
			// If not the end of the list then
			if (current.next != null){
				new_node.next.previous = new_node;
			}
			current.next = new_node;  
			new_node.previous = current; 			
		}
	}

	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addAtFront(2);
		dll.addAtFront(1);
		dll.insertAfter(head.next,3);
		dll.insertAtEnd(4);
		dll.insertAtEnd(5);
		dll.deleteNode(5);
		dll.insertAtEnd(6);
		dll.insertAtEnd(7);
		dll.insertAtEnd(9);
		dll.reverse();
		dll.reverse();
		dll.swapKthElement(2);
		dll.swapKthElement(2);
		dll.insertSorted(8);
		dll.insertSorted(8);
		dll.insertSorted(8);
		dll.deleteNodeAtPosition(8);
		dll.removeDuplicates();
		dll.deleteAllOccurOfX(8);
		dll.deleteAllOccurOfX(9);
		dll.insertAtEnd(8);
		dll.insertAtEnd(9);
		dll.printList();
		dll.pairSum(7);
		
	}
}