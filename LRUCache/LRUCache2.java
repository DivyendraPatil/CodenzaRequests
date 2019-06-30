import java.util.*;

class Cache {
	static Map <Integer,String> map;
	static LinkedList<Integer> keys;
	static int cachesize;
	
	Cache(int n){
		map = new HashMap<>();
		keys = new LinkedList<>();
		cachesize = n;
	}
	
	public void put(int a, String str){
		if (!map.containsKey(a)) {
			if (map.size()==cachesize) {
				int val = keys.removeFirst();
				map.remove(val);
			}
		} else {
			keys.removeFirstOccurrence(a);
			map.remove(a);
		}
		// Add to LL and Map
		keys.add(a);
		map.put(a,str);
	}
	
	public void get(int a){
		if (!map.containsKey(a)) {
			System.out.println("Key not inside cache");
		} else {
			keys.removeFirstOccurrence(a);
			keys.add(a);
		}
	}
		
	public void display(){ 
		Iterator<Integer> itr = keys.iterator(); 
		while(itr.hasNext()) { 
			System.out.print(itr.next()+" "); 
		} 
		System.out.println();
	}
	
	public static void main(String[] args) {
		Cache c = new Cache(4);
		c.put(1,"a");
		c.put(2,"b");
		c.put(3,"c");
		// 1 2 3
		c.get(2);
		// 1 3 2
		c.put(4,"d");
		// 1 3 2 4
		c.display();
	}
}