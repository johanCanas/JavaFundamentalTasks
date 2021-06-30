package radixSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtil {

    // Retorna una cadena compuesta por n caracteres c
    // parametros (caracter a colocar, cantidad de veces)
    public static String replicate(char c, int n) {
        // se crea un string vacio
        String chain = "";
        // se itera para agregar los n caracteres al string
        for (int l = 0; l < n; l++) {
            // en cada iteracion se agrega el char c
            chain += c;
        }
        // retorna el string ya lleno con n caracteres c
        return chain;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    public static String lpad(String s,int n,char c) //(String que ingresa, cantidad de veces y el caracter)
    {
        // se crea un string donde se ejecuta la funcion replicate que llena con n cantidad de caracteres
        String added = replicate(c, n-s.length());

        // se regresa la cantidad de caracteres agregados concatenados al String original
        return added + s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) { // un arreglo de enteros
        // se crea un nuevo arreglo de String con la misma longitud del array de int ingresado por param
        String[] strArr = new String[arr.length];
        // itermos sobre el arreglo original
        for (int i = 0; i < arr.length; i++) {
            // convertimos la posicion i del arreglo de enteros y lo agregamos en la posicion i del arreglo de strings
            strArr[i] = String.valueOf(arr[i]);
        }
        // retorna el arreglo de string
        return strArr;
    }

    // Retorna un int[] conteniendo los elementos de arr
    // representados como enteros
    public static int[] toIntArray(String arr[])
    {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = Integer.parseInt(arr[i]);
        }
        return newArr;
    }


    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) { // ingresa un arreglo de strings
        // en esta variable colocamos la longitud del primer elemento del arreglo
        int maxLength = arr[0].length();
        // iteramos sobre el arreglo
        for (int i = 1; i < arr.length; i++) {
            // en esta variable almacenamos la longitud del elemento en la posicion i
            int elLength = arr[i].length();
            // si la longitud del elemento en la posicion i es mayor a la longitud del primer elemento
            if(elLength > maxLength){
                // hacer la variable maxLength la longitud del elemento actual
                maxLength = elLength;
            }
        }
        return maxLength;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) { // arreglo de strings, caracter
        // se obtiene el elemento con la mayor longitud
        int maxLong = maxLength(arr);
        // se itera sobre el arreglo
        for (int i = 0; i < arr.length; i++) {
            // se llena con el caracter c, la cantidad de veces necesarias dada la longitud del elemento mas grande
            // y se pone en la posicion i
            arr[i] = lpad(arr[i], maxLong, c);

        }
        //System.out.println(Arrays.toString(arr));
    }
}
