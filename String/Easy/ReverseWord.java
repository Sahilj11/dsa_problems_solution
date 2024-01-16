/**
 * ReverseWord
 */
public class ReverseWord {

    public static void main(String[] args) {
        String s = "TUF is great for interview preparation";
        optimul(s);
    }

    private static void brute(String s) {
        String[] res = s.split(" ");
        for (int i = res.length - 1; i >= 0; i--) {
            System.out.print(res[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void optimul(String s) {
        String temp = "";
        String ans= "";
        int left = 0;
        int right = s.length()-1;
        while (left <= right) {
            if(s.charAt(left) == ' '){
                ans = temp + " " + ans;
                temp = "";
            }else{
                temp+= s.charAt(left);
            }
           left++; 
        }
        System.out.println(temp+" "+ans);
    }
}
