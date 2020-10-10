public class Relation
{
	public static void main(String[] args)
	{
		int x = 3;
		int y = 7;
		if(x == y)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}

		int a = 98;
		int b = 43;
		int c = a < b? a:b;
		System.out.println("Smaller number is: " + c);
	}
}