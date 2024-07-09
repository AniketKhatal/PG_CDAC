//Inheritence


namespace AssignmentNo3
{
    internal class EmployeeMgnt
    {
       abstract class Employee
        {
            private string name;
            private string Name
            {
                set
                {
                    if (value != null)
                    {
                        this.name = value;
                    }
                    else throw new Exception("No blanks")
                }
            }
            //for autogeneration
            private static int Empno = 0;

            private short deptno;
            private short DeptNo
            {
                set
                {
                    if (value > 0)
                    {
                        this.deptno = value;
                    }
                    else
                    {
                        throw new Exception("Department number must b  greater than Zero");
                    }
                }
            }
            public Employee(string name,short deptNo=0)
            {
                this.Name = name;
                this.DeptNo = deptNo;
                Empno++;
            }
            public abstract decimal Basic { set; get; }
            public abstract decimal CalcNetSalary();
        }

        public class Manager : Employee
        {
            private string designation;
            private string Designation
            {
                set
                {
                    if (!string.IsNullOrEmpty(value))
                    {
                        this.designation = value;
                    }
                    else
                    {
                        throw new Exception("Cant be blank");
                    }
                }
            }
            public Manager(string name,short deptNo,string designation)
            {
                Designation = designation;
            }

        }
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }
}
