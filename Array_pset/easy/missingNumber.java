import java.util.Arrays;

public class missingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 6, 7, 8, 9, 3 };
		int N = 9;
		missing(arr, N);
	}

	static void missing(int[] arr, int N) {
		int[] temp = new int[N + 1];
		Arrays.fill(temp, 0);
		for (int i = 0; i < N - 1; i++) {
			temp[arr[i]] = 1;
		}
		for (int i = 0; i < N + 1; i++) {
			if (temp[i] == 0 && i != 0) {
				System.out.println(i + " does not exists");
			}
		}
	}
}
