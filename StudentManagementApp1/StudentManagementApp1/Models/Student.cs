using System;
using System.Collections.Generic;

namespace StudentManagementApp1.Models;

public partial class Student
{
    public int StudentNo { get; set; }

    public string Name { get; set; } = null!;

    public string Section { get; set; } = null!;

    public string Branch { get; set; } = null!;

    public string EmailId { get; set; } = null!;
}
