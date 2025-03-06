
package com.mycompany.main;

public interface Vehiculo {
    
    
    void arrancar();
    void detener();
    
    
    default void claxon() {
        System.out.println("PIIPIPIIIIIIIIIII (a los de hermosillo nos encanta sonaR el claxon) PIPIPIIIII");
    }
}
    
