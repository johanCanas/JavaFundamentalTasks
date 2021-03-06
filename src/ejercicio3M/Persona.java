package ejercicio3M;

public class Persona implements Precedable<Persona> {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }

    @Override
    public int precedeA(Persona t) {
        //Persona p = (Persona) o;
        if(this.nombre.compareToIgnoreCase(t.getNombre())==0){
            //return this.dni == t.dni? 1 : 0;
            return Integer.compare(this.dni, t.getDni());
        }
        else {
            return this.nombre.compareToIgnoreCase(t.getNombre());
        }
    }
}
