class removeDuplicate{
	public static void main(String[] args){
		int[] arr = {1,2,4,5,5,6,7,8,8};
    int len = arr.length;
    int[] newArr = new int[len];
    int duplicate = 0;
    for (int i = 0; i < len-1; i++) {
      if(arr[i] == arr[i+1]){
        continue;
      }else{
        newArr[duplicate] = arr[i];
        duplicate++;
      }
    }
    for(int i : newArr){
      System.out.println(i);
    }
	}
}
