public class Employee extends Person
{
    double salary;
    int yearStart;
    String nationalInsuranceNumber;

    public Employee()
    {
        super();
        salary = 0;
        yearStart = 0;
        nationalInsuranceNumber = "00000";
    }

    public Employee(String name, double salary, int yearStart, String nIN)
    {
        super(name);
        this.salary = salary;
        this.yearStart = yearStart;
        this.nationalInsuranceNumber = nIN;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setYearStart(int yearStart)
    {
        this.yearStart = yearStart;
    }

    public void setNationalInsuranceNumber(String nIN)
    {
        this.nationalInsuranceNumber = nIN;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getYearStart()
    {
        return yearStart;
    }

    public String getNationalInsuranceNumber()
    {
        return nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object other)
    {
        if(!super.equals(other)) return false;
        Employee e = (Employee) other;
        return e.salary == salary && e.yearStart == yearStart
                && e.nationalInsuranceNumber.equals(nationalInsuranceNumber);
    }
}
