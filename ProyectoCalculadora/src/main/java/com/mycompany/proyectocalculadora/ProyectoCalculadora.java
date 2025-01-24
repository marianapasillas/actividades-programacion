
package com.mycompany.proyectocalculadora;

import javax.swing.JOptionPane;


public class ProyectoCalculadora {

    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog(null, "Dame el primer número: ");
        String num2 = JOptionPane.showInputDialog(null, "Dame el segundo número: ");  
       
        Calculadora MiCalculadora = new Calculadora(num1,  num2);
        
        System.out.println("la suma es igual a = " + MiCalculadora.sumar());
               
        System.out.println("la resta es igual a = " + MiCalculadora.restar());
        
        System.out.println("la multiplicacion es igual a = "  + MiCalculadora.multiplicar()); 
        
        System.out.println("la division es igual a = "  + MiCalculadora.dividir());  
        
        
    }
}
