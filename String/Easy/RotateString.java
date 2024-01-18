/**
 * RotateString
 */
public class RotateString {

    public static void main(String[] args) {
        String s = "bbbacddceeb";
        String goal = "ceebbbbacdd";
        System.out.println(occurence(s, goal));
    }

    private static boolean brute(String s, String goal) {
        String temp = s;
        for (int i = 0; i < s.length(); i++) {
            temp = rotate(temp);
            if (temp.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    private static String rotate(String s) {
        String rotated = "";
        char a = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            rotated += s.charAt(i);
        }
        rotated += a;
        return rotated;
    }

    private static boolean occurence(String s,String goal) {
        char target = goal.charAt(0);
        int indexFirst = s.indexOf(target);
        boolean ans = false;
        if(indexFirst == -1){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                String lastHalf = s.substring(i, s.length());
                String firstHalf = s.substring(0, i);
                ans = goal.equals(lastHalf + firstHalf);
            }
            if(ans)
                return ans;
        }
        return false;
    }
}
