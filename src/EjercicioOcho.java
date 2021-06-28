import java.util.Scanner;

public class EjercicioOcho {
    public static Double circleArea(double radio){
        double pi = Math.PI;
        return pi * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo para hallar su area: ");
        Double radio = sc.nextDouble();

        System.out.println(circleArea(radio));
    }
}
