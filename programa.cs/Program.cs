using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Forms;
using MessageBox = System.Windows.Forms.MessageBox;

namespace programa.cs
{
    class Program
    {
        [STAThread]   
        static void Main(string[] args)
        {
            
            Random random = new Random();
            HashSet<int> uniqueNumbers = new HashSet<int>();
            while (uniqueNumbers.Count < 10)
            {
                uniqueNumbers.Add(random.Next(1, 101));  
            }
            int[] numbers = uniqueNumbers.ToArray();

             
            Thread thread1 = new Thread(() => ShowMessage("Arreglo original :3", string.Join(", ", numbers)));
            thread1.SetApartmentState(ApartmentState.STA);
            thread1.Start();
            thread1.Join();  

             
            Array.Sort(numbers);
            Thread thread2 = new Thread(() => ShowMessage("Arreglo ordenado :O", string.Join(", ", numbers)));
            thread2.SetApartmentState(ApartmentState.STA);
            thread2.Start();
            thread2.Join();
        }

        static void ShowMessage(string title, string message)
        {
            MessageBox.Show(message, title, MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
    }
}
