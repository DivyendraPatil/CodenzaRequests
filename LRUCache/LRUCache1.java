// LRU with Deque and HashSet
import java.util.*;
class LRUCache {
	static Deque<Integer> dq;
	static HashSet<Integer> map;
	static int size;
	
	LRUCache(int n){
		dq = new LinkedList<>();
		map = new HashSet<>();
		size = n;
	}
	
	public void value(int x){
		if (!map.contains(x)) {
			if (dq.size()==size) {
				int last = dq.removeLast();
				map.remove(last);
			}
		} else {
			int location = 0, i=0;
			Iterator<Integer> itr = dq.iterator();
			while (itr.hasNext()) {
				if (itr.next()==x) {
					location = i;
					break;
				}
				i++;
			} dq.remove(location-1);
			System.out.println("Loca = "+location);
		}
		dq.push(x);
		map.add(x);
	}
	
	public void display(){ 
		Iterator<Integer> itr = dq.iterator(); 
		while(itr.hasNext()) { 
			System.out.print(itr.next()+" "); 
		} 
		System.out.println();
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
		cache.value(1); // 1
		cache.display();
		cache.value(2); // 2 1
		cache.display();
		cache.value(3); // 3 2 1
		cache.display();
		cache.value(1); // 1 3 2
		cache.display();
		cache.value(4); // 4 1 3 2
		cache.display();
		cache.value(5); // 5 4 1 3
		cache.display();
		cache.value(2); // 2 5 4 1
		cache.display();
	}
}