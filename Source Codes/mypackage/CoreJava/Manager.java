package mypackage.CoreJava;

import java.util.*;

public class Manager extends OtherEmployee
{
	public Manager(String n, double s, int d, int m, int y)
	{
		super(n, s, d, m, y);
		secretaryName = "";
	}

	public void raiseSalary(double byPercent)
	{
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}

	public String getSecretaryName()
	{
		return secretaryName;
	}

	public boolean equals(Object otherObject)
	{
		if(!super.equals(otherObject)) return false;
		Manager other = (Manager) otherObject;
		return secretaryName == other.secretaryName;
	}

	public String toString()
	{
		return super.toString() + "[secretaryName=" + secretaryName + "]";
	}

	private String secretaryName;
}