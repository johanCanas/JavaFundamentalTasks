package saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        GuardaRopa armario = new GuardaRopa();
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("Puma", "Newlife"));
        prendas.add(new Prenda("Under Armour", "Great"));
        prendas.add(new Prenda("Nike", "Working Out"));
        armario.guardarPrendas(prendas);

        prendas = new ArrayList<>();
        prendas.add(new Prenda("Adidas", "Adi"));
        prendas.add(new Prenda("UnderBlock", "Greatty"));
        prendas.add(new Prenda("Nike", "Fork"));
        armario.guardarPrendas(prendas);

        armario.mostrarPrendas();

        armario.devolverPrendas(1).forEach(prenda -> System.out.println(prenda));

    }
}
