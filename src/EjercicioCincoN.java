import java.util.Scanner;

public class EjercicioCincoN {
    public static boolean hasMTimesDigit(int n, int m, int d){
        char digitChar = (char)(d + '0');
        char [] chars = String.valueOf(n).toCharArray();

        int cantidad = 0;
        for(int x = 0; x < chars.length; x++){
            if(chars[x] == digitChar){
                cantidad++;
            }
        }
        return cantidad >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números a mostrar");
        int n = sc.nextInt();
        System.out.println("Ingresa el número de digitos a coincidir");
        int m = sc.nextInt();
        System.out.println("Ingresa el digito a buscar");
        int d = sc.nextInt();
        int count = 0;
        int i = 1;
        while(count < n){
            if(hasMTimesDigit(i,m,d)){
                System.out.println((count + 1) + "- " + i);
                count++;
            }
            i++;
        }
    }
}
