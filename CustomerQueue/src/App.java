public class App {
   
    public static void main(String[] args) throws Exception {
        
        ArrayCustomer milista = new ArrayCustomer<>(5);

        milista.enqueue(new Customer(1, "Fatima"));
        milista.enqueue(new Customer(2, "Sandra"));
        milista.enqueue(new Customer(3, "Jesus"));
        milista.enqueue(new Customer(4, "Diego"));
        milista.enqueue(new Customer(5, "Geovanni"));

        System.out.println("Cola original:");
        milista.Imprimir();

        milista.reversa();

        System.out.println("\nCola invertida:");
        milista.Imprimir();

    }
}
