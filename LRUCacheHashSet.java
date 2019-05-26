import java.util.*;

class LRUCacheHashSet {
	static LinkedList<Integer> ll; //Store keys of cache
	static HashSet<Integer> hs; //Store reference of keys in cache
	static int cacheSize;
	
	LRUCacheHashSet(int value){
		ll = new LinkedList<>();
		hs = new HashSet<>();
		cacheSize = value;
	}
	
	public void refer(int value){
		// If the hashset does not contain the value
		// but the LL is full, remove the first element from LL (LRU)
		// and from the map and later add the new element to the front and to the map
		if (!hs.contains(value)) {
			if (ll.size()==cacheSize) {
				int last = ll.removeFirst();
				hs.remove(last);
			}
		}else {
			// Find the element in the LL and remove it
			// and later add it back to the end
			int i = 0;
			Iterator<Integer> itr = ll.iterator();
			
			while (itr.hasNext()) {
				if (itr.next()==value) {
					break;
				}
				i++;
			} 
			ll.remove(i);
		}
		ll.addLast(value);
		hs.add(value);
	}
	
	void printCache(){
		Iterator<Integer> itr = ll.iterator(); 
		while(itr.hasNext()) { 
			System.out.print(itr.next()+" "); 
		} 
	}
	
	public static void main(String[] args) {
		LRUCacheHashSet lru = new LRUCacheHashSet(4);
		lru.refer(1);
		lru.refer(2);
		lru.refer(3);
		lru.refer(4);
		lru.refer(1);
		lru.refer(2);
		lru.refer(1);
		lru.printCache();
	}
}