
package atminterface;

import javax.swing.*;
import java.awt.*;


public class Bankaccount {
        
        
    //Withdrawl
    public double Withdrawl(double balance , double amount){
        
        if (amount > 0 && amount <= balance ){
            try{
                balance -= amount;
                JOptionPane.showMessageDialog(null , "Withdrawl Successfull");
                return balance;
            }catch(Exception e){
                
                System.out.println(e);
            }
        }else{
            JOptionPane.showMessageDialog(null , "Insufficient funds");
            return balance;
        }    
        return 0;
    }
    
        
    //Deposit
    public double Deposit(double balance ,double amount){

        if (amount > 0){
            balance += amount;
            JOptionPane.showMessageDialog(null ,"Amount Deposited Successfully");            
            return balance;
        }else{
            JOptionPane.showMessageDialog(null ,"Invalid deposit amount");
            return balance;
        }
    }       
        
    //Check balance
    public double Checkbalace(double balance){    
        return balance;
    }    
        

    
    

}
