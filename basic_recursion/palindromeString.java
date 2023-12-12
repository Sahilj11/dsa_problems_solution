public class palindromeString {

    public static void main(String[] args) {
        // TODO: checking palindrome string
        String str = "TAKE U FORWARD";
        String[] arr = str.split(" ");
        int firstKey = 0;
        int lastKey = arr.length - 1;
        boolean palindrome = false;
        for (int i = 0; i < arr.length; i++) {
            if (firstKey > lastKey) {
                break;
            } else if (arr[firstKey].equals(arr[lastKey])) {
                palindrome = true;
                firstKey++;
                lastKey--;
            } else {
                palindrome = false;
                firstKey++;
                lastKey--;
            }
        }
        System.out.println(palindrome);
    }
}
