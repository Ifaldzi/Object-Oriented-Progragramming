/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifaldzi
 */
public class Withdrawal extends Transaction {
    private double amount;
    
    public Withdrawal(Account account, double amount){
        super(account);
        this.amount = amount;
    }
    
    @Override
    public boolean execute(){
        double totalBalance = getAccount().getTotalBalance();
        if(totalBalance >= amount){
            getAccount().debit(amount);
            return true;
        }
        return false;
    }
}
