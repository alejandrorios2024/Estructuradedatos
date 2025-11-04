public interface  IQueue<T>{
    void enqueue(T value);
    T dequeue();
    boolean isEmpty();
}
