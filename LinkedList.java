import java.util.*;

class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		Node (int value){
			data = value;
			next = null;
		}
	}
	
//====================================================================	
	// Print Linked List
	void printlist(){
		Node current = head;
		while (current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
//====================================================================	
	// Insertion of node at the front
	void push(int value){
		Node new_node = new Node(value);
		new_node.next = head;
		head = new_node;
	}
	
	// Insertion after a given node
	void insert_after(Node previous_node, int value){
		Node new_node = new Node(value);
		if (previous_node==null) {
			System.out.println("The given previous node cannot be null"); 
				return; 
		}
		new_node.next = previous_node.next;
		previous_node.next = new_node;		
	}
	
	// Insertion at the end
	void insert_at_end(int value){
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
			return;
		} else {
			Node current = head;
			while (current.next!=null) {
				current = current.next;
			}
			current.next = new_node;
			return;
		}
	}
//====================================================================	
	//Delete node Value
	void deleteNodeValue(int value){
		Node current = head;
		Node previous = null;
		if (current!=null && current.data==value) {
			head = head.next;
			return;
		}
		while (current!=null && current.data != value) {
			previous = current;
			current = current.next;
		}
		if (current==null) {
			return;
		}
		previous.next = current.next;
	}
//====================================================================	
	//Delete node at position
	void deleteNodePosition(int pos){
		if (head == null) { return; }
		
		if (pos==0) {
			head = head.next;
			return;
		}
		
		Node current = head;
		int iter = 0;
		while (iter != pos-1 && current!=null) {
			current = current.next;
			iter++;
		}
		if (current==null || current.next==null) {
			return;
		}
		current.next = current.next.next;
	}
//====================================================================	
	// Length of Linked List
	void length(){
		Node current = head;
		int len =0;
		while (current!=null) {
			len++;
			current = current.next;
		}
		System.out.println("Length of Linked List is "+len);
	}
//====================================================================	
	//Search for node
	void search(int value){
		Node current = head;
		int pos = 0;
		while (current!=null) {
			if (current.data==value) {
				System.out.println("Element found at pos "+pos);
				break;
			}
			pos++;
			current = current.next;
		}
	}
//====================================================================	
	//Get nth node of Linked List
	void getNthNode(int pos){
		Node current = head;
		int i =0;
		while (i!=pos) {
			current = current.next;
			i++;
		}
		System.out.println("Element at "+pos+" is "+current.data);
	}
//====================================================================	
	//Nth element from back
	void getNthElementFromEnd(int value){
		int len = 0;
		Node current = head;
		while (current!=null) {
			current = current.next;
			len++;
		}
		int i = 0;
		current = head;
		if (value<len) {
			while (i!=len-value-1) {
				current = current.next;
				i++;
			}
			System.out.println("Element at position "+value+" from back is "+current.data);
		} else {
			System.out.println("Invalid position requested");
		}	
	}
//====================================================================	
	void getNthElementFromEnd2(int positionFromTail){
		int index=0;
		Node result = head;
		Node current = head;

		while(current!=null){
			current = current.next;
			if(index++>positionFromTail){
				result=result.next;
			}
		}
		System.out.println("Element at position "+positionFromTail+" from back is "+result.data);
	}
//====================================================================	
	// Middle Element of LL
	// One is to get length of LL and parse to the middle element
	
	// Second is to use slow and fast pointer
	void printMiddle(){ 
		Node slow_ptr = head; 
		Node fast_ptr = head; 
		while (fast_ptr != null && fast_ptr.next != null){ 
			fast_ptr = fast_ptr.next.next; 
			slow_ptr = slow_ptr.next;
		} 
		System.out.print("The middle element is [" +slow_ptr.data + "] \n"); 
	}
//====================================================================	
	void count(int value){
		Node current = head;
		int count = 0;
		while (current!=null) {
			if (current.data==value) {
				count++;
			}
			current = current.next;
		}
		System.out.println("Number of times "+value+" occurs is "+count);
	}
//====================================================================	
	void detechLoop1(){
		Set <Node> hs = new HashSet<>();
		Node currrent = head;
		while (currrent!=null) {
			if (hs.contains(currrent)) {
				System.out.println("Loop Detected");
				break;
			} else {
				hs.add(currrent);
			}
			currrent = currrent.next;
		}
	}
	
	void detechLoop2(){
		Node slow = head;
		Node fast = head;
		while (slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Loop Detected");
				break;
			}
		}
	}
//====================================================================	
	//Detect size of loop in LL
	int countSize(Node slow){
		Node current = slow;
		int count = 1;
		while (current.next!=slow) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	void sizeofLoop(){
		Node slow = head;
		Node fast = head;
		int count = 0;
		while (slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				count = countSize(slow);
				break;
			}
		}
		System.out.println("Size of the loop is "+count);
	}
