import mypackage.CoreJava.Employee;

public class ClassTest
{
	public static void main(String[] args) 
	{
		Employee e;
		e = new Employee("Makoto", 4500);
		Class cl = e.getClass();
		System.out.println(cl.getName() + " " + e.getName());

		try
		{
			String name = "mypackage.CoreJava.Employee";
			Class cl2 = Class.forName(name);
			Object eNew = cl2.newInstance();
			System.out.println(eNew.getClass().getName());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}