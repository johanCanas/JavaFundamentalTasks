package marteGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PackFuegos {

    private List<FuegoIndividual> listaFuegosIndividuales;
    private List<PackFuegos> listaPackFuegos;

    public PackFuegos(List<PackFuegos> packFuegos, List<FuegoIndividual> listaFuegosIndividuales) {
        this.listaFuegosIndividuales = listaFuegosIndividuales;
        this.listaPackFuegos = packFuegos;
    }

    public List<FuegoIndividual> getListaFuegosIndividuales() {
        return listaFuegosIndividuales;
    }

    public void setListaFuegosIndividuales(List<FuegoIndividual> listaFuegosIndividuales) {
        this.listaFuegosIndividuales = listaFuegosIndividuales;
    }

    public List<PackFuegos> getListaPackFuegos() {
        return listaPackFuegos;
    }

    public void setListaPackFuegos(List<PackFuegos> listaPackFuegos) {
        this.listaPackFuegos = listaPackFuegos;
    }

    public void explotarContenido(){
        if(Objects.nonNull(this.listaFuegosIndividuales))
            this.listaFuegosIndividuales.forEach(FuegoIndividual::explotar);
        if(Objects.nonNull(this.listaPackFuegos))
            this.listaPackFuegos.forEach(PackFuegos::explotarContenido);
    }
}
