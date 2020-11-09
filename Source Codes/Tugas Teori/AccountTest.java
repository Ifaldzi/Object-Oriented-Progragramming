public class AccountTest
{
	public static void main(String[] args)
	{
		Account account = new SavingsAccount(12345, 5);
		account.deposit(10000);
		account.withdraw(5000);
		SavingsAccount sa = (SavingsAccount) account;
		sa.addInterest();
		account.print();

		CurrentAccount account2 = new CurrentAccount(54321);
		account2.deposit(10_000_000);
		account2.print();

		Bank bank = new Bank();
		bank.openAccount(new SavingsAccount(44455));
		bank.update();
		bank.print();
		bank.closeAccount(44455);
		bank.payingDividend(5);
		System.out.println("After paying divident");
		bank.print();
	}
}