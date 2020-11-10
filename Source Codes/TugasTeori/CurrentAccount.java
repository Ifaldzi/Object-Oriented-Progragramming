package TugasTeori;

public class CurrentAccount extends Account
{
	private double overdraftLimit;

	public CurrentAccount(int a)
	{
		super(a);
		overdraftLimit = 50000;
	}

	public CurrentAccount(int a, double overdraftLimit)
	{
		super(a);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double sum)
	{
		super.withdraw(sum);
		if(getBalance() < overdraftLimit) System.out.println("You get an overdraft limit");
	}

	@Override
	public String toString()
	{
		return "Curent Acc " + getAccountNumber() + " with overdraft limit " + overdraftLimit + ": " + "balance = " + getBalance();
	}
}