import java.util.HashMap;
import java.util.Map;

/**
 * LongRepeating
 */
public class LongRepeating {

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(optimul(s, k));
    }

    private static int brute(String s,int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int kTemp = k;
            int temp = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    temp++;
                    continue;
                } else if(kTemp > 0){
                    kTemp--;
                    temp++;
                }else{
                    break;
                }
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    private static int optimul(String s, int k){
        int res = 0;
        int maxF = 0;
        int l = 0;
        int[] arr = new int[26];
        for (int r = 0; r < s.length(); r++) {
           arr[s.charAt(r)-'A']++; 
           maxF = Math.max(maxF,arr[s.charAt(r)-'A']);
           if ((r-l+1) - maxF > k) {
               arr[s.charAt(l)-'A']--;
               l++;
           } 
           res = Math.max(res, r-l+1);
       }
       return res;
    }
}
