import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialNavegacion {
    public static void main(String[] args)throws Exception{
       //inicializamos
        Deque<String> historial = new ArrayDeque<>();

        // agregamos elementos
        historial.push("https://google.com");
        historial.push("https://youtube.com");
        historial.push("https://es.wikipedia.org");
        System.out.println("Historial después de agregar 3 paginas: " + historial);

        //Retroceder pagina con pop
        String paginaCerrada = historial.pop();
        System.out.println("Retrocediendo, cerramos: " + paginaCerrada);

        //Consultar en que pagina estamos peek
        String paginaActual = historial.peek();
        System.out.println("Pagina actual: " + paginaActual);

        //Agregar una nueva pagina
        historial.push("https://github.com");
        System.out.println("Historial después de agregar nueva pagina: " + historial);

        // 5. Mostrar todo el contenido de la pila
        System.out.println("Contenido completo del historial:");
        for (String pagina : historial) {
            System.out.println(pagina);
        }
    }
}
