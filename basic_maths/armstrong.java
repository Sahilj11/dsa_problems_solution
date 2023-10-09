public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int len = Integer.toString(num).length();
        System.out.println(armFun(num, len));
    }

    static boolean armFun(int num, int len) {
        int temp = num;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int tempVar = temp % 10;
            sum = (int) Math.pow((double) tempVar, (double) len) + sum;
            temp = temp / 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

}
