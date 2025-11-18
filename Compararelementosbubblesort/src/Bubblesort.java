import java.util.Scanner;

public class Bubblesort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros enteros");

        int numeros = scanner.nextInt();

        int[] arreglooriginal = new int[numeros];

        for (int i = 0; i < numeros; i++) {
            System.out.println("ingrese el numero");
            arreglooriginal[i] = scanner.nextInt();
        }

        System.out.println("el arreglo original es:");
        for (int i = 0; i < arreglooriginal.length; i++) {
            System.out.print(arreglooriginal[i] + ",");
        }
        System.out.println();

        // bubble sort
        for (int i = 0; i < numeros - 1; i++) {
            for (int j = 0; j < numeros - i - 1; j++) {
                if (arreglooriginal[j] > arreglooriginal[j + 1]) {
                    int temporal = arreglooriginal[j];
                    arreglooriginal[j] = arreglooriginal[j + 1];
                    arreglooriginal[j + 1] = temporal;
                }
            }
        }

        System.out.println("arreglo ordenado:");
        for (int i = 0; i < arreglooriginal.length; i++) {
            System.out.print(arreglooriginal[i] + ",");
        }
        System.out.println();

        int minimo = arreglooriginal[0];
        int maximo = arreglooriginal[numeros - 1];
        int diferencia = maximo - minimo;

        System.out.println("valor minimo: " + minimo);
        System.out.println("valor maximo: " + maximo);
        System.out.println("diferencia (maximo - minimo): " + diferencia);
    }
}
