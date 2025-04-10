public class Calculadora : IOperaciones
{
    private double resultado;

    // Implementación de los métodos de la interfaz
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
