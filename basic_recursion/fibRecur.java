public class fibRecur {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(fibCal(N));
    }

    static int fibCal(int N) {
        if (N == 1) {
            return N;
        }
        if (N == 0) {
            return N;
        }
        return (fibCal(N - 1) + fibCal(N - 2));

    }

}
