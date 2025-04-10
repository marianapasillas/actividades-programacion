using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prgram.cs
{
    class Program
    {
        static void Main(string[] args)
        {
            //  linkedLis
            LinkedList<string> linkedList = new LinkedList<string>();
            linkedList.AddLast("Manzana");
            linkedList.AddLast("Banana");
            linkedList.AddLast("Cereza");
            linkedList.AddLast("Durazno");
            linkedList.AddLast("Fresa");

            Console.WriteLine("Elementos en la LinkedList:");
            foreach (var item in linkedList)
            {
                Console.WriteLine(item);
            }

            
            linkedList.AddFirst("Uva");
            linkedList.AddLast("Mango");
            
            foreach (var item in linkedList)
            {
                Console.WriteLine(item);
            }

            linkedList.RemoveFirst();
            linkedList.RemoveLast();
            
            foreach (var item in linkedList)
            {
                Console.WriteLine(item);
            }

            // hashSet
            HashSet<int> hashSet = new HashSet<int>();
            hashSet.Add(10);
            hashSet.Add(20);
            hashSet.Add(30);
            hashSet.Add(40);
            hashSet.Add(50);

            Console.WriteLine("\nElementos en el HashSet:");
            foreach (var number in hashSet)
            {
                Console.WriteLine(number);
            }

            
            hashSet.Add(60); 
            hashSet.Remove(30); 
            
            foreach (var number in hashSet)
            {
                Console.WriteLine(number);
            }

            // verifico si un elemento esta ahi
            Console.WriteLine("\n¿El HashSet contiene 20? " + hashSet.Contains(20));
            Console.WriteLine("¿El HashSet contiene 70? " + hashSet.Contains(70));
        
    }
    }
}
