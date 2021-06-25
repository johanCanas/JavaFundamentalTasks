import java.util.Scanner;

public class EjercicioCuatro {

    public static boolean esPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i ==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Ingresa un valor para mostrar los n numeros primos");
        Scanner sc = new Scanner(System.in);
        int np = sc.nextInt();
        int cantPrim = 0;
        for(int i=1; cantPrim < np ; i++){
            if(esPrime(i)){
                System.out.format("%d es primo \n", i);
                cantPrim++;
            }
        }
    }
}
