import java.util.Arrays;
class LinearSearch { 
	static int LinearSearch(int arr[], int x) { 
		int n = arr.length;
		for (int i = 0; i < n; i++) { 
			if (arr[i] == x) {
				return i; 
		} 
	}
	return -1; // If value is not found 
	} 
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6}; 
		System.out.println("Array = "+Arrays.toString(arr));
		int n = 5;
		LinearSearch obj = new LinearSearch();
		System.out.println("Element Found at Postiion : "+obj.LinearSearch(arr,n));
	}
}