
package com.mycompany.bidimensional;


public class Bidimensional {

    public static void main(String[] args) {
        
         int[][] arreglo = {
            {2, 4},
            {6, 8},
            {10, 12}
        };
         
         
         
         int n = arreglo.length;
         
        
          System.out.println("Resultados: ");
        for (int i = 0; i < n; i++) {
            int dato1 = arreglo[i][0]; 
            System.out.println("Fila " + (i + 1) + ":");

            for (int j = 0; j < n; j++) {
                int dato2 = arreglo[j][1]; 

                System.out.println("  " + dato1 + " + " + dato2 + " = " + (dato1 + dato2));
                System.out.println("  " + dato1 + " - " + dato2 + " = " + (dato1 - dato2));
    
            }
               System.out.println();
            }
            }
    }
