Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the string. 

Use the Parameter Testing feature in the box below to test your code with different arguments.

import java.util.*; 
import java.io.*;

class Main {  
  public static String AlphabetSoup(String str) { 
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
        
    return new String(chars);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }   
  
}