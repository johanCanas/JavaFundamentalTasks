package ejercicio3T;

import java.lang.reflect.GenericArrayType;
import java.util.Comparator;

public class QuickSorterImple <T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr, 0, arr.length-1, c);
    }

    public static <T> void quickSort(T[] arr, int begin, int end, Comparator<T> c){
        if(begin < end){
            int partitionIndex  = partition(arr, begin, end, c);

            quickSort(arr, begin, partitionIndex-1, c);
            quickSort(arr, partitionIndex+1, end, c);
        }
    }

    public static <T> int partition(T arr[], int begin, int end, Comparator<T> c) {
        T pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (c.compare(arr[j],  pivot) <= 0) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
