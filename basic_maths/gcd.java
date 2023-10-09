public class gcd {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 12;
        hcf(num1, num2);
    }

    static void hcf(int num1, int num2) {
        int smaller = Math.min(num1, num2);
        int greater = Math.max(num1, num2);
        for (int i = smaller; i >= 1; i--) {
            if (smaller % i == 0 && greater % i == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
