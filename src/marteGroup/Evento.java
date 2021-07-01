package marteGroup;

import java.util.List;

public class Evento {

    List<PackFuegos> listaPackFuegos;
    List<Invitado> listaInvitados;

    public Evento(List<PackFuegos> listaPackFuegos, List<Invitado> listaInvitados) {
        this.listaPackFuegos = listaPackFuegos;
        this.listaInvitados = listaInvitados;
    }

    public void apagarVelas(){
        System.out.println("\"La chiqui\" apagará las velas!");
        this.reventarFuegos();
        this.repartirTorta();

    }

    private void reventarFuegos(){
        System.out.println("=======================================");
        this.listaPackFuegos.stream().forEach(PackFuegos::explotarContenido);
        System.out.println("=======================================");
    }

    private void repartirTorta(){
        this.listaInvitados.forEach(x -> {
            System.out.println("El invitado " + x.getNombre() + " está comiendo torta");
            if(x.isMeli())
                System.out.println("Viva la chiqui!");
        });
    }

}
