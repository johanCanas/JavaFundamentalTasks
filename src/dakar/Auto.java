package dakar;

public class Auto extends Vehiculo{
    public Auto(double velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super.velocidad = velocidad;
        super.aceleracion = aceleracion;
        super.anguloDeGiro = anguloDeGiro;
        super.patente = patente;
        super.peso = 1000;
        super.ruedas = 4;
    }
}
