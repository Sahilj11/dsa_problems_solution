public class moveZero {
	public static void main(String[] args) {
		int[] arr = {0,1,2,0,1,2};
		int i = 0;
		int endKey = arr.length - 1;
		while( i < endKey){
			if(arr[endKey] == 0){
				endKey--;
			}
			if(arr[i] == 0){
				for (int j = i+1; j <= endKey; j++) {
					arr[j-1] = arr[j];
				}
				arr[endKey] = 0;
				endKey--;
				i++;
			}else{
				i++;
			}
		}
		for (int var : arr) {
			System.out.println(var);
			
		}
	}
}
