/**
 * Heapify
 */
public class Heapify {

    public static void main(String[] args) {
        int[] arr = { 16, 14, 10, 8, 7, 9, 3, 32, 2, 4, 1 };
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            // maxHeapify(arr, i, arr.length);
            minHeapify(arr, i, n);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void maxHeapify(int[] arr, int i, int heapSize) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        } else if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }
    }

    private static void minHeapify(int[] arr, int i, int heapSize) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < heapSize && arr[left] < arr[smallest]) {
            smallest = left;
        } else if (right < heapSize && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
}
