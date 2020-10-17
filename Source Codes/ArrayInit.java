public class ArrayInit
{
	public static void main(String[] args)
	{
		int[] smallPrimes = {2, 3, 5, 7, 11}; // no need 'new' syntax
		for(int number : smallPrimes) System.out.print(number + " ");

		int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
		smallPrimes = numbers;

		for(int number : smallPrimes) System.out.print(number + " ");
	}
}