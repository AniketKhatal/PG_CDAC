//Trying the C# loops

namespace Loops
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1.FOR LOOP" + '\n');
            Console.WriteLine("2.IF-ELSE LOOP"+'\n');
            Console.WriteLine("3.IF-ELSE-IF LOOP"+'\n');
            Console.WriteLine("4.DO-WHILE LOOP"+'\n');
            Console.WriteLine("Enter the choice:");
            int ch = Convert.ToInt32(Console.ReadLine());

            switch (ch)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    Console.WriteLine("Please!Enter the appropriate Choice");
            }
        }
    }
}
