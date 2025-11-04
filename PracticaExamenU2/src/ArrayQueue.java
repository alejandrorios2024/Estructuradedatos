public class ArrayQueue<T> implements IQueue<T> {
    private Object[] data;
    private int front, rear, size;

    public ArrayQueue(int capacity) {
        data = new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        if (size == data.length) {
            return; 
        }
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) return null;
        T val = (T) data[front];
        front = (front + 1) % data.length;
        size--;
        return val;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s += data[(front + i) % data.length];
            if (i < size - 1) s += " -> ";
        }
        return s + "]";
    }
}
