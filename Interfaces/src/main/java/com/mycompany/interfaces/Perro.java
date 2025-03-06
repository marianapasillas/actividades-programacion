
package com.mycompany.interfaces;


public class Perro implements Avion {
    
    private final String nombre;
    
    /**
     *
     * @param nombre
     */
    public Perro(String nombre) {
        this.nombre = nombre;
        
    }

    @Override
    public void volar() {
        System.out.println("El perro " + nombre + " está intentando volar, pero no es un avion");
    }

    @Override
    public void aterrizar() {
        System.out.println("El perro " + nombre + " está intentando aterrizar pero ni si quiera puede volar lol");
    }

    @Override
    public void planear() {
        System.out.println("El perro " + nombre + " se cree un avion, deberias llevarlo al veterinario");
    }
    
}