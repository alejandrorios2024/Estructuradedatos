import java.util.ArrayList;

class Alumno {
    String nombre;
    int calificacion;

    Alumno(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
}

public class Alumno1 {
    public static void main(String[] args) {
        // Lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Ana", 95));
        alumnos.add(new Alumno("Luis", 80));
        alumnos.add(new Alumno("María", 58)); // reprobatoria
        alumnos.add(new Alumno("Carlos", 70));
        alumnos.add(new Alumno("Elena", 100));
        alumnos.add(new Alumno("Pedro", 55)); // reprobatoria

        // Calcular promedio
        int suma = 0;
        for (Alumno a : alumnos) {
            suma += a.calificacion;
        }
        System.out.println("Promedio: " + (suma * 1.0 / 6));

        // Eliminar reprobatorias
        int i = 0;
        while (i < alumnos.size()) {
            if (alumnos.get(i).calificacion < 60) {
                alumnos.remove(i);
            } else {
                i++;
            }
        }

        // Mostrar lista actualizada
        System.out.println("Lista sin reprobados:");
        for (Alumno a : alumnos) {
            System.out.println("Nombre: " + a.nombre + ", Calificación: " + a.calificacion);
        }
    }
}
