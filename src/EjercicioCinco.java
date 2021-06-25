import java.util.Scanner;

public class EjercicioCinco {
    public static int hasMTimesDigit(int n, int m, int d){
        int count = 0;
        while(n > 0){
            String num = Integer.toString(count);
            int coincidence = m;
            for(int i = 0; i < num.length(); i++){
                if(Character.getNumericValue(num.charAt(i))==d){
                    coincidence --;
                }
            }
            if(coincidence <=0){
                System.out.println(num);
                n--;
            }
            count++;
            //return  count;
        }
        return count-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números a mostrar");
        int n = sc.nextInt();
        System.out.println("Ingresa el número de digitos a coincidir");
        int m = sc.nextInt();
        System.out.println("Ingresa el digito a buscar");
        int d = sc.nextInt();

        System.out.println(hasMTimesDigit(n,m,d));

    }
}
