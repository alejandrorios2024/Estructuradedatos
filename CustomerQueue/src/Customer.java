public class Customer {
    @SuppressWarnings("FieldMayBeFinal")
    private int id;
    @SuppressWarnings("FieldMayBeFinal")
    private String nombre;

    public Customer(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Customer{ id = " + id + " nombre = " + nombre + " }";
    }  

}
