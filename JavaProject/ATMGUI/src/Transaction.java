/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifaldzi
 */
public abstract class Transaction {
    private Account account;
    
    public Transaction(Account account){
        this.account = account;
    }
    
    public Account getAccount(){
        return this.account;
    }
    
    abstract boolean execute();
}
