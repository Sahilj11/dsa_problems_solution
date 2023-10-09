public class palindrome {
    public static void main(String[] args) {
        int input = 555;
        System.out.println(checkPalidrome(input));
    }

    static boolean checkPalidrome(int input) {
        int reverse = 0;
        int tmpInput = input;
        while (tmpInput != 0) {
            int tmp = tmpInput % 10;
            reverse = tmp + reverse * 10;
            tmpInput = tmpInput / 10;
        }
        if (input == reverse)
            return true;
        else
            return false;
    }

}
