/**
 * StackArray
 */
public class StackArray {

    public static void main(String[] args) {
        MyStack<Integer> arr = new MyStack<>();
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(5);
        arr.push(5);
        arr.push(5);
        arr.push(5);
        arr.push(5);
        arr.push(5);
        arr.push(5);
    }
}

class MyStack<T> {
    private T[] arr;
    private int topPointer;

    @SuppressWarnings("unchecked")
    MyStack() {
        this.arr = (T[]) new Object[10];
        this.topPointer = 0;
    }

    @SuppressWarnings("unchecked")
    MyStack(int arrLength, int topPointer) {
        this.arr = (T[]) new Object[arrLength];
        this.topPointer = topPointer;
    }

    void push(T data) {
        // TODO: How to create new object when StackArray is filled
        if (topPointer >= arr.length) {
            MyStack<T> newArr = new MyStack<>(arr.length + 10, arr.length);
           for (int i = 0; i < newArr.arr.length; i++) {
               newArr.arr[i] = arr[i];
           } 
           newArr.arr[topPointer] = data;
           System.out.println("Pointer after new arr " +topPointer);
           topPointer++;
        }
        if (topPointer < arr.length) {
            arr[topPointer] = data;
            System.out.println("Pointer when length sufficient " + topPointer);
            topPointer++;
        }
    }
}
