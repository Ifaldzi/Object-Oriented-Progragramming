import java.util.Arrays;

public class ArrayCopy
{
	public static void main(String[] args)
	{
		int[] luckyNumbers = {1, 2, 3, 4};
		int[] smallPrimes = luckyNumbers;
		smallPrimes[3] = 100; // luckyNumbers[3] is also 100, contents in that 2 "variable" arrays is always similiar
		for(int i=0;i<4;i++)
		{
			System.out.print(smallPrimes[i] + "|" + luckyNumbers[i] + " ");
		}
		System.out.print("\n");

		smallPrimes = Arrays.copyOf(luckyNumbers, luckyNumbers.length); // copy the value of the array to new array
		smallPrimes[1] = 666;
		for(int i=0;i<4;i++)
		{
			System.out.print(smallPrimes[i] + "|" + luckyNumbers[i] + " ");
		}
	}
}