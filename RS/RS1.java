import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;


public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      int left = 0;
      int right = 0;
      
      try{
        for(int i=0;i<line.length();i++){
          if(line.substring(i,i+2).equals("/*")){if(line.charAt(i+2) == ' ') left+=1;}
          else if(line.substring(i,i+2).equals("*/") && left > right){right+=1;}
        }
      } catch (Exception e) { }
      
      if(left == right && left != 0){
        System.out.println("True");
      } else {
        System.out.println("False");
      }
      
      
    }
  }
}
