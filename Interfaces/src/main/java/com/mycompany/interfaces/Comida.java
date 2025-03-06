
package com.mycompany.interfaces;


public class Comida implements Avion {
    private final String nombre;
    
    public Comida(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void volar() {
        System.out.println("La " + nombre + " se está sirviendo en el avion :D");
    }
    
    @Override
    public void planear() {
        System.out.println("La " + nombre + " está planeando (ya no se me ocurren mas chistes tengo sueño jsjsjs)");
    }
    
    @Override
    public void aterrizar() {
        System.out.println("La " + nombre + " está aterrizando en mi estomago (mal chiste :D )");
    }
}