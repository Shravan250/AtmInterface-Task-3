
package atminterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Balance extends JFrame implements ActionListener{

    double balance;
    
    JButton exit;
    
    Balance(double balance){

        this.balance = balance;        
        
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700 , 700 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0 , 0 , 700 , 700);
        add(label);

        JLabel text = new JLabel("Your Current Account Balance is Rs. " + balance);
        text.setForeground(Color.WHITE);
        text.setBounds(140 , 240 ,400 ,20);
        label.add(text);
        
        exit = new JButton("Back");
        exit.setBounds(295 , 402 , 100 , 30);
        exit.addActionListener(this);
        label.add(exit);        
        

        setSize(700, 700);
        setLocation(350 , 30);
        setVisible(true);
        
        
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == exit){
            setVisible(false);
            new Atminterface(balance).setVisible(true);
        }
        
    }
    
    public static void main(String args[]){
        new Balance(0);
    }
}
