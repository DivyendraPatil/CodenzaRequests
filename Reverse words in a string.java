import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String str = "Hello World I am Human";
		
		// Using StringBuilder
		StringBuilder sb = new StringBuilder();
		int j=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				sb.insert(0,str.substring(j,i));
				j=i;
			}
		}
		sb.insert(0,str.substring(j,str.length()));
		System.out.print(sb);
		
		// Using List
		List <String> ls = new ArrayList<String>();
		int j=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				ls.add(str.substring(j,i));
				j=i;
			}
		}
		ls.add(str.substring(j,str.length()));
		System.out.print(ls.toString());
		Collections.reverse(ls);
		System.out.print(ls.toString());
		
	}
}
