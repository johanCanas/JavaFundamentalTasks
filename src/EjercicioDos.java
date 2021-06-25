import java.util.Scanner;

public class EjercicioDos {
    public static boolean esMultiple(int n, int m){
        return n%m==0;
    }

    public static void main(String[] args) {
        System.out.println("Ingresa un valor para mostrar los primeros n multiplos de m");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i <= n; i++ ){
            if(esMultiple(i, m)){
                System.out.format("El valor de %d es multiplo de %d \n", i, m);
            }
        }
    }
}
