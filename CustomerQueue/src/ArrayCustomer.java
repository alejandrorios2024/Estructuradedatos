import java.util.Stack;

public class ArrayCustomer<T> implements ArrayQueue<T> {
    private final Object[] elementos;
    private int tamaño;

    public ArrayCustomer(int capacidad){
        elementos = new Object[capacidad];
        tamaño = 0;
    }

    @Override
    public void enqueue(T c) {
        if (tamaño == elementos.length) {
            System.out.println("la cola esta llena");
            return;
        }
        elementos[tamaño] = c;
        tamaño++;
    }

    @Override
    public void Imprimir() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println(elementos[i]);
        }
    }
    
    @Override
    public void reversa() {
       Stack<Customer> pila = new Stack<>();

        for (int i = 0; i < tamaño; i++) {
            pila.push((Customer) elementos[i]);
        }

        for (int i = 0; i < tamaño; i++) {
            elementos[i] = pila.pop();
        }
    }
}   
