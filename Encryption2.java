import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String s = "welcometojava";
		int k =3;
		String smallest = "";
		String largest = "";
		int length = s.length()+1-k;
		String [] SArray = new String[length];
		
		for(int i=0;i<=(s.length()-k);i++){
			SArray[i] = s.substring(i,i+k);
			System.out.println(SArray[i]);
		}
		System.out.println(SArray.length);
		
		for(int i = 0; i <SArray.length; i++) {
			for (int j = 0; j <(SArray.length-i-1); j++){ 
				if(SArray[j].compareTo(SArray[j+1])>0){
					String temp = SArray[j]; 
					SArray[j] = SArray[j+1]; 
					SArray[j+1] = temp; 
				}
			}
		}

		System.out.println(Arrays.toString(SArray));
		smallest = SArray[0];
		largest = SArray[SArray.length-1];
	}
}
