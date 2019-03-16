import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      String[] tuples = line.split(";");
      Arrays.sort(tuples);
      int[][] intervals = new int[2][tuples.length];
      
      for (int i = 0; i < tuples.length; ++i) {
        String[] inter = tuples[i].split(",");
        intervals[0][i] = Integer.parseInt(inter[0]);
        intervals[1][i] = Integer.parseInt(inter[1]);        
      }
      
      int overlaps = 0;
       
      for (int i = 0; i < tuples.length-1; ++i) {
        for (int j = i+1; j < tuples.length; ++j) {
         if (intervals[1][i] <= intervals[0][j]) break;
          overlaps++;
        }
      }
      System.out.println(overlaps);
      //System.out.println(Arrays.toString(tuples));
    }
  }
}
