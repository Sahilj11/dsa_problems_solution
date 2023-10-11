public class printToN {
    public static void main(String[] args) {
        int N = 10;
        recurNumber(N, 1);
    }

    static int recurNumber(int N, int i) {
        if (i > N) {
            return N;
        }
        System.out.println(i);
        return recurNumber(N, i + 1);
    }
}
