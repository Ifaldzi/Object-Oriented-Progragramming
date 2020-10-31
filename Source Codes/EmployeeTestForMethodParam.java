public class EmployeeTestForMethodParam
{
	public static void main(String[] args)
	{
		Employee staff;
		staff = new Employee("Roger", 80000);
		Employee staff2 = new Employee("Jon", 89934);

		staff.printEmployee();
		staff2.printEmployee();		
		swap(staff, staff2); // it doesn't work
		staff.printEmployee();
		staff2.printEmployee();

	}
		public static void swap(Employee x, Employee y)
		{
			Employee temp = x;
			x = y;
			y = temp;
		}
}
class Employee
{
	private String name;
	private double salary;
	private int id;
	public static int nextId = 1;

	public Employee(String _name, double _salary)
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