using System;
using System;

namespace RepasoEnCSharp
{
    
    public class EstructuraControl
    {
        public EstructuraControl()
        {
            Console.WriteLine("Clase EstructuraControl inicializada.");
        }

        public void CicloFor()
        {
            Console.WriteLine("Números pares del 1 al 20:");
            for (int i = 1; i <= 20; i++)
            {
                if (i % 2 == 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }

    
    public class OperacionesMatematicas
    {
        public OperacionesMatematicas()
        {
            Console.WriteLine("Clase OperacionesMatematicas inicializada.");
        }

        public int Suma(int a, int b) => a + b;

        public int Resta(int a, int b) => a - b;

        public int Multiplicacion(int a, int b) => a * b;

        public double Division(int a, int b)
        {
            if (b == 0)
            {
                throw new DivideByZeroException("El divisor no puede ser 0.");
            }
            return (double)a / b;
        }
    }

    
    public class Zodiaco
    {
        public Zodiaco()
        {
            Console.WriteLine("Clase Zodiaco inicializada.");
        }

        public string ObtenerSignoZodiaco(int dia, int mes)
        {
            
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) return "Acuario";
            if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) return "Piscis";
            if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) return "Aries";
            if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) return "Tauro";
            if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) return "Géminis";
            if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) return "Cáncer";
            if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) return "Leo";
            if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) return "Virgo";
            if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) return "Libra";
            if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) return "Escorpio";
            if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) return "Sagitario, YEI el mejor signo!";
            if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) return "Capricornio";
            return "Fecha no válida.";
        }
    }

    
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine("=== Estructura de Control ===");
            EstructuraControl estructura = new EstructuraControl();
            estructura.CicloFor();

            
            Console.WriteLine("\n=== Operaciones Matemáticas ===");
            OperacionesMatematicas operaciones = new OperacionesMatematicas();
            Console.WriteLine($"Suma: {operaciones.Suma(5, 3)}");
            Console.WriteLine($"Resta: {operaciones.Resta(5, 3)}");
            Console.WriteLine($"Multiplicación: {operaciones.Multiplicacion(5, 3)}");
            try
            {
                Console.WriteLine($"División: {operaciones.Division(10, 2)}");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            
            Console.WriteLine("\n=== Zodiaco ===");
            Zodiaco zodiaco = new Zodiaco();

            Console.WriteLine("¡Ahora, vemamos cual es tu signo UwU!");
            Console.WriteLine("Ingresa tu día de nacimiento porfis:");
            int dia = int.Parse(Console.ReadLine());

            Console.WriteLine("Ahora, ingresa tu mes de nacimiento (en número) porfi:");
            int mes = int.Parse(Console.ReadLine());

            string signo = zodiaco.ObtenerSignoZodiaco(dia, mes);

            Console.WriteLine($"Tu signo zodiacal es (redoble de tambores!!): {signo}");
        }
    }
}