public class Mathematical
{
	public static void main(String[] args)
	{
		double x = 4;
		double y = Math.sqrt(x);
		double z = Math.pow(x,y);
		System.out.println("sqrt = " + y);
		System.out.println("pow = " + z);
		double r = 3;
		double area = Math.pow(r,2) * Math.PI;
		System.out.println("Area = " + area);
	}
}