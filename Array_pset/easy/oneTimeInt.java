import java.util.Arrays;

public class oneTimeInt {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 1, 2 };
		int len = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int hashKey = (arr[i] * 20) % len;
			System.out.println(hashKey);
		}
	}

	static void oneInt(int[] arr) {
		int len = arr.length;
	}
}
