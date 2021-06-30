package radixSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RadixSort {

    public static void radixSort(int[] arr) { // arreglo de enteros
        // se convierte el arreglo original en un arreglo de strings
        String[] strArr = StringUtil.toStringArray(arr);
        // se rellena de 0 cada elemento del arreglo de strings dado el elemento de mayor longitud
        StringUtil.lNormalize(strArr, '0');

        // se crea un mapa con llaves de strings y valores de arraylist
        var sortingLists = new HashMap<String, ArrayList>();
        for(int i = 0; i < 10; i++){
            sortingLists.put("L" + i, new ArrayList<String>());
        }

        // se toma el elemento de mayor longitud del arreglo de Strings
        var maxLen = StringUtil.maxLength(strArr);
        // se itera desde la longitud -1 del mayor elemento
        for(int i = maxLen -1; i >= 0; i--){
            for(int j = 0; j < strArr.length; j++){
                String currStr = strArr[j];
                sortingLists.get("L" + currStr.charAt(i)).add(currStr);
            }

            var tempArr = new ArrayList<String>();
            for(ArrayList<String> list: sortingLists.values()){
                tempArr.addAll(list);
                list.clear();
            }

            strArr = tempArr.toArray(new String[0]);
        }

        int[] intArr = StringUtil.toIntArray(strArr);
        for(int i = 0; i < intArr.length; i++){
            arr[i] = intArr[i];
        }


    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
