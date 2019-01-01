Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon. 
Sample Test Cases
Input:126

Output:"2:6"


Input:45

Output:"0:45"

import java.util.*; 
import java.io.*;

class Main {  
  public static String TimeConvert(int num) { 
    return (num / 60 + ":" + num % 60);
  } 
  
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}


  