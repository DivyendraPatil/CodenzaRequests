import java.util.*;
class Untitled {
	public static void main(String[] args) {
		
		/* 
		Print all values of string s which are not in words to exclude and having the higest frequency.
		*/
		String s="Betty bought a butter but the butter was bitter, so she bought another butter to make the bitter butter better";
		String wordsToExclude[] =  {"bought","a","the","but","so","was","to","she"};
		
		Set<String> words = new HashSet<>();
		for (String w:wordsToExclude) {
			words.add(w);
		}
		
		String arg[]= s.toLowerCase().split("[^a-z]");
		
		//System.out.println(Arrays.toString(arg));
		
		List<String> ls = new ArrayList<>();
		TreeMap<String,Integer> tm = new TreeMap<>();
		for (int i=0;i<arg.length;i++) {
			String s1 = arg[i].trim();
			if (s1.length()!=0 && !words.contains(s1)) {
				int add = tm.getOrDefault(s1,0)+1;
				tm.put(s1,add);
			}
		}
		int max = tm.values().stream().max(Integer::compare).get();
		//System.out.print(max);
		
		List<String> result = new ArrayList<>();
		
		for(Map.Entry<String,Integer> entry : tm.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			if(value==max){ result.add(key); }
			//System.out.println(key + " => " + value);
		}
		
		for (String r : result) {
			System.out.print(r);
		}
	}
}
