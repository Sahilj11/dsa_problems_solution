public class consecutiveOne {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1, 1 };
		ones(arr);
	}

	static void ones(int[] arr) {
		int counter = 0;
		int max = 0;
		for (int var : arr) {
			if (var == 1) {
				counter++;
			} else {
				max = counter;
				counter = 0;
			}
		}
		if (max > counter) {
			System.out.println(max);
		} else {
			System.out.println(counter);
		}
	}
}
