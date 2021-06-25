import java.util.Scanner;

public class EjercicioTres {
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
        System.out.println("Ingresa un número para saber si es primo: ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if(esPrime(p)){
            System.out.format("El número %d es primo \n", p);
        }else{
            System.out.format("El número %d no es primo \n", p);
        }
    }
}
