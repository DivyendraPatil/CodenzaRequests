import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterCapitalize(String str) { 
    StringBuilder newstring = new StringBuilder();
    String[] arr = str.split("\\s");
    
    for (int i=0; i<arr.length; i++) {
          newstring.append(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1));
          newstring.append(" ");
    }
    
    return newstring.toString().trim();
} 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}


  