class InterpolationSearch { 
	
	static int interpolationSearch(int arr[],int x) {
		int low = 0, high = (arr.length - 1),pos; 
		
		for (;low <= high && x >= arr[low] && x <= arr[high];) {
			pos = low + (((high-low) / (arr[high]-arr[low]))*(x - arr[low]));
			
			if (arr[pos]==x) {
				return pos;
			}else if (arr[pos]<x) {
				low=pos+1;
			}else {
				high=low-1;
			}
			
		//(arr[pos]==x) ? return pos : ((arr[pos] < x) ? low=pos+1 : high=pos-1);
		}
		return -1;
	}	
	// Driver method  
	public static void main(String[] args) {
        int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23}; 
        int x = 22;
        int index = interpolationSearch1(arr,x); 
        System.out.println((index<0)? "Element is not present " : "Element is found at " + index);           
	} 
} 