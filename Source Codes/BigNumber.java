import java.math.BigInteger;

public class BigNumber
{
	public static void main(String[] args)
	{
		int k = 60;
		int n = 495;

		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for(int i=1;i<=k;i++)
			// lotteryOdds = lotteryOdds * (n-i+1) / i
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1).divide(BigInteger.valueOf(i)));
		System.out.println("Your odds are 1 in " + lotteryOdds);
	}
}