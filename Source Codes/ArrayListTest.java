import mypackage.CoreJava.*;
import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args) 
	{
		ArrayList<OtherEmployee> staff = new ArrayList<>();
		staff.add(new OtherEmployee("Jhon", 1000, 31, 2, 2001));
		staff.add(new OtherEmployee("Dalton", 4000, 12, 12, 20012));
		staff.add(new OtherEmployee("Shappire", 52000, 10, 10, 2010));

		for(OtherEmployee e: staff)
		{
			e.print();
		}
	}
}