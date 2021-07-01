package saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    // variables
    private Map<Integer, List<Prenda>> armario;
    private Integer contador;

    public GuardaRopa() {
        this.armario = new HashMap<>();
        this.contador = 1;
    }

    public Integer guardarPrendas(List<Prenda> listaPrendas){
        this.armario.put(this.contador, listaPrendas);
        this.contador++;
        return this.contador -1;
    }

    public void mostrarPrendas(){
        this.armario.forEach((k,v) -> System.out.println("Llave: " + k + " Prendas: " + v.toString()));
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return this.armario.get(numero);
    }
}
