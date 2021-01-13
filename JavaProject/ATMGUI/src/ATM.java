import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
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
    private ArrayList<Bank> banksList;
    private String screen;
    
    public ATM(){
        this.banksList = new ArrayList<>();
        this.screen = "loginMenu";
        loadAtmData();
    }
    
    public String getScreen(){
        return this.screen;
    }
    
    public void setScreen(String screen){
        this.screen = screen;
    }
    
    public Bank findBank(int bankCode){
        for(Bank bank : banksList){
            if(bank.getBankCode() == bankCode)
                return bank;
        }
        return null;
    }
    
    public void loadAtmData(){
        Gson gson = new Gson();
        try{
            Reader reader = Files.newBufferedReader(Paths.get("src/ATMdata.json"));
            this.banksList = gson.fromJson(reader, new TypeToken<ArrayList<Bank>>(){}.getType());
        }
        catch(Exception exception){
            System.out.print("error");
        }
    }
    
    public Account findAccount(int accountNumber){
        for(Bank bank: banksList){
            for(Account account: bank.getAccountsList()){
                if(account.getAccountNumber() == accountNumber)
                    return account;
            }
        }
        return null;
    }
    
    public static void main(String[] args){
        ATM atm = new ATM();
        System.out.println(atm.findBank(100).findAccount(999999).getAccountNumber());
    }
}
