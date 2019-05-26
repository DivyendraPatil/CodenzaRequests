import java.util.*;

class LRUCacheHashMap {
	static LinkedList<Integer> ll; //Store keys of cache
	static HashMap<Integer,String> map; //Store reference of keys in cache
	static int cacheSize;
	
	LRUCacheHashMap(int value){
		ll = new LinkedList<>();
		map = new HashMap<>();
		cacheSize = value;
	}
	
	void put(int key,String value){
		if (!map.containsKey(key)) {
			if (ll.size()==cacheSize) {
				int last = ll.removeFirst();
				map.remove(value);
			}
		} else {
			int i = 0;
			Iterator<Integer> itr = ll.iterator();
			while (itr.hasNext()) {
				if (itr.next()==key) {
					break;
				}
				i++;
			} 
			ll.remove(i);
			map.remove(value);
		}
		ll.addLast(key);
		map.put(key, value);
	}
	
	void refer(int key){
		int i = 0;
		Iterator<Integer> itr = ll.iterator();
		while (itr.hasNext()) {
			if (itr.next()==key) {
				break;
			}
			i++;
		} 
		ll.remove(i);
		ll.addLast(key);
	}
	
	void printCache(){
		Iterator<Integer> itr = ll.iterator(); 
		System.out.print("[ ");
		while(itr.hasNext()) { 
			System.out.print(itr.next()+" ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		LRUCacheHashMap cache = new LRUCacheHashMap(4);
		cache.put(2,"babana");
		cache.put(3,"carrot");
		cache.put(4, "grapes");
		cache.refer(3);
		cache.printCache();
		// [2, 3, 4]
	}
}