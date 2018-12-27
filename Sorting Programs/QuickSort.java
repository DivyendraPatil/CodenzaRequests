import java.util.Arrays;
class QuickSort {
	public static void quicksort(int[] array){
		quicksort(array,0,array.length-1);
	}
	 
	public static void quicksort(int[] array, int left, int right){
		if(left>=right){
			return;
		}
		int pivot = array[(left+right) / 2];
		int index = partition(array,left,right,pivot);
		quicksort(array,left,index-1);
		quicksort(array,index,right);
	}
	 
	public static int partition(int[] array, int left, int right, int pivot){
		while(left<=right){
			while(array[left] < pivot){
				left++;
			}
	 
			while(array[right] > pivot){
				right--;
			}
	 
			if (left <= right){
				//swap
				array[left] = swapFunction(array[right],array[right]=array[left]);
				left++;
				right--;
			}
		}
	 
		return left;
	}

	public static int swapFunction(int first, int second){
			return first;
	}
	
	public static void main(String args[]) { 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		System.out.println("Before Sorting ="+Arrays.toString(arr));
		int n = arr.length; 
		QuickSort qs = new QuickSort(); 
		qs.quicksort(arr); 
		System.out.println("Before Sorting ="+Arrays.toString(arr));
		
	} 
}