
package com.mycompany.ordenararreglo;

import java.util.Arrays;

public class OrdenarArreglo {

    public static void main(String[] args) {
        int[] arreglo = {1, 15, 1, 10, 30, 8, 2};
        
        ordenarArreglo(arreglo);
        
        System.out.println(Arrays.toString(arreglo));
    }
    public static void ordenarArreglo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
