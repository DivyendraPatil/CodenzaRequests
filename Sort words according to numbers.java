import java.io.*;
import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String words = "is2 Thi1s T4est 3a";
		//Out put: [Thi1s, is2, 3a, T4est]
		String wordarrays[] = words.split(" ");
		int length = wordarrays.length;
		String newarray[] = new String[length];
			
		//System.out.print(Integer.parseInt(wordarrays[0].replaceAll("[^0-9]", "")));
		
		for(int i=0; i<length; i++){
			newarray[Integer.parseInt(wordarrays[i].replaceAll("[^0-9]", ""))-1] = wordarrays[i];
		}
		
		System.out.print(Arrays.toString(newarray));	
		
	}
}
