package ejercicio3M;

public class SortUtil {
    public static <T> void ordenar(Precedable <T> arr[]){
        int n = arr.length-1;
        Precedable t;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(arr[j].precedeA((T) arr[j+1]) > 0){
                    t = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = t;
                }
            }
        }

    }
}
