using System;
using System.Collections;

class Program
{
    static void Main()
    {
        
        ArrayList miArrayList = new ArrayList();

        
        miArrayList.Add(10);
        miArrayList.Add(20);

        
        miArrayList.Add(3.14);
        miArrayList.Add(2.71);

        
        miArrayList.Add('A');
        miArrayList.Add('B');

        
        miArrayList.Add(true);
        miArrayList.Add(false);

        
        Console.WriteLine("=== Contenido de la ArrayList ===");
        Console.WriteLine("Índice\tValor\t\tTipo de dato");
        Console.WriteLine("--------------------------------");

        
        for (int i = 0; i < miArrayList.Count; i++)
        {
            if (miArrayList[i] != null)
            {
                Console.WriteLine($"{i}\t{miArrayList[i].ToString().PadRight(10)}\t{miArrayList[i].GetType().Name}");


            }
        }

        Console.WriteLine("--------------------------------");
        Console.WriteLine($"Total de elementos: {miArrayList.Count}");
        Console.ReadLine();
    }
}
