import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class TableMapSet { 
	public static void main(String args[]) { 
		
		// - Hashtable is synchronized & it is thread-safe 
		// -  Hashtable doesn’t allow any null key or value
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>(); 
		ht.put(101," ajay"); 
		ht.put(101,"Vijay");  // Overrides the value of same key
		ht.put(102, "Ravi"); 
		ht.put(103, "Rahul"); 
		ht.put(104, "Rahul"); 
		System.out.println("-------------Hash table--------------"); 
		System.out.println(ht);
  
		// - HashMap is non synchronized & not-thread safe
		// - HashMap allows one null key and multiple null values
		// - HashMap is an advanced version and improvement on the Hashtable

		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(100,"Amit"); 
		hm.put(104,"Amit");  
		hm.put(101,"Vijay"); 
		hm.put(102,"Rahul"); 
		hm.put(102,"Rahul2");
		System.out.println("-----------Hash map-----------"); 
		System.out.println(hm);
		
		// Hash map & Hash Table allows duplicate values 
		// but overrides the value of same key
		
		// - null key values are allowed
		// - HashSet does not allow duplicate values.
		// - It provides add method (not put)
		// - HashSet class is non synchronized.
		// - HashSet doesn't maintain the insertion order. 
		// - contain method to check whether the object is already available in HashSet. 
        // - HashSet can be used where you want to maintain a unique list.
		// - Use HashSet when you don't need to map keys to values.
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");
		hs.add("Sunday");
		System.out.println("-----------Hash Set-----------"); 
		System.out.println(hs); 
	} 
} 