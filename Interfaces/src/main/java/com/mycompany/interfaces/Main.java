
package com.mycompany.interfaces;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada clase
        Perro perro = new Perro("Pulgoso");
        pez Pez = new pez("doradito");
        Comida comida = new Comida("Pizza");
        
        // Probar los métodos
        System.out.println("=== Perro ===");
        perro.volar();
        perro.planear();
        perro.aterrizar();
        
        System.out.println("\n=== Pez ===");
        Pez.volar();
        Pez.planear();
        Pez.aterrizar();
        
        System.out.println("\n=== Comida ===");
        comida.volar();
        comida.planear();
        comida.aterrizar();
    }
}