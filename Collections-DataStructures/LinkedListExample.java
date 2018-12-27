import java.util.LinkedList;
import java.util.ListIterator;

class LinkedListExample {
	public static void main(String[] args) {
		LinkedList states = new LinkedList();
		
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("Pennsylvania");
		states.add("California");
		states.add("Colorado");
		states.add("Connecticut");
		
		states.addFirst("Alabama");
		System.out.println(states);
		System.out.println("last state in my list: "+states.getLast());
		
		ListIterator iterator = states.listIterator(states.size());
		// Print Reverse
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		System.out.println("\n");
		// Print Forward
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}


