public class sumOfN {
    public static void main(String[] args) {
        int N = 3;
        int sum = 0;
        System.out.println(sumRecur(N, sum));
    }

    static int sumRecur(int N, int sum) {
        if (N < 1) {
            return sum;
        }
        sum += N;
        return sumRecur(N - 1, sum);
    }

}
