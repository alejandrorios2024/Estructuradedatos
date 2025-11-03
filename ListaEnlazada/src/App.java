public class App {
    public static void main(String[] args) throws Exception {
        ListaEnlazada original = new ListaEnlazada();
        original.agregar(1);
        original.agregar(2);
        original.agregar(3);
        original.agregar(4);
        original.agregar(5);

        ListaEnlazada pares = new ListaEnlazada();
        ListaEnlazada impares = new ListaEnlazada();

        original.dividirEnParesEImpares(pares, impares);

        System.out.println("Lista original:");
        original.mostrar();

        System.out.println("la lista de pares: ");
        pares.mostrar();

        System.out.println("la lista de pares:");
        impares.mostrar();

        
    }
}

