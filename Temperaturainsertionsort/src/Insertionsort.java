import java.util.Scanner;

public class Insertionsort {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de temperaturas");

        int cantidad = scanner.nextInt();
        
        double[] temperaturas = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese el numero");
            temperaturas[i] = scanner.nextDouble();
            
        }
        
        //imprimir el arreglo original
        System.out.println("arreglo original");
        for (double d : temperaturas) {
            System.out.println(d);
        }


        //insertionsort
        for (int i = 1; i < cantidad; i++) {
            double actual = temperaturas[i];
            int j = i - 1;

            while (j >= 0 && temperaturas[j] > actual) {
                temperaturas[j + 1] = temperaturas[j];
                j--;
            }
            temperaturas[j + 1] = actual;
        }

        System.out.println("arreglo ordenado");
        for (double d : temperaturas) {
            System.out.println(d);
        }

        double minima = temperaturas[0];
        double maxima = temperaturas[cantidad - 1];
        double rango = maxima - minima;
        
        System.out.println("temperatura maxima: " + maxima);
        System.out.println("temperatura minima: " + minima);
        System.out.println("rango (maxima - minima)" + rango);

        //las 3 mas bajas
        System.out.println("\nlas 3 temperaturas mas bajas:");
        for (int i = 0; i < cantidad && i < 3; i++) {
            System.out.println(temperaturas[i]);
        }

        //las 3 mas altas
        System.out.println("\nlas 3 temperaturas mas altas:");
        for (int i = cantidad - 1; i >= 0 && i >= cantidad - 3; i--) {
            System.out.println(temperaturas[i]);
        }


    }
}
