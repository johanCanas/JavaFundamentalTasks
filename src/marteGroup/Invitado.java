package marteGroup;

public class Invitado {

    private String nombre;
    private boolean meli;

    public Invitado(String nombre, boolean meli) {
        this.nombre = nombre;
        this.meli = meli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMeli() {
        return meli;
    }

    public void setMeli(boolean meli) {
        this.meli = meli;
    }
}
