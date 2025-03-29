using System;
using System.Collections;

internal class ProgramBase
{
    static void Main()
    {
        // Crear una nueva ArrayList
        ArrayList miArrayList = new ArrayList();

        // Agregar datos primitivos (mínimo 2 de cada tipo)
        // Números enteros
        miArrayList.Add(10);
        miArrayList.Add(20);

        // Números decimales
        miArrayList.Add(3.14);
        miArrayList.Add(2.71);

        // Caracteres
        miArrayList.Add('A');
        miArrayList.Add('B');

        // Booleanos
        miArrayList.Add(true);
        miArrayList.Add(false);

        // Mostrar los datos con leyenda
        Console.WriteLine("=== Contenido de la ArrayList ===");
        Console.WriteLine("Índice\tValor\t\tTipo de dato");
        Console.WriteLine("--------------------------------");

        // Recorrer y mostrar cada elemento
        for (int i = 0; i < miArrayList.Count; i++)
        {
            Console.WriteLine($"{i}\t{miArrayList[i]}\t{miArrayList[i].GetType().Name}");
        }

        Console.WriteLine("--------------------------------");
        Console.WriteLine($"Total de elementos: {miArrayList.Count}");
    }
}