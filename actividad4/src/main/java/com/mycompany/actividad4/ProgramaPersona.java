
package com.mycompany.actividad4;

import javax.swing.JOptionPane;


public class ProgramaPersona {

    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog(null, "Dame tu nombre porfis:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ahora, dame tu edad:"));
        String correoElectronico = JOptionPane.showInputDialog(null, "Cual es tu correo electrónico? ");

       
        Persona persona = new Persona(nombre, edad, correoElectronico);

        
        System.out.println("Tu Nombre es: " + persona.getNombre());
        System.out.println("Esta es tu Edad: " + persona.getEdad());
        System.out.println("Y este es tu Correo Electrónico: " + persona.getCorreoElectronico());
    }
}

class Persona {
    
    private String nombre;
    private int edad;
    private String correoElectronico;

 
    
    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
            this.edad = edad;
       
    }

    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    
    public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
       
    }
}
