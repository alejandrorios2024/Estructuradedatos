import java.util.Scanner;

public class Selectionsort {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantos numeros ingresara?");
        int cantidadnumeros = scanner.nextInt();

        int[] arreglooriginal = new int[cantidadnumeros];

        for (int i = 0; i < cantidadnumeros; i++) {
            System.out.println("ingrese el numero:");
            arreglooriginal[i] = scanner.nextInt();
        }

        int contarpares = 0;
        int contarimpares = 0;

        for (int i = 0; i < cantidadnumeros; i++) {
            if (arreglooriginal[i] % 2 == 0) {
                contarpares++;
            } else {
                contarimpares++;
            }
        }

        int[] arreglopares = new int[contarpares];
        int[] arregloimpares = new int[contarimpares];

        int indicepar = 0;
        int indiceimpar = 0;

        for (int i = 0; i < cantidadnumeros; i++) {
            int valoractual = arreglooriginal[i];

            if (valoractual % 2 == 0) {
                arreglopares[indicepar] = valoractual;
                indicepar++;
            } else {
                arregloimpares[indiceimpar] = valoractual;
                indiceimpar++;
            }
        }

        ordenar(arreglopares);
        ordenar(arregloimpares);

        System.out.println("\narreglo original:");
        imprimir(arreglooriginal);

        System.out.println("arreglo de pares ordenado:");
        imprimir(arreglopares);

        System.out.println("arreglo de impares ordenado:");
        imprimir(arregloimpares);
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void ordenar(int[] arreglo) {

        int longitud = arreglo.length;

        for (int posicionactual = 0; posicionactual < longitud - 1; posicionactual++) {

            int indicemenor = posicionactual;

            for (int siguienteindice = posicionactual + 1; siguienteindice < longitud; siguienteindice++) {
                if (arreglo[siguienteindice] < arreglo[indicemenor]) {
                    indicemenor = siguienteindice;
                }
            }

            int temporal = arreglo[posicionactual];
            arreglo[posicionactual] = arreglo[indicemenor];
            arreglo[indicemenor] = temporal;
        }
    }
}
