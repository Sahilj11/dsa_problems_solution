public class gcdEculideAlgo {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 12;
        int greater = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);
        System.out.println(eculide(greater, smaller));
    }

    static int eculide(int greater, int smaller) {
        if (smaller == 0) {
            return greater;
        }
        int temp = smaller;
        smaller = greater % smaller;
        greater = temp;
        return eculide(greater, smaller);
    }

}
