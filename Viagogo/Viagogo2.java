import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// 0,1,2,3,5,6

 class Solution {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		
		int[] missingNumberArray = new int[] {0,1,2,3,5,6,7};
		
		int len = missingNumberArray.length;
		boolean present = true;
		int i;
		
		for (i = 0; i < len && present; ++i) {
			present = (i == missingNumberArray[i]);
		}
		
		if (present) {
			System.out.println(i);
		} else {
			System.out.println(i-1);
		}
	}
}