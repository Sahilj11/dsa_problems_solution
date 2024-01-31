/**
 * Addhead
 */
public class Addhead {

    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(5);
        ls.add(8);
        ls.add(7);
        ls.add(10);
        System.out.println("After Adding element to top");
        ls.insertTop(22);
        ls.display();
        ls.deleteLast();
        System.out.println("After Deletion");
        ls.display();
        System.out.println("Size of Linked List");
        System.out.println(ls.size());
        System.out.println("Finding data " + ls.find(5));
    }
}

class MyLinkedList<T> {
    Node<T> head;

    MyLinkedList() {
        this.head = null;
    }

    void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    void display() {
        Node<T> iterator = head;
        while (iterator != null) {
            System.out.print(iterator.data+ " ");
            iterator = iterator.next;
        }
        System.out.println();
    }

    void insertTop(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void deleteLast() {
        Node<T> iterator = head;
        Node<T> lastSecond = head;
        while (iterator.next != null) {
            lastSecond = iterator;
            iterator = iterator.next;
        }
        lastSecond.next = null;
    }
    int size(){
        int size= 0;
        Node<T> iterator = head;
        while (iterator != null) {
           size++;
           iterator = iterator.next;
        }
        return size;
    }
    int find(T data){
        Node<T> iterator = head;
        while (iterator != null) {
            if (iterator.data.equals(data)) {
               return 1; 
            }
           iterator = iterator.next; 
        }
        return -1;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
