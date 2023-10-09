class rotateNPlace {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int len = arr.length;
    int rotateSteps = 3;
    int firstVar = arr[0];
    for (int j = 0; j < rotateSteps; j++) {
      for (int i = 1; i < len; i++) {
        arr[i - 1] = arr[i];
      }
      arr[len - 1] = firstVar;
      firstVar = arr[0];
    }
    for (int var : arr) {
      System.out.println(var);
    }
  }
}
