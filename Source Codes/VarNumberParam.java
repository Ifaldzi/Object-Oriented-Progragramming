public class VarNumberParam
{
	public static void main(String[] args) 
	{
		double largest = max(3.1, 40.3, 44.1, 12.223);
		System.out.println("largest=" + largest);
	}

	public static double max(double... values)
	{
		double largest = Double.NEGATIVE_INFINITY;
		for(double v : values) if(v > largest) largest = v;
		return largest;
	}
}

