package dakar;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Carrera dackar1 = new Carrera(500, 10000, "Dackar 1", 15);
        System.out.println(dackar1);
        dackar1.darDeAltaAuto(233, 56, 45, "REM555");
        dackar1.darDeAltaAuto(256, 67, 56, "ALL567");
        dackar1.darDeAltaAuto(200, 89, 89, "ALL111");
        dackar1.darDeAltaMoto(202, 98, 78, "AKP06E");

        dackar1.getListaVehiculos().forEach(System.out::println);

        System.out.println();
        System.out.println("------------------------------------------");
        dackar1.eliminarVehiculo(new Auto(256, 67, 56, "ALL567"));
        dackar1.getListaVehiculos().forEach(System.out::println);

        System.out.println();
        System.out.println("------------------------------------------");
        dackar1.eliminarVehiculoConPatente("ALL111");
        dackar1.getListaVehiculos().forEach(System.out::println);

        System.out.println();
        System.out.println("------------------------------------------");
        dackar1.getListaVehiculos().forEach(x -> System.out.println("El vehiculo con placa " + x.getPatente()
                + " es : " + x.calcularPuntaje()));
        dackar1.definirGanador();

        dackar1.socorrerMoto("AKP06E");


    }
}
