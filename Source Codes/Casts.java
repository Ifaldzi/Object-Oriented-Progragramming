public class Casts
{
	public static void main(String[] args)
	{
		double x = 9.997;
		int nx = (int) x;
		System.out.println(nx);

		int mx = (int) Math.round(x);
		System.out.println(mx);

		float f = (float) nx;
		System.out.println(f);
	}
}