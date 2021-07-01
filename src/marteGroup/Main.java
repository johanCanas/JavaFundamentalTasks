package marteGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Invitado> invitados = new ArrayList<>();
        invitados.add(new Invitado("Luis Andres", false));
        invitados.add(new Invitado("Liliana Madrid", true));
        invitados.add(new Invitado("Luis Andres", false));
        invitados.add(new Invitado("Luis Andres", false));
        invitados.add(new Invitado("Luis Andres", false));

        List<PackFuegos> pack1 = new ArrayList<>();
        List<PackFuegos> pack2 = new ArrayList<>();
        List<FuegoIndividual> fuegosIndividuales = new ArrayList<>();

        for(int i = 0; i < 5; i++)
            fuegosIndividuales.add(new FuegoIndividual());
        pack1.add(new PackFuegos(null, fuegosIndividuales));

        fuegosIndividuales = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            fuegosIndividuales.add(new FuegoIndividual());
        pack2.add(new PackFuegos(pack1, fuegosIndividuales));

        fuegosIndividuales = new ArrayList<>();
        for(int i = 0; i < 4; i++)
            fuegosIndividuales.add(new FuegoIndividual());
        pack2.add(new PackFuegos(null, fuegosIndividuales));

        Evento envento = new Evento(pack2, invitados);
        envento.apagarVelas();

    }
}
