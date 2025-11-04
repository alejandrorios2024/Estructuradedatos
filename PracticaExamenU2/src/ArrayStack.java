public class ArrayStack<T> implements IStack<T> {
    private Object[] data;
    private int top;

    public ArrayStack(int capacity) {
        data = new Object[capacity];
        top = 0;
    }

    @Override
    public void push(T value) {
        if (top == data.length) return;
        data[top++] = value;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()){
           return null; 
        } 
        top--;
        return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < top; i++) {
            s += data[i];
            if (i < top - 1) s += " -> ";
        }
        return s + "]";
    }
}
