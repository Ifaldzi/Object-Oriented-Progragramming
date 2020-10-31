public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee staff;
		staff = new Employee("Roger", 80000);
		staff.printEmployee();
		staff.raiseSalary(60);
		System.out.println("New salary: " + staff.getSalary());
		Employee boss = new Employee("Roger", 80000);
		if(staff.equals(boss)) System.out.println("This is the boss: " + boss.getName());
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

		public boolean equals(Employee other)
		{
			return name.equals(other.name);
		}
	}