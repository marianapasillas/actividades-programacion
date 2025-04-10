
public interface IOperaciones
{
    int Sumar(int a, int b);
    int Restar(int a, int b);
    int Multiplicar(int a, int b);
    double Dividir(int a, int b);
}

class ProgramInterArr
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