
package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;


public class MiHoroscopo {
 
    

        public MiHoroscopo (){
         System.out.println("El constructor se está ejecutando...");
        String DiaStr = JOptionPane.showInputDialog("¿En qué día naciste?");
        String MesStr = JOptionPane.showInputDialog("Dime el mes en que naciste porfis:");

       
        int dia = Integer.parseInt(DiaStr);
        int mes = Integer.parseInt(MesStr);
        
        String signo = "";
           
    
        
        switch (mes) {
            case 1 -> signo = (dia <= 19) ? "Eres Capricornio" : "Eres Acuario";
            case 2 -> signo = (dia <= 18) ? "Eres Acuario" : "Eres Piscis";
            case 3 -> signo = (dia <= 20) ? "Eres Piscis" : "Eres Aries";
            case 4 -> signo = (dia <= 19) ? "Eres Aries" : "Eres Tauro";
            case 5 -> signo = (dia <= 20) ? "Eres Tauro" : "Eres Géminis";
            case 6 -> signo = (dia <= 20) ? "Eres Géminis" : "Eres Cáncer";
            case 7 -> signo = (dia <= 22) ? "Eres Cáncer" : "Eres Leo";
            case 8 -> signo = (dia <= 22) ? "Eres Leo" : "Eres Virgo";
            case 9 -> signo = (dia <= 22) ? "Eres Virgo" : "Eres Libra";
            case 10 -> signo = (dia <= 22) ? "Eres Libra" : "Eres Escorpio";
            case 11 -> signo = (dia <= 21) ? "Eres Escorpio" : "Eres Sagitario, el mejor signo, felicidades!";
            case 12 -> signo = (dia <= 21) ? "Eres Sagitario, el mejor signo, felicidades!" : "Eres Capricornio";
        }
        
        JOptionPane.showMessageDialog(null, signo);
    }

   
      public static void main(String[] args) {  
         System.out.println("Ejecutando el método main...");
         new MiHoroscopo();
          
    }


}

