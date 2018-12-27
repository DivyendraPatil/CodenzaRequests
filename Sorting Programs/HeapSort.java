import java.util.Arrays;
class HeapSort { 
	public void HeapSort(int arr[]) { 
		int n = arr.length; 
  
		// Build heap (rearrange array) 
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i); 
		}
  
		// One by one extract an element from heap 
		for (int i = n-1; i >= 0; i--) { 
			// Move current root to end 
			arr[0] = swapFunction(arr[i], arr[i] = arr[0]);
  
			// call max heapify on the reduced heap 
			heapify(arr, i, 0); 
		} 
	} 
  
	// To heapify a subtree rooted with node i which is 
	// an index in arr[]. n is size of heap 
	void heapify(int arr[], int n, int i) { 
		int largest = i; // Initialize largest as root 
		int left = 2*i + 1; // left = 2*i + 1 
		int right = 2*i + 2; // right = 2*i + 2 
  
		// If left child is larger than root 
		if (left < n && arr[left] > arr[largest]) {
			largest = left; 
		}
  
		// If right child is larger than largest so far 
		if (right < n && arr[right] > arr[largest]) {
			largest = right; 
		}
  
		// If largest is not root 
		if (largest != i) { 
			//swap
			arr[i] = swapFunction(arr[largest], arr[largest] = arr[i]);
			// Recursively heapify the affected sub-tree 
			heapify(arr, n, largest); 
		} 
	} 
  
	static void printArray(int arr[]) { 
		System.out.println("After Sorting ="+Arrays.toString(arr));
	} 
	
	public static int swapFunction(int first, int second){
			return first;
	}
  
	// Driver program 
	public static void main(String args[]) { 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		System.out.println("Before Sorting ="+Arrays.toString(arr));
		int n = arr.length; 
		HeapSort hp = new HeapSort(); 
		hp.HeapSort(arr); 
		printArray(arr); 
	} 
} 