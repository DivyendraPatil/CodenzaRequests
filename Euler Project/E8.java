import java.io.*; 
import java.util.*; 
import java.lang.*; 
class Untitled1 {
	
	static long countDivisors(long n){ 
			long cnt = 0; 
			for (long i = 1; i <= Math.sqrt(n); i++) 
			{ 
				if (n % i == 0) { 
					// If divisors are equal, 
					// count only one 
					if (n / i == i) 
						cnt++; 
	  
					else // Otherwise count both 
						cnt = cnt + 2; 
				} 
			} 
			return cnt; 
		} 
	
	public static void main(String[] args) {
		//Triangle series
		long sum = 0;
		//long arr[] = new long[100000];
		for (int i = 15918; i <= 100000; i++) {
			sum = sum + i;
			//arr[i-1]=
			long number = countDivisors(sum);
			System.out.println("For i = "+i+" has Number = "+sum+" the number of factors are "+number);
			if (number> 500) {
				System.out.print(sum);
				break;
			}
			
			//System.out.println(sum);
		}
		
	}
}