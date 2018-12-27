class FactorialExample{  
	public static void main(String args[]){  
		int fact=1, number=5;
		for(int n=number;n>=1;n--){
			fact=fact*n;
		}
		System.out.println("Factorial of "+number+" is: "+fact);    
	}  
}  