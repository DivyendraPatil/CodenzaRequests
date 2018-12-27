package LLTest;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtHead(4);
		list.insertAtHead(14);
		list.insertAtHead(24);
		list.insertAtHead(34);
		list.insertAtHead(54);
		
		System.out.println(list);
		System.out.println("Length: "+ list.length());
		
		list.insertAtHead(64);
		System.out.println(list);
		list.deleteFromHead();
		System.out.println(list);
		
		System.out.println("Found: "+ list.search(14));
		
	}
}