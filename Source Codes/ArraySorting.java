import java.util.Arrays;

public class ArraySorting
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		for(int i=0; i<10; i++)
		{
			a[i] = i;
		}
		int[] randomNumbers = new int[10];
		for(int i=0; i<a.length; i++)
		{
			randomNumbers[i] = (int) (Math.random() * 10);
		}
		//print sorted randomNumbers
		Arrays.sort(randomNumbers);
		for(int number : randomNumbers)
		{
			System.out.println(number);
		}
	}
}