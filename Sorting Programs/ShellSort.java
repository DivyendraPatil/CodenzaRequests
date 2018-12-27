import java.util.Arrays;
class ShellSort {
	int ShellSort(int arr[]) { 
		int n = arr.length; 
		for (int gap = n/2; gap > 0; gap = gap/2) { 
			for (int i = gap; i < n; i++) { 
	// add a[i] to the elements that have been gap 
	// sorted save arr[i] in temp and make a hole at 
	// position i 
				int temp = arr[i]; 
	// shift earlier gap-sorted elements up until 
	// the correct location for arr[i] is found 
				int j; 
				for (j = i; j >= gap && arr[j - gap] > temp; j=j-gap) {
					arr[j] = arr[j - gap]; 
				}
	// put temp in its correct location
				arr[j] = temp; 
			} 
		} return 0; 
	}
	
	public static void main(String args[]) {         
		int arr[] = {12, 11, 13, 5, 6, 19}; 
		System.out.println("Before Sorting = "+Arrays.toString(arr));
		ShellSort ob = new ShellSort();         
		ob.ShellSort(arr);  
		System.out.println("After Sorting = "+Arrays.toString(arr));
	} 
}