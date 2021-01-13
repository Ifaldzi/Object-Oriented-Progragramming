public class Account {
    private int accountNumber;
    private int pin;
    private String name;
    private double totalBalance;

    public Account(){
        this.accountNumber = 2132312;
        this.pin = 123456;
        this.totalBalance = 0;
        this.name = "";
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public String getName(){
        return this.getName();
    }
    
    public double getTotalBalance(){
        return this.totalBalance;
    }
    
    public boolean validatePin(int inputPin){
        return inputPin == this.pin;
    }
    
    public void credit(double amount){
        this.totalBalance += amount;
    }
    
    public void debit(double amount){
        this.totalBalance -= amount;
    }
}
