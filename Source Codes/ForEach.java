public class ForEach
{
	public static void main(String[] args)
	{
		int[] array = new int[10];
		for(int i=0;i<10;i++) 
		{
			array[i] = i+1;
		}
		int sum = 0;
		for(int number : array)
		{
			sum += number;
		}
		System.out.println(sum);
	}
}