
package com.mycompany.proyectocalculadora;

public class Calculadora {
    
    private int Num1;
    private int Num2;
    
    
    public Calculadora (){
        
    }
    
    public Calculadora (int Num1, int Num2){
        this.Num1 = Num1;
        this.Num2 = Num2;
    }
    
    public int sumar (){
        int suma = this.Num1 + this.Num2;
        return suma;
    }
    
    public int restar (){
        int resta = this.Num1 - this.Num2;
        return resta;
    }
    
    public int multiplicar (){
        int multiplicacion = this.Num1 * this.Num2;
        return multiplicacion;
    }
    
    public double dividir (){
        double division = (double)this.Num1/(double)this.Num2;
        return division;
    }
    
    public int getNum1(){
        return Num1;
    }
    
    public void setnum1 (int Num1){
        this.Num1 = Num1;
    }
    
    public int getNum2 (){
        return Num2;
    }
    
    public void setNum2 (int Num2){
        this.Num2 = Num2;
    }
}


