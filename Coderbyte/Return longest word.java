//Return longest word

import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord(String sen) { 
    String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
    String maxlethWord = "";
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > maxlethWord.length()){
                  maxlethWord = words[i];
            } 
        }
    return maxlethWord;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}