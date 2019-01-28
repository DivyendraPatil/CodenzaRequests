import java.io.*; 
import java.util.*; 
class Untitled {
	public static void main(String[] args) {
		// Encryption problem
//		3 6
//		9 1 1
	// fto ehg ee dd
	String s = "feedthedog";
		int length = s.length();
		double sqrt = Math.sqrt(length);
		int upper = (int) Math.ceil(sqrt), lower = (int) Math.floor(sqrt);
		
		System.out.println("Sqrt= "+sqrt+" Upper="+upper+" Lower="+lower);

		String[] strings = new String[lower];
		int index = 0;
		int i = 0;
		while (index < s.length()) {
			strings[i] = s.substring(index, Math.min(index + upper, s.length()));
			index = index + upper;
			i++;
		}	
		
		System.out.println(Arrays.toString(strings));
		
		i = 0;
		for(int k=0;k<upper;k++){
			try{
				for(int j=0;j<strings.length;j++){
				System.out.print(strings[j].charAt(k));
			}
			}catch(Exception e){
				
			}
			System.out.print(" ");
		}
		
		
		
		
	}
}
