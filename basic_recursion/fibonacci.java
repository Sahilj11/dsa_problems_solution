public class fibonacci {
    public static void main(String[] args) {
        int N = 10;
        int[] fibArr = new int[N + 1];
        for (int i = 0; i < fibArr.length; i++) {
            if (i == 0) {
                fibArr[i] = 0;
            } else if (i == 1) {
                fibArr[i] = 1;
            } else {
                fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
            }
        }
        for (int i : fibArr) {
            System.out.print(i);
            System.out.print(',');
        }
    }
}
