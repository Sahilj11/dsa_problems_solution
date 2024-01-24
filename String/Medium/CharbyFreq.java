import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * CharbyFreq
 */
public class CharbyFreq {

    public static void main(String[] args) {
        String s = "cccAaa";
        brute1(s);
    }

    private static String brute1(String s) {
        int[] ascii = new int[200];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (ascii[s.charAt(i)] == 0) {
                ascii[s.charAt(i)] = 1;
            } else {
                ascii[s.charAt(i)] += 1;
            }
        }
        LinkedList<Pair> ls = new LinkedList<>();
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > 0) {
                ls.add(new Pair(i, ascii[i]));
            }
        }
        Collections.sort(ls, new CompareImpl());
        for (Pair pair : ls) {
            for (int i = 0; i < pair.getValue(); i++) {
                ans = (char) pair.getKey() + ans;
            }
        }
        return ans;
    }
}

class CompareImpl implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}

class Pair {
    private int key;
    private int value;

    @Override
    public String toString() {
        return "Pair [key=" + key + ", value=" + value + "]";
    }

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
