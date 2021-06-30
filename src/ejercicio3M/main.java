package ejercicio3M;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        Precedable p1 = new Persona("Luis", 554321);
        Precedable p2 = new Persona("Brian", 154321);
        Precedable p3 = new Persona("Andres", 654321);
        Precedable p4 = new Persona("Brian", 354321);

        Precedable personas[] = {p1,p2,p3, p4 };

        SortUtil.ordenar(personas);
        //System.out.println(Arrays.toString(personas));
        Arrays.stream(personas).forEach(System.out::println);

        Precedable c1 = new Celular(3235467, "Pedro Pancracio");
        Precedable c2 = new Celular(3235466, "Juanito Perez");
        Precedable c3 = new Celular(3235463, "Ruth Reyes");
        Precedable c4 = new Celular(3235469, "Pedro Muriel");

        Precedable celulares[] = {c1,c2,c3, c4 };

        SortUtil.ordenar(celulares);
        Arrays.stream(celulares).forEach(System.out::println);
    }
}
