public class EmployeeTestForOtherConstructor
{
	public static void main(String[] args)
	{
		Employee staff = new Employee(55550);
		staff.printEmployee();
	}
}
class Employee
{
	private String name;
	private double salary;

	public Employee(String _name, double _salary)
	{
		name = _name;
		salary = _salary;
	}

	public Employee(double salary)
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