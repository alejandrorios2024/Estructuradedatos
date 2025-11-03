public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Array<String> miArray = new Array<>();
        
        miArray.push("Anita lava la tina");
        miArray.Imprimir();
        System.out.println("¿Es palindroma? " + miArray.isPalindrome());

        miArray.push("Hola mundo");
        miArray.Imprimir();
        System.out.println("Es palindroma? " + miArray.isPalindrome());
    }
}
