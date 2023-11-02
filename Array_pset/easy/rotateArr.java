class rotateArr {
  public static void main(String[] args) {
         int arr[] = { 5, 4, 3, 2, 1 };
         optimalFun(arr);
    }
  static void optimalFun(int[] arr){
      int first = arr[0];
      for(int i = 1; i < arr.length; i++) {
         arr[i-1] = arr[i]; 
      }
      arr[arr.length-1] = first;
      for (int i : arr) {
          System.out.println(i);
      }
  }
}
