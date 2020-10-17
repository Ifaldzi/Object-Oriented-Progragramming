import java.util.*;

public class FormattingOut
{
	public static void main(String[] args)
	{
		double x = 10000.0 / 3.0;
		System.out.println(x);
		System.out.printf("%,8.2f\n", x);

		int a = 159;
		System.out.printf("%1$d %1$x\n", a);

		System.out.printf("%tc\n", new Date());

		System.out.printf("%1$s %2$tB %2$te %2$tY", "Due date:", new Date());
	}
}