/**
 * Largestodd
 */
public class Largestodd {

    public static void main(String[] args) {
        String s = "10133890";
        optimul1(s);
    }

    private static void brute(String s) {
        int pointer = -1;
        String largestOdd = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) % 2 != 0) {
                pointer = i;
            }
        }
        if (pointer >= 0) {
            for (int i = 0; i <= pointer; i++) {
                largestOdd += s.charAt(i);
            }
        }
        System.out.println(largestOdd);
    }

    private static String optimul1(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((int) s.charAt(i) % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return ans;
    }
}
