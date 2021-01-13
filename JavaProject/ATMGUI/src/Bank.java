import java.util.ArrayList;

public class Bank {
    private String bankName;
    private int bankCode;
    private ArrayList<Account> accountsList;
    
    public Bank(){
        bankName = "";
        bankCode = 0;
        accountsList = new ArrayList<>();
    }
    
    public int getBankCode(){
        return this.bankCode;
    }
    
    public String getBankName(){
        return this.bankName;
    }
    
    public ArrayList<Account> getAccountsList(){
        return this.accountsList;
    }
    
    public Account findAccount(int accountNumber){
        for(Account account : accountsList){
            if(account.getAccountNumber() == accountNumber)
                return account;
        }
        return null;
    }
}
