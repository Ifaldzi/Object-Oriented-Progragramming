import java.util.Date;

public class ObjVar
{
	public static void main(String[] args)
	{
		Date date = new Date(); // construct the object
		System.out.println(date);

		Date birthday; // birthday doesn't refer to any object
		//System.out.println(birthday) // so you can't do this operation yet
		birthday = null;
	}
}