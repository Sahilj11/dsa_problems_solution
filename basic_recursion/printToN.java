public class printToN {
    public static void main(String[] args) {
        int N = 10;
        int temp = 1;
        recurNumber(N, temp);
    }

    static int recurNumber(int N, int temp) {
        if (temp > N) {
            return N;
        }
        System.out.println(temp);
        return recurNumber(N, temp + 1);
    }
}
