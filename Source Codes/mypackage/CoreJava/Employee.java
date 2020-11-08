package mypackage.CoreJava;
/**
A {@code Employee} object represent the employee
attribute: name, salary, id 
*/
public class Employee
{
	private String name;
	private double salary;
	private int id;
	/**
	nextId: the next id for the next employee
	*/
	public static int nextId = 1;

	public Employee(String _name, double _salary)
	{
		name = _name;
		salary = _salary;
	}

	public Employee()
	{
		name = "No name";
		salary = 0;
	}

	/** <strong> this is getter for name </strong> */
	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	/**
	Raise the salary of the employee
	@param byPercent the percentage rise the salary (10 means 10%)
	*/
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