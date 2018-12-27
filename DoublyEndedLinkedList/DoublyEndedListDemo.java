package LLTest;
public class DoublyEndedListDemo {
	public static void main(String[] args) {
		DoublyEndedList dlist = new DoublyEndedList();
		
		dlist.insertAtTail(19);
		dlist.insertAtTail(18);
		dlist.insertAtTail(17);
		dlist.insertAtTail(34);
		dlist.insertAtTail(54);
		
		System.out.println(dlist);		
	}
}