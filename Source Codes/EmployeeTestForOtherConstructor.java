public class EmployeeTestForOtherConstructor
{
	public static void main(String[] args)
	{
		EmployeeOther staff = new EmployeeOther(55550);
		staff.printEmployee();
	}
}
class EmployeeOther
{
	private String name;
	private double salary;

	public EmployeeOther(String _name, double _salary)
	{
		name = _name;
		salary = _salary;
	}

	public EmployeeOther(double salary)
	{
		this("Bang", salary);
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void printEmployee()
	{
		System.out.println("Name: " + name + " salary: " + salary);
	}
}