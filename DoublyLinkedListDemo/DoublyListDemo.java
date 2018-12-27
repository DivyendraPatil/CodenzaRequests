package LLTest;
public class DoublyListDemo {
	public static void main(String[] args) {
		DoublyLinkedList integers = new DoublyLinkedList();
		
		integers.insertAtHead(19);
		integers.insertAtHead(18);
		integers.insertAtHead(17);
		integers.insertAtHead(34);
		integers.insertAtHead(54);
		
		System.out.println(integers);		
	}
}