class rotateArr {
  public static void main(String[] args) {
    int arr[] = { 5, 4, 3, 2, 1 };
    int len = arr.length;
    if (len <= 1) {
      return;
    }
    int firstVar = arr[0];
    for (int i = 1; i < len; i++) {
      arr[i - 1] = arr[i];
    }
    arr[len - 1] = firstVar;
    for (int var : arr) {
      System.out.println(var);
    }
  }
}
