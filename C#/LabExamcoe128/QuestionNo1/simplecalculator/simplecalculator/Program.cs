using System;

namespace SimpleCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                ShowMenu();
                string userChoice = Console.ReadLine();

                if (userChoice.ToUpper() == "E")
                {
                    Console.WriteLine("Exiting the application...");
                    break;
                }

                try
                {
                    //Accept the user number:
                    double firstNumber = GetNumber("Enter the first number: ");
                    double secondNumber = GetNumber("Enter the second number: ");

                    //Switch case implementation
                    switch (userChoice)
                    {
                        case "1":
                            Console.WriteLine($"Result: {Addition(firstNumber, secondNumber)}");
                            break;
                        case "2":
                            Console.WriteLine($"Result: {Subtraction(firstNumber, secondNumber)}");
                            break;
                        case "3":
                            Console.WriteLine($"Result: {Multiplication(firstNumber, secondNumber)}");
                            break;
                        case "4":
                            Console.WriteLine($"Result: {Division(firstNumber, secondNumber)}");
                            break;
                        default:
                            Console.WriteLine("Invalid option. Please select a valid operation.");
                            break;
                    }
                }
                //Exception Handling
                catch (FormatException ex)
                {
                    Console.WriteLine($"Input Error: {ex.Message}");
                }
                catch (DivideByZeroException)
                {
                    Console.WriteLine("Error: Cannot divide by zero.");
                }
                catch (Exception ex)
                {
                    Console.WriteLine($"Unexpected Error: {ex.Message}");
                }

                Console.WriteLine(); // Add a line break for readability
            }
        }

        static void ShowMenu()
        {
            Console.WriteLine("Please select an operation:");
            Console.WriteLine("Press 1 for Addition");
            Console.WriteLine("Press 2 for Subtraction");
            Console.WriteLine("Press 3 for Multiplication");
            Console.WriteLine("Press 4 for Division");
            Console.WriteLine("Press E to Exit");
        }

        static double GetNumber(string prompt)
        {
            Console.Write(prompt);
            return Convert.ToDouble(Console.ReadLine());
        }

        static double Addition(double number1, double number2)
        {
            return number1 + number2;
        }

        static double Subtraction(double number1, double number2)
        {
            return number1 - number2;
        }

        static double Multiplication(double number1, double number2)
        {
            return number1 * number2;
        }

        static double Division(double number1, double number2)
        {
            if (number2 == 0)
                throw new DivideByZeroException();
            return number1 / number2;
        }
    }
}
