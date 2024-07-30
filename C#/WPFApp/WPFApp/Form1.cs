using System;
using System.Data;
using System.Data.SqlClient;
using System.Windows.Forms;

namespace EmployeeManagement
{
    public partial class MainForm : Form
    {
        private string connectionString = "YOUR_CONNECTION_STRING_HERE";

        public MainForm()
        {
            InitializeComponent();
            LoadEmployees();
        }

        private void LoadEmployees()
        {
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                connection.Open();
                string query = "SELECT * FROM Employees";
                SqlDataAdapter adapter = new SqlDataAdapter(query, connection);
                DataTable dt = new DataTable();
                adapter.Fill(dt);
                dataGridViewEmployees.DataSource = dt;
            }
        }

        private void btnEdit_Click(object sender, EventArgs e)
        {
            if (dataGridViewEmployees.SelectedRows.Count > 0)
            {
                // Get the selected employee's ID
                int employeeId = (int)dataGridViewEmployees.SelectedRows[0].Cells["Id"].Value;

                // Open a new form to edit the employee details
                EditForm editForm = new EditForm(connectionString, employeeId);
                editForm.ShowDialog();
                LoadEmployees(); // Refresh the grid after editing
            }
        }

        // ... (Add and delete buttons, other logic)
    }
}

// EditForm.cs
public partial class EditForm : Form
{
    private string connectionString;
    private int employeeId;

    public EditForm(string connectionString, int employeeId)
    {
        InitializeComponent();
        this.connectionString = connectionString;
        this.employeeId = employeeId;

        // Load employee details into textboxes
        // ... (Similar to LoadEmployees in MainForm)
    }

    private void btnUpdate_Click(object sender, EventArgs e)
    {
        // Validate input
        // ...
        try
        {
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                connection.Open();
                string query = "UPDATE Employees SET Name = @Name, City = @City, Address = @Address WHERE Id = @Id";
                SqlCommand command = new SqlCommand(query, connection);
                // ... (Add parameters and execute query)
            }
        }
        catch (Exception ex)
        {
            // Handle errors
        }
    }
}
