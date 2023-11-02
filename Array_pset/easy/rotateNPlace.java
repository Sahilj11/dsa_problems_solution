class rotateNPlace {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int k = 3;
    rotateFun(arr, k);
  }
  static void rotateFun(int[] arr, int k){
      for (int i = 0; i < k; i++) {
          int first = arr[0];
           for (int j = 1; j < arr.length; j++) {
               arr[j-1] = arr[j];
           } 
           arr[arr.length - 1] = first;
      }
      for (int i : arr) {
        System.out.println(i);
      }
  }
}
