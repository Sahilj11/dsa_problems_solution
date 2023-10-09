public class reverseDigits {
    public static void main(String[] args) {
        int input = 1234;
        reverse(input);
    }

    static void reverse(int input) {
        int reversed = 0;
        while (input != 0) {
            int temp = input % 10;
            reversed = temp + reversed * 10;
            input = input / 10;
        }
        System.out.println(reversed);
    }
}
