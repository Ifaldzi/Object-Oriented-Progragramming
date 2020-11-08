package mypackage.abstractClass;

public class Employee extends Person
{
	public Employee(String n, double s, int day, int month, int year)
	{
		super(n);
		salary = s;
		hireday = day;
		hiremonth = month;
		hireyear = year;
	}

	public void print()
	{
		System.out.println(getName() + " " + salary + " " + hireYear());
	}

	public void raiseSalary(double byPercent)
	{
		salary *= 1 + byPercent / 100;
	}

	public int hireYear()
	{
		return hireyear;
	}

	public String getDescription()
	{
		return "an employee with salary of " + salary;
	}

	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
}