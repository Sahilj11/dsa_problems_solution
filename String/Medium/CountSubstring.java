/**
 * CountSubstring
 */
public class CountSubstring {
    // TODO: USING TRIE 
    public static void main(String[] args) {
        String str = "abcd";
        int k = 4;
        if (k > str.length()) {
           return; 
        }
        brute(str, k);
    }

    private static void brute(String str, int k) {
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            String temp = "" + str.charAt(i);
            int count = 1;
            while (j != i) {
                if (count == k) {
                    break;
                }
                if (j >= str.length() && i == 0) {
                    break;
                } else if (j >= str.length()) {
                    j = 0;
                    temp += str.charAt(j);
                    j++;
                    count++;
                } else {
                    temp += str.charAt(j);
                    j++;
                    count++;
                }
            }
            System.out.println(temp);
        }
    }
}
