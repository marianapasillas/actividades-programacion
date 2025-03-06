
package com.mycompany.interfaces;


public class pez implements Avion{
    
    private final String tipo;
    
    public pez(String tipo) {
        this.tipo = tipo;
        
    }
    
    @Override
    public void volar() {
        System.out.println("Lanzaron al pez " + tipo + " por los aires");
    }
    
    @Override
    public void planear() {
        System.out.println("El pez " + tipo + " está planeando (directo al piso)");
    }
    
    @Override
    public void aterrizar() {
        System.out.println("El pez " + tipo + " está aterrizando, ponganlo en arroz porque se nos muere");
    }

    
}

