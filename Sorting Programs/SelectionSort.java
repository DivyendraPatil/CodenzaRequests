import java.util.Arrays;
class SelectionSort {
	void SelectionSort(int arr[]){ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) { 
		// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j; 
				}
			}
			// We use min_idx to keep track of the item to be replaced
			// So we swap the min element with the first element 
			arr[min_idx] = swapFunction(arr[i],arr[i]=arr[min_idx]);
		} 
	}
	 
	public static int swapFunction(int first, int second){
			return first;
	}
	
	public static void main(String args[]) {         
		int arr[] = {12, 11, 13, 5, 6, 10, 19}; 
		System.out.println("Before Sorting = "+Arrays.toString(arr));
		SelectionSort ob = new SelectionSort();         
		ob.SelectionSort(arr);  
		System.out.println("After Sorting = "+Arrays.toString(arr));
	} 
}