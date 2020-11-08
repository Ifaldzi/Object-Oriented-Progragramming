import mypackage.CoreJava.Employee;
import java.lang.reflect.*;

public class ObjectAnalyzeTest
{
	public static void main(String[] args) 
	{
		Employee harry = new Employee("Harry Hacker", 35000);
		Class cl = harry.getClass();
		Field f;
		try
		{
			f = cl.getDeclaredField("name");
			f.setAccessible(true);
		}
		catch (NoSuchFieldException e)
		{
			e.printStackTrace();
		}
	}
}