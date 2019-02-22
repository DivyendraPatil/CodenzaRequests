import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		long largePalindrome = 0;
		Set<Integer> ts = new TreeSet<Integer>();
		for(int i=100;i<1000;i++){
			for(int j=100;j<1000;j++){
				int number = i * j;
				String str = String.valueOf(number);
				
				if(str.length()>5){
					if(str.equals(new StringBuilder(str).reverse().toString())){
						ts.add(number);
					}
				}
			}
		}
		
		Iterator<Integer> i = ts.iterator();
		while ( i.hasNext() ){
				//Integer element = i.next();
			System.out.println(i.next());
		}
		
//		int [] result = ts.toArray(new int[ts.size()]);
//		Arrays.toString(result);
		//System.out.println(largePalindrome);
	}
}