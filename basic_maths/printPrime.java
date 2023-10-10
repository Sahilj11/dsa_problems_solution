public class printPrime {
    public static void main(String[] args) {
        int num = 11;
        boolean[] prime = new boolean[num + 1];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == true) {
                System.out.println(i);
            }
        }
    }

}
