public class JumpSearch 
{ 
	public static int jumpSearch(int[] arr, int x) 
	{ 
		int n = arr.length; 
		int step = (int) Math.floor(Math.sqrt(n)); 
		int prev = 0, i = 0;
		
		while (i < n && arr[i] < x) {
			 prev = i;
			 i += step;
		}
		
		if (i >= n)
			return -1;
		
		// Linear search in part
		do {
			++prev;
		} while (arr[prev] < x && prev < i);

		if (arr[prev] == x)
			return prev;
		
		return -1; 
	} 
  
	public static int jump_search(int[] arr, int x) 
	{ 
		int n = arr.length; 
		int step = (int) Math.floor(Math.sqrt(n)); 
		int prev = 0, i = 0;
		
		for (; i < n && arr[i] < x; prev = i, i += step);
		
		if (i >= n) return -1;
		
		for (++prev; arr[prev] < x && prev < i; ++prev);

		return (arr[prev] == x) ? prev : -1; 
	} 

	// Driver program to test function 
	public static void main(String [ ] args) 
	{ 
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
					34, 55, 89, 144, 233, 377, 610}; 
		int x = 55; 
		int index = jumpSearch(arr, x); 
		System.out.println("\nNumber " + x + " is at index " + index); 
	} 
} 