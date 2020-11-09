public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount(int a)
	{
		super(a);
		interestRate = 2.5;
	}

	public SavingsAccount(int a, double interest)
	{
		super(a);
		interestRate = interest;
	}

	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}

	public double getInterestRate()
	{
		return interestRate;
	}

	public void addInterest()
	{
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}

	@Override
	public String toString()
	{
		return "Savings Acc " + getAccountNumber() + " has interest rate " + interestRate + "% : " + "balance = " + getBalance();
	}
}