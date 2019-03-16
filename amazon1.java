import java.util.*;
class Untitled {
	public static void main(String[] arg) {
		String inputstr = "awglkngawunagwkwagl";
		
		int k = 4;
		
		String args[] = new String[inputstr.length()-3];
		for(int i=0;i<args.length;i++){
			args[i]=inputstr.substring(i, i+k);
			//set1.add(args[i]);
			//System.out.println(args[i]);
		}
		Set<String> set2 = new TreeSet<String>();
		
		for(String s:args){
			Set<Character> set1 = new HashSet<Character>();
			for (int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				if(!set1.contains(c)){
					set1.add(c);
				} else {
					break;
				}
				if(i==s.length()-1){
					set2.add(s);
				}
			}
		}

		System.out.println(set2); 		
		 
	}
}
