Have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable sequence by either returning the string true or false. The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would be false. The string will not be empty and will have at least one letter. 

Use the Parameter Testing feature in the box below to test your code with different arguments.

Input:"+d+=3=+s+"

Output:"true"


Input:"f++d+"

Output:"false"



import java.util.*; 
import java.io.*;

class Main {  
  public static String SimpleSymbols(String str) { 
  
  int length = str.length();
  if (str.charAt(0) >= 65 && str.charAt(0) <= 122){
      return "false";
  } else if (str.charAt(length-1) >= 65 && str.charAt(length-1) <= 122){
      return "false";
  }
		
    for(int i=1;i<str.length();i++){
        if (str.charAt(i) >= 65 && str.charAt(i) <= 122) {
            if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                return "false";
            }
        }
    }
       
    return "true";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }   
  
}