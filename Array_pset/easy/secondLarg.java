class secondLarg{
	public static void main(String[] arg){
		int[] arr = {0,5,4,3,2,1};
		int largest = arr[0];
		int largestIndex = 0;
		int secondLargest = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(largest < arr[i]){
				largest = arr[i];
				largestIndex = i;
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(i == largestIndex){
				continue;
			}else if(arr[i] > secondLargest){
				secondLargest = arr[i];
			}

		}
		System.out.println(secondLargest);
	}
}
