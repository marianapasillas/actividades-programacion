using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgramInterface.cs
{
    
    public interface IOperaciones
    {
        int Sumar(int a, int b);
        int Restar(int a, int b);
        int Multiplicar(int a, int b);
        double Dividir(int a, int b);
    }

    
    public class Calculadora : IOperaciones
    {
        private double resultado;

        
        public int Sumar(int a, int b)
        {
            resultado = a + b;
            return (int)resultado;
        }

        public int Restar(int a, int b)
        {
            resultado = a - b;
            return (int)resultado;
        }

        public int Multiplicar(int a, int b)
        {
            resultado = a * b;
            return (int)resultado;
        }

        public double Dividir(int a, int b)
        {
            if (b == 0)
                throw new DivideByZeroException("No se puede dividir entre cero");
            resultado = (double)a / b;
            return resultado;
        }
    }

    
    class Program
    {
        static void Main(string[] args)
        {

            Calculadora calc = new Calculadora();


            Console.WriteLine("Ejemplo de operaciones:");
            Console.WriteLine($"Suma: {calc.Sumar(10, 5)}");
            Console.WriteLine($"Resta: {calc.Restar(10, 5)}");
            Console.WriteLine($"Multiplicación: {calc.Multiplicar(10, 5)}");
            Console.WriteLine($"División: {calc.Dividir(10, 5)}");

            Console.WriteLine("\nPulse cualquier tecla para salir...");
            Console.ReadKey();

        }
    }

}
    