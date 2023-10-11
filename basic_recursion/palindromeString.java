import java.util.Arrays;
import java.util.Collections;

public class palindromeString {

    public static void main(String[] args) {
        String str = "sahil jalandhara";
        String[] arr = str.split(" ");
        Collections.reverse(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {

        }
        for (String string : arr) {

            System.out.println(string);
        }
    }

    static String revString(String word) {
        String[] arr = word.split("");
        String[] reverseArr = new String[arr.length];
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}