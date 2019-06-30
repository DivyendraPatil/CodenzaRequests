import java.util.*;

class Untitled {
	
	public static void substring1(String str,int length){
		System.out.println("Start for all the substrings");
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				System.out.println(str.substring(i,j));
			}
		}
		System.out.println("End for all the substrings");
		System.out.println();
	}
	
	public static void substring2(String str,int length){
		System.out.println("Start for all unique substring");
		Set<String> set = new HashSet<String>();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				String test = str.substring(i,j);
				set.add(test);
			}
		}
		System.out.println(set);
		System.out.println("End for all unique substring");
		System.out.println();
	}
	
	public static void substring3(String str, int length){
		System.out.println("Start for all unique substring in order");
		Set<String> lhs = new LinkedHashSet<String>();
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				String test = str.substring(i,j);				
				lhs.add(test);
			}
		}
		System.out.println(lhs);
		System.out.println("End for all unique substring in order");
		System.out.println();
	}
	
	public static void substring4(String str, int length){
		System.out.println("Start for all unique substring with unique chars in order");
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
		System.out.println();
	}
	
	public static void main(String[] args) {
		String str = "abbccccdddd";
		int length = str.length();
		substring1(str,length);
		substring2(str,length);
		substring3(str,length);
		substring4(str,length);
	}
}