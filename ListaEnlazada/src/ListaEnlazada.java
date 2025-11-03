public class ListaEnlazada {
    Node cabeza;
    //Agregar nodo
    public void agregar(int valor) {
        Node nuevo = new Node(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Node actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    // Dividir en pares e impares
    public void dividirEnParesEImpares(ListaEnlazada pares, ListaEnlazada impares) {
        Node actual = cabeza;
        while (actual != null) {
            if (actual.valor % 2 == 0) {
                pares.agregar(actual.valor);
            } else {
                impares.agregar(actual.valor);
            }
            actual = actual.siguiente;
        }
    }
    // Mostrar la lista
    public void mostrar() {
        Node actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + "-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
