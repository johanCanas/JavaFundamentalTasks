package ejercicio2M;

public class Contador {

    private int contador;

    public Contador(){

    }

    public Contador(int contador) {
        this.contador = contador;
    }

    public Contador(Contador c){
        this.contador = c.getContador();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incrementar(int valor){
        contador += valor;
    }

    public void decrementar(int valor){
        contador -= valor;
        if(contador <= 0)
            contador = 0;
    }

}
