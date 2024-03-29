/**
 * Isomorphic
 */
public class Isomorphic {

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(optimul(s, t));
    }

    private static boolean optimul(String s, String t) {
        int map1[] = new int[200];
        int map2[] = new int[200];
        for (int i = 0; i < s.length(); i++) {
           if(map1[s.charAt(i)] != map2[t.charAt(i)]){
               return false;
           } 
           map1[s.charAt(i)] = i+1;
           map2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
