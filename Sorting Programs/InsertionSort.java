import java.util.Arrays;
class InsertionSort { 
	void insertionSort(int arr[]) { 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int current = arr[i]; // Sets the first sorted element & sets it to current
			int j = i-1; 
			while (j>=0 && arr[j] > current) { // Shifts all elements to the right 
				arr[j+1] = arr[j]; 		       // to create space for the leftmost element
				j = j-1; 
			} 
			arr[j+1] = current; 
		} 
	} 
  
	public static void main(String args[]) {         
		int arr[] = {12, 11, 13, 5, 6, 10, 19}; 
		System.out.println("Before Sorting = "+Arrays.toString(arr));
		InsertionSort ob = new InsertionSort();         
		ob.insertionSort(arr);  
		System.out.println("After Sorting = "+Arrays.toString(arr));
	} 
}