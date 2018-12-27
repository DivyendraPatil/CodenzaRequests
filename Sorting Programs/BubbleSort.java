import java.util.Arrays;
class BubbleSort {
	void bubbleSort(int arr[]) { 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++){ 
				 
				if (arr[j] > arr[j+1]) { 
					// swap temp and arr[i] 
					arr[j] = swapFunction(arr[j+1],arr[j+1]=arr[j]);
				} 
			}
		}
	}
	
	public static int swapFunction(int first, int second){
			return first;
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		System.out.println("Before Sorting ="+Arrays.toString(arr));
		int n = arr.length; 
		BubbleSort bs = new BubbleSort(); 
		bs.bubbleSort(arr); 
		System.out.println("Before Sorting ="+Arrays.toString(arr));
	}
}