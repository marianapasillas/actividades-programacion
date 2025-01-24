
package com.mycompany.proyectocalculadora;

public class Calculadora {
    
    private double Num1;
    private double Num2;
    
    
    
    public Calculadora (String num1, String num2){
        
    }
    
    public Calculadora (double Num1, double Num2){
        this.Num1 = Double.parseDouble ("dame el primer numero: ");
        this.Num2 = Double.parseDouble ("dame el segundo numero: ");
    }
    
    public double sumar (){
        double suma = this.Num1 + this.Num2;
        return suma;
    }
    
    public double restar (){
        double resta = this.Num1 - this.Num2;
        return resta;
    }
    
    public double multiplicar (){
        double multiplicacion = this.Num1 * this.Num2;
        return multiplicacion;
    }
    
     public double dividir() {
        if (this.Num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return this.Num1 / this.Num2;
    }
    
    public double getNum1(){
        return Num1;
    }
    
    public void setnum1 (int Num1){
        this.Num1 = Num1;
    }
    
    public double getNum2 (){
        return Num2;
    }
    
    public void setNum2 (int Num2){
        this.Num2 = Num2;
    }
   
}


