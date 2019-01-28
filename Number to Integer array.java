int n = 46288;
//1
int[] newarray = Integer.toString(n).chars().map(c -> c-'0').toArray(); 

//2
String temp = Integer.toString(n);
int[] newGuess = new int[temp.length()];
for (int i = 0; i < temp.length(); i++) {
	newGuess[i] = temp.charAt(i) - '0';
}

//3
int len = Integer.toString(n).length();
int[] arr = new int[len];
do { 
arr[i] = number % 10; 
number /= 10; 
i++; 
} while (number != 0); 

//4
while (i < 4) {
	digits[i] = target % 10;
	target /= 10;
	i++;
}
