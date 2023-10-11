public class printNtimeName {

    public static void main(String[] args) {
        String name = "sahil";
        int iterate = 4;
        recurName(name, iterate);
    }

    static String recurName(String name, int iterate) {
        if (iterate < 1) {
            return name;
        }
        System.out.println(name);
        return recurName(name, iterate - 1);
    }
}
