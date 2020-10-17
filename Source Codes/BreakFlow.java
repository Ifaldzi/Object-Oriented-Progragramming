public class BreakFlow
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 1;
		count:
		while(a <= 100)
		{
			b = 3;
			while(b <= 100)
			{
				if(b == a) break count;
				b *= 2;
			}
			a+=2;
		}
		// this statement is excecuted after break count
		System.out.println("After labeled break a=" + a + " b=" + b);

		for(int x=1;x<=50;x++)
		{
			if(x%2 == 0) continue; // if even number don't print the number
			System.out.print(x + " ");
		}
	}
}