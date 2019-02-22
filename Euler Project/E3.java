import java.util.*; 
import java.lang.*; 
  
class GFG  
{ 
	// Fucntion to calculate sum 
	public static int summation(int n) 
	{ 
		int sum = 0; 
		for (int i = 1; i <= n; i++) 
			sum += (i * i); 
  
		return sum; 
	} 
  
	// Driver code 
	public static void main(String args[]) 
	{ 
		int n = 100; 
		System.out.println(summation(n)); 
	} 
} 
  
//Sum of the squares
//338350

//5050
//25,502,500