//====================================================================	
/*	void palindrome(){
		Node current = head;
		
		Stack <Integer> stack = new Stack<>();
		while (current!=null) {
			stack.push(current.data);
			current = current.next;
		}
		current = head;
		while (current!=null) {
			int value = stack.pop();
			if (current.data!=value) {
				System.out.println("LL is not a Palindrome");
				break;
			}
			current = current.next;
		}
	} */
//====================================================================	
	// From sorted LL
	void removeDuplicates1(){
		Node current = head;
		while (current!=null) {
			if (current.next!=null && current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}
//====================================================================		
	// From Unsorted LL
	//Hint: Use hashset
	void removeDuplicates2(){
		Node current = head;
		Node previous = null;
		Set <Integer> hs = new HashSet<>();
		
		while (current!=null) {
			if (hs.contains(current.data)) {
				previous.next = current.next;
			} else {
				hs.add(current.data);
				previous = current;
			}
			current = current.next;
		}
	}
//====================================================================

	void swapNodes(int x, int y){
		if (x == y) return;
		
		// Find x & y
		Node prevX = null, currX = head; 
		while (currX != null && currX.data != x){ 
			prevX = currX; 
			currX = currX.next; 
		}
		Node prevY = null, currY = head; 
		while (currY != null && currY.data != y){ 
			prevY = currY; 
			currY = currY.next; 
		}
		
		if (currX == null || currY == null){
			return;
		}
		
		//If x is not the head
		if (prevX != null) 
			prevX.next = currY; 
		else //make y the new head 
			head = currY; 

		if (prevY != null) 
			prevY.next = currX; 
		else // make x the new head 
			head = currX;

		// Swap next pointers 
		Node temp = currX.next; 
		currX.next = currY.next; 
		currY.next = temp; 
	}
//====================================================================	
	void pairwiseSwap(){
		Node current = head;
		while (current!=null && current.next!=null) {
			int temp = current.data;
			current.data = current.next.data;
			current.next.data = temp;
			
			current = current.next.next;
		}
	}
//====================================================================	
	void moveToFront(){
		Node last = head;
		Node secondLast = null;
		
		while (last.next!=null) {
			secondLast = last;
			last = last.next;
		}
		
		secondLast = null;
		last.next = head;
		head = last;
	}

//====================================================================	
//Merge point of two linked list
/*
	void mergePoint(Node head1, Node head2){
		Node l1 = head1;
		Node l2 = head2;
		while (l1!=l2) {
			if (l1!=null) {
				l1 = l1.next;
			}else {
				l1 = head2;
			}
			
			if (l2!=null) {
				l2 = l2.next;
			}else {
				l2 = head1;
			}
		}
		return l1.data;
	}
*/
//====================================================================	

	void moveAllOddtoEnd(){

		Node current = head;
		Node end = head;
		
		while (end.next!=null) {
			end = end.next;
		}
		
		Node new_end = end;
		
		while (current!=end && current!=null) {
			Node temp = null;
			if (current.data%2 == 1) {
				temp = current;
				new_end.next = temp;
				new_end.next.next = null;
				new_end = new_end.next;
			}
			current = current.next;
		}
		
		
	}
//====================================================================	
	// Reverse a LL
	
	void reverse(){
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while (current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
//====================================================================
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(2);
		list.push(1);
		list.insert_after(list.head.next, 3);
		list.insert_at_end(4);
		list.deleteNodeValue(4);
		list.insert_at_end(4);
		list.insert_at_end(5);
		list.deleteNodePosition(4);
		list.insert_at_end(5);
		list.insert_at_end(6);
		list.printlist(); 
		list.length();
		list.search(3);
		list.getNthNode(2);
		list.getNthElementFromEnd(2);
		list.getNthElementFromEnd2(2);
		list.printMiddle();
		list.count(3);
		list.head.next.next.next.next.next.next = list.head.next.next;
		list.detechLoop1();
		list.detechLoop2();
		list.sizeofLoop();
		list.head.next.next.next.next.next.next = null;
		//list.palindrome();
		list.insert_at_end(6);
		list.insert_at_end(7);
		list.insert_at_end(7);
		list.printlist(); 
		list.removeDuplicates1();
		list.printlist(); 
		list.swapNodes(6,7);
		list.swapNodes(7,6);
		list.pairwiseSwap();
		list.pairwiseSwap();
		// Move last element of LL to front
		//list.moveToFront();
		//list.moveAllOddtoEnd();
		list.reverse();
		list.printlist(); 

		
		
	}
}