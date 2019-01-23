import java.util.*;

class Untitled {
	public static void main(String[] args) {
		 // Expected {3, 1, 2, 2, 2, 1};
		 int arr[] = new int[]{1, 1, 1, 2, 2, 1, 1};
		List <Integer> ls = new ArrayList<>();
		int count = 1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]){
				count++;
			} else {
				ls.add(count);
				ls.add(arr[i]);
				count = 1;
			}
		}
		ls.add(count);
		ls.add(arr[arr.length-1]);
		
		System.out.print(ls.toString());
	}
}
