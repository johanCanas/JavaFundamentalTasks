import java.util.Scanner;

public class EjercicioNueve {
    public static Boolean isDivisibleByTwo(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es divisible por 2: ");
        int num = sc.nextInt();

        if(isDivisibleByTwo(num))
            System.out.printf("El número %d es divisible por dos :)", num);
        else
            System.out.printf("El número %d no es divisible por dos :(", num);
    }
}
