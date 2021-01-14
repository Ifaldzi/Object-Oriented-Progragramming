/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifaldzi
 */
public class Transfer extends Transaction{
    private Account accountReceiver;
    private double amount;
    
    public Transfer(Account account, Account accountReceiver, double amount){
        super(account);
        this.accountReceiver = accountReceiver;
        this.amount = amount;
    }
    
    public Account getAccountReceiver(){
        return this.accountReceiver;
    }
    
    @Override
    public boolean execute(){
        if(accountReceiver != null){
            if(getAccount().getTotalBalance() >= amount){
                getAccount().debit(amount);
                accountReceiver.credit(amount);
                return true;
            }
        }
        return false;
    }
}
