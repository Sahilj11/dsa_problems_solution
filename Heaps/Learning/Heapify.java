/**
 * Heapify
 */
public class Heapify {

    public static void main(String[] args) {
        int[] arr = { 16, 14, 10, 8, 7, 9, 3, 32, 2, 4, 1 };
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, n);
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void maxHeapify(int[] arr, int i, int heapSize) {
        int left = 2 * i + 1;
        int largest = i;
        int right = 2 * i + 2;
        if (left <= heapSize && arr[left] > arr[i]) {
            largest = left;
        }
        if (right <= heapSize && arr[right] > arr[i]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, heapSize);
        }
    }

    private static void minHeapify(int[] arr, int i, int heapSize) {
        int left = 2 * i + 1;
        int smallest = i;
        int right = 2 * i + 2;
        if (left < heapSize && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < heapSize && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(arr, smallest, heapSize);
        }
    }
}
