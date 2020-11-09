import java.util.ArrayList;

public class Bank
{
	private ArrayList<Account> bankAccounts = new ArrayList<>();
	public Bank()
	{
		bankAccounts.add(new Account(12345));
		bankAccounts.add(new SavingsAccount(240501));
		bankAccounts.add(new CurrentAccount(54321, 50000));	
	}

	public Bank(ArrayList<Account> bankAccounts)
	{
		this.bankAccounts = bankAccounts;
	}

	public void update()
	{
		for(Account a: bankAccounts)
		{
			a.deposit(100000);
			if(a instanceof SavingsAccount)
			{
				SavingsAccount temp = (SavingsAccount) a;
				temp.addInterest();
			}
			a.withdraw(60000);
		}
	}

	public void openAccount(Account newAccount)
	{
		bankAccounts.add(newAccount);
	}

	public void closeAccount(int accnum)
	{
		int i = 0;
		for(Account a: bankAccounts)
		{
			if(a.getAccountNumber() == accnum)
			{
				bankAccounts.remove(i);
				return;
			}
			i++;
		}
		System.out.println("Account Number not Found");
	}

	public void print()
	{
		for(Account a: bankAccounts)
		{
			a.print();
		}
	}

	public void payingDividend(double rate)
	{
		for(Account a: bankAccounts)
		{
			a.deposit(a.getBalance() * rate / 100);
		}
	}
}