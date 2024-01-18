import java.util.Arrays;

/**
 * Anagram
 */
public class Anagram {

    public static void main(String[] args) {
        String s = "CAT";
        String t = "TAC";
        System.out.println(optimul(s, t));
    }

    private static boolean optimul(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        for (int i = 0; i < tArr.length; i++) {
           if(tArr[i] != sArr[i]){
               return false;
           } 
        }
        return true;
    }
}
