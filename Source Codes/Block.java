public class Block
{
	public static void main(String[] args)
	{
		// this is block area
		int n = 20;
		{
			// this is nested block area
			int k = 10;
			System.out.println(k);
		}
		System.out.println(n);
		//System.out.println(k); you can't do this, because k is declared in another block
	}
}