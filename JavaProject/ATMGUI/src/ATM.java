import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifaldzi
 */
public class ATM {
    private ArrayList<Bank> banksData;
    private String screen;
    private Bank currentBank;
    private Account currentAccount;
    private Transaction currentTransaction;
    
    public ATM(){
        this.banksData = new ArrayList<>();
        this.screen = "loginMenu";
        loadAtmData();
        this.currentAccount = null;
        this.currentBank = null;
        this.currentTransaction = null;
    }
    
    public ArrayList<Bank> getBanksData(){
        return this.banksData;
    }
    
    public String getScreen(){
        return this.screen;
    }
    
    public void setScreen(String screen){
        this.screen = screen;
    }
    
    public Bank getCurrentBank(){
        return this.currentBank;
    }
    
    public Account getCurrentAccount(){
        return this.currentAccount;
    }
    
    public Transaction getCurrentTransaction(){
        return this.currentTransaction;
    }
    
    public Bank findBank(int bankCode){
        for(Bank bank : banksData){
            if(bank.getBankCode() == bankCode)
                return bank;
        }
        return null;
    }
    
    public void loadAtmData(){
        Gson gson = new Gson();
        try{
            Reader reader = Files.newBufferedReader(Paths.get("src/ATMdata.json"));
            this.banksData = gson.fromJson(reader, new TypeToken<ArrayList<Bank>>(){}.getType());
        }
        catch(IOException exception){
            System.out.print("error");
        }
    }
    
    public Account findAccount(int accountNumber){
        for(Bank bank: banksData){
            for(Account account: bank.getAccountsList()){
                if(account.getAccountNumber() == accountNumber){
                    this.currentBank = bank;
                    this.currentAccount = account;
                    return account;
                }
            }
        }
        return null;
    }
    
    public Account findAccount(int bankCode, int accountNumber){
        for(Bank bank: banksData){
            if(bank.getBankCode() == bankCode){
                for(Account account: bank.getAccountsList()){
                    if(account.getAccountNumber() == accountNumber){
                        return account;
                    }
                }
            }
        }
        return null;
    }
    
    // this main method is for testing purpose
    public static void main(String[] args){
        ATM atm = new ATM();
        System.out.println(atm.findBank(100).findAccount(999999).getAccountNumber());
        atm.findAccount(999999).credit(1000);
        atm.updateAtmData();
    }
    
    public void resetCurrentData(){
        this.currentAccount = null;
        this.currentBank = null;
        this.currentTransaction = null;
    }
    
    public void updateAtmData(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try{
            Writer writer = Files.newBufferedWriter(Paths.get("src/ATMdata.json"));
            gson.toJson(banksData, writer);
            writer.close();
        }
        catch(IOException exception){
            System.out.print("error");
        }
    }
    
    public void createTransaction(double amount){
        currentTransaction = new Withdrawal(currentAccount, amount);
    }
    
    public void createTransaction(Account accountReceiver, double amount){
        currentTransaction = new Transfer(currentAccount, accountReceiver, amount);
    }
    
    public boolean performTransaction(){
        if(currentTransaction.execute()){
            updateAtmData();
            return true;
        }
        return false;
    }
}
