package ejercicio3T;

import java.util.Arrays;
import java.util.Comparator;

public class main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Carlos", 3536372);
        Persona p2 = new Persona("Alberto", 4536372);
        Persona p3 = new Persona("Pedro", 7836372);
        Persona p4 = new Persona("Esteban", 8836372);

        Persona personas [] = {p1, p2, p3, p4};

        QuickSorterImple q = new QuickSorterImple();

        q.sort(personas, Comparator.comparing(Persona::getNombre));

        Arrays.stream(personas).forEach(System.out::println);

    }
}
