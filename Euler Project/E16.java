class Untitled {
	public static void main(String[] args) {
		long finalsum =0;
		
		
		for (int i = 1; i <= 10000; i++) {
			
			long sum1 = 0;
			long sum2 = 0;
			long number = 0;
			
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum1 = sum1 +j;
				}
				number = i;
			}
			
			
			for(int j=1;j<sum1;j++){
				if(sum1%j==0){
					sum2 = sum2 +j;
				}
			}
			
			if(number==sum2 && sum2!=0 && sum1==sum2){
				//System.out.println(sum1);
				System.out.println("("+sum1+","+sum2+")");
				
				finalsum = finalsum + sum2;
			}		
		}
		
		System.out.println(finalsum);
	}
}