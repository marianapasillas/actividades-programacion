/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocalculadora;

/**
 *
 * @author USUARIO
 */
public class ProyectoCalculadora {

    public static void main(String[] args) {
        
        Calculadora MiCalculadora = new Calculadora (10, 2);
        
        int suma = MiCalculadora.sumar();
        System.out.println("la suma es igual a = " + suma);
               
        System.out.println("la resta es igual a = " + MiCalculadora.restar());
        
        System.out.println("la multiplicacion es igual a = "  + MiCalculadora.multiplicar()); 
        
        System.out.println("la division es igual a = "  + MiCalculadora.dividir()); 
    }
}
