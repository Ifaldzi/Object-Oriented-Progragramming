import mypackage.CoreJava.*;

public class ToStringTest
{
	public static void main(String[] args) 
	{
		OtherEmployee employee = new OtherEmployee("Jhon", 1000, 31, 2, 2001);
		System.out.println(employee.toString());
		Manager manager = new Manager("Ahmad", 54000, 31, 4, 1989);
		System.out.println(manager.toString());
	}
}