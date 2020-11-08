import mypackage.CoreJava.*;

public class ObjectIdenticTest
{
	public static void main(String[] args) 
	{
		OtherEmployee employee = new OtherEmployee("Jhon", 1000, 31, 2, 2001);
		OtherEmployee employee2 = new OtherEmployee("Jon", 1000, 31, 2, 2001);
		System.out.println(employee.equals(employee2));
		Manager manager = new Manager("Jhon", 1000, 31, 2, 2001);
		Manager manager2 = new Manager("Jhon", 1000, 31, 2, 2001);
		System.out.println(manager.equals(manager2));
	}
}