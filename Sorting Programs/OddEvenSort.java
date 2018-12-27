import java.util.Arrays;
class OddEvenSort {
	public static void oddEvenSort(int[] arr, int n) {
		
	boolean isSorted = false;
		
	while (!isSorted) {
		isSorted = true;
		
		for (int i=1; i<=n-2; i=i+2) { 
			if (arr[i] > arr[i+1]) { 
				arr[i] = swapFunction(arr[i+1],arr[i+1]=arr[i]);
				isSorted = false; 
			} 
		} 

		for (int i=0; i<=n-2; i=i+2) { 
			if (arr[i] > arr[i+1]) { 
				arr[i] = swapFunction(arr[i+1],arr[i+1]=arr[i]);
				isSorted = false; 
			} 
		} 
	}
	return;
	}
		
	public static int swapFunction(int first, int second){
			return first;
	}	
		
		
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7, 10, 19}; 
		System.out.println("Before Sorting = "+Arrays.toString(arr));
		int n = arr.length; 
		OddEvenSort oe = new OddEvenSort(); 
		oe.oddEvenSort(arr,n); 
		System.out.println("Before Sorting = "+Arrays.toString(arr));
	}
}
