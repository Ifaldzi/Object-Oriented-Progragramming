public class InDecOp
{
	public static void main(String[] args)
	{
		int n = 12;
		n++;
		System.out.println(n);

		int m = 7;
		int o = 7;
		int a = 2 * ++m;
		int b = 2 * o++;
		System.out.println("a= " + a + " b= " + b);
		System.out.println("m= " + m + " o= " + o);
	}
}