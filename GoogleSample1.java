class Untitled {
	public static void main(String[] args) {
		int arr[] = new int[]{0,1,2,50,52,75};
		//"3-49,51,53-74,76-99"  
		
		StringBuilder str = new StringBuilder();
		
		for(int i=0;i<arr.length-1;i++){
			if (arr[i]!=arr[i+1]-1) {
				str.append(arr[i]+1);
				str.append("-");
				str.append(arr[i+1]-1);
				str.append(",");
			}
		}
		str.append(arr[arr.length-1]+1);
		str.append("-");
		str.append("99");
		
		System.out.println(str);
		
	}
}
