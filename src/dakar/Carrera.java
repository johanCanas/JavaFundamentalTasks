package dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carrera {
    private long distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadVehiculosPermitidos;
    private List<Vehiculo> listaVehiculos;
    private SocorristaAuto socorristasAuto;
    private SocorristaMoto socorristasMoto;

    public Carrera(long distancia, double premioEnDolares, String nombre, int cantidadVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        this.listaVehiculos = new ArrayList<>();
        this.socorristasAuto = new SocorristaAuto();
        this.socorristasMoto = new SocorristaMoto();
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente){
        Auto auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if(this.cantidadVehiculosPermitidos > listaVehiculos.size()) {
            this.listaVehiculos.add(auto);
        }
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente){
        Moto moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        if(this.cantidadVehiculosPermitidos > listaVehiculos.size()) {
            this.listaVehiculos.add(moto);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        List<Vehiculo> vehiculosFiltrados = this.listaVehiculos.stream()
                .filter(x -> x.equals(vehiculo)).collect(Collectors.toList());
        if(vehiculosFiltrados.size() > 0){
            this.listaVehiculos.remove(vehiculosFiltrados.get(0));
        }
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        List<Vehiculo> vehiculosFiltrados = this.listaVehiculos.stream()
                .filter(x -> x.getPatente().equals(unaPatente)).collect(Collectors.toList());
        if(vehiculosFiltrados.size() > 0){
            this.listaVehiculos.remove(vehiculosFiltrados.get(0));
        }
    }

    public void definirGanador(){
        this.listaVehiculos.sort((o1, o2) -> o1.calcularPuntaje() < o2.calcularPuntaje()? 1: -1);
        System.out.println("El ganador de la carrera " + this.nombre + " es el vehiculo de placa "
                + this.listaVehiculos.get(0).getPatente());
    }

    public void socorrerAuto(String patente){
        List<Vehiculo> autosSocorrer = this.listaVehiculos.stream()
                .filter(x -> x.getPatente().equals(patente)).collect(Collectors.toList());
                if(autosSocorrer.size() > 0){
                    this.socorristasAuto.socorrer((Auto) autosSocorrer.get(0));
                }
    }

    public void socorrerMoto(String patente){
        List<Vehiculo> motosSocorrer = this.listaVehiculos.stream()
                .filter(x -> x.getPatente().equals(patente)).collect(Collectors.toList());
        if(motosSocorrer.size() > 0){
            this.socorristasMoto.socorrer((Moto) motosSocorrer.get(0));
        }
    }
}
