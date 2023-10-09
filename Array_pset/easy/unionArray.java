import java.util.*;

public class unionArray {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;

		unionFun(arr1, arr2, arr1Length, arr2Length);
	}

	static void unionFun(int[] arr1, int[] arr2, int arr1Length, int arr2Length) {
		boolean sameNumber = false;
		ArrayList<Integer> unionArr = new ArrayList<>();

		// add any one array to ArrayList as it will be added otherwise
		for (int i = 0; i < arr1Length; i++) {
			unionArr.add(arr1[i]);
		}

		// comparing element of array which is not in ArrayList to ones which are in
		for (int i = 0; i < arr2Length; i++) {
			for (int j = 0; j < arr1Length; j++) {
				if (arr2[i] == arr1[j]) {
					sameNumber = true;
					break;
				}
			}

			// adding unique number to ArrayList
			if (sameNumber == false) {
				unionArr.add(arr2[i]);
			}
			sameNumber = false;
		}
		// sorting ArrayList
		Collections.sort(unionArr);
		unionArr.forEach((n) -> System.out.println(n));
	}
}
