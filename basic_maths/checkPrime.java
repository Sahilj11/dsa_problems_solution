public class checkPrime {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(primeCheck(num));
    }

    static boolean primeCheck(int num) {
        for (int i = 2; i < (int) Math.sqrt((double) num); i++) {
            if (num % i == 0) {
                return false;
           }
        }
        return true;
    }
}
