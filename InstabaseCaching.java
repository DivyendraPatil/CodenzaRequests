import java.io.*;
import java.util.*;

/*
Name: Divyendra Patil
Role: Software Engineer
Portfolio: https://divyendra.com
Resume: https://divyendra.com/resume/DivyendraPatil_Resume.pdf
*/

/**
"Least recently used cache"

Cache cache = new Cache(3);
cache.put(1, "apple");
cache.put(2, "banana");
cache.put(1, "something");  map[1: something, 2:banana] int -> string

cache.get(1) --> "something"
cache.put(3, "cat");
cache.put(4, "dog");

cache[1 -> something, 3 -> cat, 4 -> dog]
**/

class Cache {
	private Map <Integer,String> lhm;
	private LinkedList <Integer> keys;
	private int Max_size;
	
	private Cache() {
		lhm = new LinkedHashMap<>();
		keys = new LinkedList<>();
	}
	
	Cache(int size) {
		this();
		Max_size = size;
	}
	
	public void put(Integer key, String value) {
		boolean old = false;
		if ((old = lhm.containsKey(key))) {
			refresh(key);
		} else if (keys.size() == Max_size) {
			removeEldest();
		}
		lhm.put(key,value);
		if (!old)
			keys.addLast(key);
	}
	
	public String get(Integer key) {
		String result = lhm.get(key);
		if (result == null) {
			result = "";
		} else {
			refresh(key);
		}
		return result;
	}
	
	private void remove(Integer key) {
		lhm.remove(key);
	}
	
	private void removeEldest() {
		remove(keys.getFirst());
		keys.remove(0);
	}
	
	private void refresh(Integer key) {
		keys.removeFirstOccurrence(key);
		keys.addLast(key);
	}
	
	public String status() {
		StringBuilder sb = new StringBuilder();
		/*sb.append("{");
		for (Integer key : lhm.keySet()) {
			sb.append(key);
			sb.append(":");
			sb.append(lhm.get(key));	
			sb.append(",");
		}
		sb.append("}\n");*/
		sb.append("[");
		for (Integer key : keys) {
			sb.append(key);
			sb.append(",");
		}
		sb.append("]");
		
		return sb.toString();
	}
}

class Solution {
		public static void main(String[] args) {
			
		//int arr = new int[10];
		//List<String> strings = new ArrayList<String>();
		Cache cache = new Cache(4);
		
		cache.put(100,"apple");
		cache.put(2,"babana");
		cache.put(3,"carrot");
		cache.put(4, "grapes");
		// [2, 3, 4]
		System.out.println(cache.get(2));
		//  3,4,2
		System.out.println(cache.get(4));
		// [3, 2, 4]
		System.out.println(cache.status());
		cache.put(3, "oranges");
		System.out.println(cache.status());
		// [4, 2, 3]
		cache.put(6, "pears");
		// [2, 3, 6]
		System.out.println(cache.status());
			
		System.out.println("Testing :: ");
		System.out.println(cache.get(100));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4)); // should not be there
		System.out.println(cache.get(5));
		System.out.println(cache.get(6));
			
	}
}