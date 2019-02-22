import java.math.*;
class Untitled {
	public static void main(String[] args) {
		System.out.print(Math.pow(2,1000));
			BigInteger b1, b2; 
	  
			b1 = new BigInteger("2"); 
			int exponent = 1000; 
	  
			// apply pow() method 
			BigInteger result = b1.pow(exponent); 
	  
			// print result 
			System.out.println("Result of pow operation between BigInteger " + b1 
							   + " and exponent " + exponent + " equal to " + result); 
		} 
}