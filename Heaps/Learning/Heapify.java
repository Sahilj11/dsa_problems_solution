/**
 * Heapify
 */
public class Heapify {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 4, 9, 10, 32, 16, 14, 7 };
        int n = arr.length;
        boolean check = false;
        for (int i = n / 2 - 1; i >= 0; i--) {
            check = checkMin(arr, i, n);
        }
        System.out.println(check);
        System.out.println("MinHeap:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, i, n);
        }
        System.out.println("MaxHeap");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void maxHeapify(int[] arr, int i, int heapSize) {
        int left = 2 * i + 1;
        int largest = i;
        int right = 2 * i + 2;
        if (left <= heapSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= heapSize && arr[right] > arr[largest]) {
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

    private static boolean checkMin(int[] arr, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < heapSize && arr[left] < arr[smallest] || right < heapSize && arr[right] < arr[smallest]) {
            return false;
        }
        return true;
    }

}
