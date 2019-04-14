import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String str = "abbccccdddd";
		int length = str.length();
		
		System.out.println("For all the substrings");
						System.out.println();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				System.out.println(str.substring(i,j));
			}
		}
		
		System.out.println("For all unique substring");
						System.out.println();
						
		Set<String> set = new HashSet<String>();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				String test = str.substring(i,j);
				set.add(test);
			}
		}
		System.out.println(set);
		System.out.println();
		System.out.println("For all unique substring in order");
				System.out.println();
		
		Set<String> lhs = new LinkedHashSet<String>();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				String test = str.substring(i,j);				
				lhs.add(test);
			}
		}
		
		System.out.println(lhs);
		System.out.println();
		System.out.println("For all unique substring with unique characters in order");
		System.out.println();
		
		Set<String> lhs2 = new LinkedHashSet<String>();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				String test = str.substring(i,j);
				char[] arr = test.toCharArray();
					
				Set<Character> charSet = new LinkedHashSet<Character>();
				for (char c : arr) {
					charSet.add(c);
				}
				
				StringBuilder sb = new StringBuilder();
				for (Character character : charSet) {
					sb.append(character);
				}
				
				lhs2.add(sb.toString());
			}
		}
		System.out.println(lhs2);
	}
}