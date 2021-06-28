import java.util.Scanner;

public class EjercicioSiete {

    public static String sayHi(String name){
        return "Bienvenido " + name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre para saludarte: ");
        String name = sc.nextLine();

        System.out.println(sayHi(name));
    }
}
