class Untitled {
	public static void main(String[] args) {
		for(int a = 1; a<=1000; a++){
			for (int b = 2; b<=1000; b++){
				for (int c = 3; c<=1000; c++){
					if ((Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2)) && (a+b+c)==1000)
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
	}
}