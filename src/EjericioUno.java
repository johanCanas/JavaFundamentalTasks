import java.util.Scanner;

public class EjericioUno {
    public static boolean esEven(int n){
        return n%2==0;
    }

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es par: ");

        int num = sc.nextInt();
        if(esEven(num)){
            System.out.format("El número %d es par \n", num);
        }else {
            System.out.format("El número %d no es par \n", num);
        }

    }
}
