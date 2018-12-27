import java.util.Arrays;
class BinarySearch { 

	int binarySearch(int arr[], int x) { 
		int left = 0, right= arr.length - 1; 
		while (left<= right) { 
			int mid = left+ (right - left)/2; 
			System.out.println("Mid = "+mid+" Left = "+left+" Right = "+right);
			if (arr[mid] == x) {
				return mid; 
			}
	 
			if (arr[mid] < x) {
				left = mid + 1; 
			} else {
				right = mid - 1; 
			}
		} 
		return -1; 
	} 
  
	// Driver method to test above 
	public static void main(String args[]) { 
		BinarySearch bs = new BinarySearch(); 
		int arr[] = {2,3,4,10,40,50,60,70,80,90}; 
		System.out.println("Array ="+Arrays.toString(arr));
		int n = arr.length; 
		int x = 80; 
		int result = bs.binarySearch(arr,x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 