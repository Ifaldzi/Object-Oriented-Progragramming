public class Conditional
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 6;
		int z = 10;
		int max;
		if(x>y)
		{
			if(x>z)
			{
				max = x;
			}
			else max = z;
		}
		else
		{
			if(y>z)
			{
				max = y;
			}
			else max = z;
		}
		System.out.println(max);
	}
}