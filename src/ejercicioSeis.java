import java.util.Scanner;

public class ejercicioSeis {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int substract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static float divide(int a, int b){
        return (float) a / b;
    }

    public static int mod(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa dos valores para saber su suma, resta, multiplicación, división y modulo");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("La suma de %d + %d es igual a : %d \n", a, b, sum(a,b));
        System.out.printf("La resta de %d - %d es igual a : %d \n", a, b, substract(a,b));
        System.out.printf("La multiplicacion de %d x %d es igual a : %d \n", a, b, multiply(a,b));
        System.out.printf("La division de %d  %d es igual a : %.2f \n", a, b, divide(a,b));
        System.out.printf("El resto de %d mod %d es igual a : %d \n", a, b, mod(a,b));
    }
}
