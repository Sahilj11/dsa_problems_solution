public class printReverseSeries {
    public static void main(String[] args) {
        int N = 10;
        reverseSeries(N);
    }

    static int reverseSeries(int N) {
        if (N < 1) {
            return N;
        }
        System.out.println(N);
        return reverseSeries(N - 1);
    }
}
