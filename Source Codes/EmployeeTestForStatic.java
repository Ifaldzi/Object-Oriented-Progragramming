public class EmployeeTestForStatic
{
	public static void main(String[] args)
	{
		EmployeeStatic staff;
		staff = new EmployeeStatic("Roger", 80000);
		staff.setId();
		EmployeeStatic staff2 = new EmployeeStatic("Jon", 89934);
		staff2.setId();
		System.out.println(staff.nextId + " | " + staff2.nextId);
	}
}
class EmployeeStatic
{
	private String name;
	private double salary;
	private int id;
	public static int nextId = 1;

	public EmployeeStatic(String _name, double _salary)
	{
		name = _name;
		salary = _salary;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent/100;
		salary += raise;
	}

	public void printEmployee()
	{
		System.out.println("Name: " + name + " salary: " + salary);
	}

	public void setId()
	{
		id = nextId;
		nextId++;
	}
}