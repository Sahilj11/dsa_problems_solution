/**
 * OddEven
 */
public class OddEven {

    public static void main(String[] args) {
        MyLinkedList<Integer> ls = new MyLinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        int a = 223;
    }
}

class MyLinkedList<Integer> {

    Node<Integer> head;

    public MyLinkedList() {
        this.head = null;
    }

    Node<Integer> get(int n) {
        Node<Integer> node = head;
        while (n != 0) {
            node = node.next;
            n--;
        }
        return node;
    }
   MyLinkedList<Integer> oddEven(MyLinkedList<Integer> ls){
       MyLinkedList<Integer> newLs = new MyLinkedList<>();
       Node<Integer> givePtr = ls.head;
       Node<Integer> evenEnd = null;
       Node<Integer> oddStart = null;
       Node<Integer> oddEnd = null;
       while (givePtr.next != null) {
           boolean odd = false;
           
           if (newLs.head == null) {
            
           }
       }
   } 

    boolean palindrome() {
        Node<Integer> last = this.tailNode();
        Node<Integer> start = head;
        int lengthStart = this.size();
        int lengthLast = lengthStart;
        while (lengthStart != 0 && lengthLast != 0) {
            if (start.data.equals(last.data)) {
                lengthStart--;
                lengthLast--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    void add(Integer data) {
        Node<Integer> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<Integer> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    Node<Integer> tailNode() {
        Node<Integer> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    void insertHead(Integer data) {
        Node<Integer> firstNode = new Node<>(data);
        if (head == null) {
            head = firstNode;
        } else {
            firstNode.next = head;
            head = firstNode;
        }
    }

    void display() {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    int size() {
        int size = 0;
        Node<Integer> current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }
}

class Node<Integer> {

    Integer data;
    Node<Integer> next;

    Node(Integer data, Node<Integer> next) {
        this.data = data;
        this.next = next;
    }

    Node(Integer data) {
        this.data = data;
        this.next = null;
    }
}
