package mypackage.CoreJava;

public class OtherEmployee
{
	public OtherEmployee(String n, double s, int day, int month, int year)
	{
		name = n;
		salary = s;
		hireday = day;
		hiremonth = month;
		hireyear = year;
	}

	public String getName()
	{
		return name;
	}

	public void print()
	{
		System.out.println(name + " " + salary + " " + hireYear());
	}

	public void raiseSalary(double byPercent)
	{
		salary *= 1 + byPercent / 100;
	}

	public int hireYear()
	{
		return hireyear;
	}

	public boolean equals(Object otherObject)
	{
		if(this == otherObject) return true;
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		OtherEmployee other = (OtherEmployee) otherObject;
		return name.equals(other.name);
	}

	public String toString()
	{
		return getClass().getName() + "[name=" + name + ",salary=" + salary
				+ ",hireday=" + hireday + ",hiremonth=" + hiremonth
				+ ",hiremonth=" + hiremonth + "]";
	}

	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
}