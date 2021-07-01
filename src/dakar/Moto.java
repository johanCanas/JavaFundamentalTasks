package dakar;

public class Moto extends Vehiculo{

    public Moto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super.velocidad = velocidad;
        super.aceleracion = aceleracion;
        super.anguloDeGiro = anguloDeGiro;
        super.patente = patente;
        super.peso = 300;
        super.ruedas = 2;
    }

}
