public class SinglyLinkedList<T> {

    private class Node {
        T value;    
        Node next;     

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;  
    private int size;   

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T removeLast() {
        if (head == null) {
            return null; 
        }

        if (head == tail) {
            T value = head.value;
            head = null;
            tail = null;
            size = 0;
            return value;
        }

        Node currentNode = head;
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }

        T value = tail.value;
        tail = currentNode;
        tail.next = null;
        size--;

        return value;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "[";
        Node currentNode = head;

        while (currentNode != null) {
            result += currentNode.value;
            if (currentNode.next != null) {
                result += " -> ";
            }
            currentNode = currentNode.next;
        }

        result += "]";
        return result;
    }
}
