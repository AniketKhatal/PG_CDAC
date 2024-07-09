//Inheritence


using System.Security.Cryptography.X509Certificates;

namespace AssignmentNo3
{
    internal class EmployeeMgnt
    {
       public abstract class Employee
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
                    else throw new Exception("No blanks");
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
            private int sal;
            private int Sal
            {
                set
                {
                    if (value > 1000)
                    {
                        this.sal = value;
                    }
                }
                get
                {
                    return this.sal;
                }
            }
            //Constructor
            public Employee(string name,short deptNo=0,int sal)
            {
                Empno++;
                this.name = name;
                this.DeptNo = deptNo;
                this.sal = sal; 
               
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
            public Manager(string name, short deptNo, string designation,int sal) : base(name, deptNo,sal)
            {
                {
                    this.designation = designation;
                }
            }
            public override decimal Basic { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
            public override decimal CalcNetSalary()
            {
                return Basic * 25;
            }
        }

        public class GeneralManager : Manager
        {
            private string Perks;

            public GeneralManager(string name,short deptNo,string designation,string Perks,int sal) : base(name, deptNo,sal, designation)
            {
                this.Perks = Perks;
            }
            public override decimal Basic { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
            public override decimal CalcNetSalary()
            {
                return Basic * 25;
            }

        }

        public class CEO : Employee
        {
            public CEO(string name, short deptNo,int sal) : base(name, deptNo,sal)
            {
            }
            public override decimal Basic { get => throw new NotImplementedException(); set => throw new NotImplementedException(); }
            //sealded the method for preventing the further implementation
            public sealed override decimal CalcNetSalary()
            {
                return Basic * 25;
            }
        }
        public override string? ToString()
        {
            return base.ToString();
        }
        static void Main(string[] args)
        {

    
        }
    }
}
