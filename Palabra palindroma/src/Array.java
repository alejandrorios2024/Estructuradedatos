import java.util.ArrayList;

public class Array<T> implements Mystack<T> {

    private ArrayList<T> elementos;

    public Array() {
        elementos = new ArrayList<>();
    }

    @Override
    public void push(T valor) {
        elementos.add(valor); 
    }

    @Override
    public T pop() {
        if (elementos.isEmpty()) {
            return null; 
        }
        return elementos.remove(elementos.size() - 1); 
    }

    @Override
    public T peek() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.get(elementos.size() - 1); 
    }

    @Override
    public int tamaño() {
        return elementos.size();
    }

    @Override
    public void Imprimir() {
        System.out.println(elementos);
    }

    @Override
    public boolean isPalindrome() {
        String texto = (String) peek(); //cast
        if (texto == null) {
            return false; 
        }

        int inicio = 0;
        int fin = texto.length() - 1;

        while (inicio < fin) {
            if (texto.charAt(inicio) != texto.charAt(fin)) {
                return false; 
            }
            inicio++;
            fin--;
        }

        return true;
    }

   
}
