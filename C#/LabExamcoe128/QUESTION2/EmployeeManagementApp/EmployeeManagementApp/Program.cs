using EmployeeManagementApp;
using System;
using System.Data.SqlClient;
using static System.Net.Mime.MediaTypeNames;
using System.Runtime.Remoting.Contexts;

class Program
{
    static string connectionString = "Data Source=(localdb);MSSQLLocalDB;Initial Catalog = EmployeeDB; Integrated Security = True;";

    static void Main(string[] args)
    {
        Console.WriteLine("Press S to Save Employee Info");
        Console.WriteLine("Press G to Get Employee Info");
        var option = Console.ReadLine();

        if (option.ToUpper() == "S")
        {
            SaveEmployee();
        }
        else if (option.ToUpper() == "G")
        {
            GetEmployee();
        }
        else
        {
            Console.WriteLine("Invalid option");
        }
    }

    static void SaveEmployee()
    {
        try
        {
            Console.WriteLine("Enter Employee Name:");
            var name = Console.ReadLine();

            Console.WriteLine("Enter City:");
            var city = Console.ReadLine();

            Console.WriteLine("Enter Address:");
            var address = Console.ReadLine();

            Console.WriteLine("Enter Department Name:");
            var department = Console.ReadLine();

            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                string query = "INSERT INTO Employee (EmployeeName, City, Address, DepartmentName) VALUES (@EmployeeName, @City, @Address, @DepartmentName)";
                SqlCommand command = new SqlCommand(query, connection);
                command.Parameters.AddWithValue("@EmployeeName", name);
                command.Parameters.AddWithValue("@City", city);
                command.Parameters.AddWithValue("@Address", address);
                command.Parameters.AddWithValue("@DepartmentName", department);

                connection.Open();
                command.ExecuteNonQuery();
                connection.Close();

                Console.WriteLine("Employee information saved successfully.");
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Error: {ex.Message}");
        }
    }

    static void GetEmployee()
    {
        try
        {
            Console.WriteLine("Enter Employee Name to search:");
            var name = Console.ReadLine();

            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                string query = "SELECT * FROM Employee WHERE EmployeeName = @EmployeeName";
                SqlCommand command = new SqlCommand(query, connection);
                command.Parameters.AddWithValue("@EmployeeName", name);

                connection.Open();
                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    Console.WriteLine($"Name: {reader["EmployeeName"]}");
                    Console.WriteLine($"City: {reader["City"]}");
                    Console.WriteLine($"Address: {reader["Address"]}");
                    Console.WriteLine($"Department: {reader["DepartmentName"]}");
                }
                else
                {
                    Console.WriteLine("Employee not found.");
                }

                connection.Close();
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Error: {ex.Message}");
        }
    }
}
