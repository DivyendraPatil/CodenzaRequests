class CircularLinkedList {
	Node head;
		
	static class Node {
		int data;
		Node next;
		Node (int value){
			data = value;
			next = null;
		}
	}
	
	void printList() { 
		Node temp = head; 
		do{ 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
		while (temp != head); 
		System.out.println();
	} 
	
	void push(int value){
		Node new_node = new Node(value);
		Node current = head;
		if (current == null) {
			head = new_node;
			new_node.next = head;
			return;
		} else {
			while (current.next!=head) {
				current = current.next;
			}
			current.next = new_node;
			new_node.next = head;			
		}
	}

	void splitList(){
		Node slow = head;
		Node fast = head;
		
		while (fast.next != head && fast.next.next != head) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if (fast.next.next == head) { 
			fast = fast.next; 
		}
		
		Node head1 = head;
		Node head2 = slow.next;
		
		slow.next = head1;
		fast.next = head2;
		
		//Return head1 and head2 to print		
	}
	
	void sortedInsert(int value){
		Node new_node = new Node(value);
		Node current = head;
		if (current==null) {
			new_node.next = head;
			head = new_node;
		} else if (current.data>=new_node.data) {
			// If the head is > value
			while (current.next!=head) {
				current = current.next;
			}
			current.next = new_node;
			new_node.next = head;
			head = new_node;
		} else {
			// Search and insert in between
			while (new_node.data > current.next.data && current.next!=head) {
				current = current.next;
			}
			new_node.next = current.next;
			current.next = new_node;
		}
	}
	
//=============================================================================
	// Deletion from Circular Linked List
	
	void deleteNode(int value){
		Node current = head;
		
		if (current==null) {
			return;
		} 
		Node previous = head;
		// Find the element and keep
		while (current.data!=value) {
			previous = current;
			current = current.next;
		}
		// If it is the only node
		if (current.next == head) { 
			head = null; 
			return; 
		} 
		// If the value is the head element
		if (current==head) {
			previous.next = head.next;
			head = previous.next;	
		}
		// If it is the last
		else if (current.next==head) {
			previous.next = head;
		}else {
			previous.next = current.next;
		}
	}
	
	
	void countNodes(){
		int count = 1;
		Node current = head;
		
		while (current.next!=head) {
			count++;
			current = current.next;
		}
		
		System.out.println("Number of nodes are "+count);
	}
	
	void josephusCircle(int length,int killed){
		Node current = head;
		Node previous = null;
		while (current.next!=current) {
			for (int i=0;i<killed;i++) {
				previous = current;
				current = current.next;
			}
			if (current.next!=current) {
				previous.next = current.next;
			}
		}
		System.out.println("Last node standing = "+current.data);
	}
	
	//Swap first and last nodes of CLL
	void exchangeNodes(){
		Node p = head; 
		while (p.next.next != head) 
			p = p.next; 

		p.next.next = head.next; 
		head.next = p.next; 
		p.next = head;
		head = head.next; 
	}
	
//=============================================================================	

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		//list.printList();
		
		list.sortedInsert(6);
		list.sortedInsert(5);
		list.sortedInsert(4);
		list.deleteNode(4);
		list.printList();
		list.countNodes();
		//list.josephusCircle(6,3);
		list.exchangeNodes();
		list.printList();
		
	}
}