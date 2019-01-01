import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String str) { 
    String newstring = "";
    String newstring2 = "";
    
    for(int i=0; i<str.length(); i++){
			if(str.charAt(i) > 96 && str.charAt(i) < 122)
				newstring = newstring + (char)(str.charAt(i) + 1);
			else if(str.charAt(i) == 122) // For z to become a
				newstring += (char)97;
			else
				newstring += (char)str.charAt(i);
		}
    newstring2 = newstring.replaceAll("a" ,"A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o","O").replaceAll("u", "U");
		
    return newstring2;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}


  

/* 
import java.util.*; 
import java.io.*;

class Main {  
    public static String LetterChanges(String str) {
        StringBuilder result = new StringBuilder();
        char[] strChars = str.toLowerCase().toCharArray();
        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        for (int i = 0; i < str.length(); i++) {
            if((strChars[i] >= 'a' && strChars[i] <= 'z')){
                result.append(replacements[strChars[i] - 97]);
            } else {
                result.append(strChars[i]);
            }
        }
        return result.toString();
    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}