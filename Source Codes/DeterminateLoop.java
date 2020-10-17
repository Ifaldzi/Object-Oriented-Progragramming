public class DeterminateLoop
{
	public static void main(String[] args)
	{
		int k = 10;
		int n = 50;
		int lotteryOdds = 1;
		for(int i=1; i<=k; i++)
		{
			lotteryOdds = lotteryOdds * (n-i+1)/i;
		}
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}