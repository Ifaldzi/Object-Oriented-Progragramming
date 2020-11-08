import java.util.ArrayList;
import java.lang.Integer;

public class WrappersAutobox
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		System.out.println(list.get(0));
		Integer n = 5;
		int m = n;
		System.out.println(n + " " + m);
		n = null;
		System.out.println(n * 2);
	}
}