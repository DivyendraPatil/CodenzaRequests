import java.util.*; 
import java.io.*;
//Capitalize First letter of every word
class Main {  
	public static String LetterCapitalize(String str) { 
	StringBuilder sb = new StringBuilder();
				 
		String[] arr = str.split("\\s");
		for (int x=0; x<arr.length; x++){
			sb.append(arr[x].substring(0, 1).toUpperCase() + arr[x].substring(1));
			sb.append(" ");
		}
	return sb.toString().trim();
} 

public static void main (String[] args) {  
	Scanner s = new Scanner(System.in);
	System.out.print(LetterCapitalize(s.nextLine())); 
  }   	
}
