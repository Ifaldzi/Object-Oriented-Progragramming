public class EmployeeTestForMethodParam
{
	public static void main(String[] args)
	{
		EmployeePar staff;
		staff = new EmployeePar("Roger", 80000);
		EmployeePar staff2 = new EmployeePar("Jon", 89934);

		staff.printEmployee();
		staff2.printEmployee();		
		swap(staff, staff2); // it doesn't work
		staff.printEmployee();
		staff2.printEmployee();

	}
		public static void swap(EmployeePar x, EmployeePar y)
		{
			EmployeePar temp = x;
			x = y;
			y = temp;
		}
}
class EmployeePar
{
	private String name;
	private double salary;
	public static int nextId = 1;

	public EmployeePar(String _name, double _salary)
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
}