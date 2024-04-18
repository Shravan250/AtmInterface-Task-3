
    package atminterface;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;


    public class Atminterface extends JFrame implements ActionListener {

        JButton withdraw , deposit , bal ,exit ;
        
        double balance;
        
        Atminterface(double balance){
            
            this.balance = balance; 

            setLayout(null);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(700 , 700 , Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel label = new JLabel(i3);
            label.setBounds(0 , 0 , 700 , 700);
            add(label);

            withdraw = new JButton("Withdraw");
            withdraw.setBounds(130 , 402 , 100 , 30);
            withdraw.addActionListener(this);
            label.add(withdraw);
            
            deposit = new JButton("Deposit");
            deposit.setBounds(295 , 402 , 100 , 30);
            deposit.addActionListener(this);
            label.add(deposit);
            
            bal = new JButton("Balance");
            bal.setBounds(130 , 432 , 100 , 30);
            bal.addActionListener(this);
            label.add(bal);
            
            exit = new JButton("Exit");
            exit.setBounds(295 , 432 , 100 , 30);
            exit.addActionListener(this);
            label.add(exit);
            
            setSize(700, 700);
            setLocation(350 , 30);
            setVisible(true);

        }


        public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == exit){
                System.exit(0);
            }else if(ae.getSource() == deposit){
                setVisible(false);
                new Deposit(balance).setVisible(true);
            }else if(ae.getSource() == withdraw){
                setVisible(false);
                new Withdrawl(balance).setVisible(true);
            }else if(ae.getSource() == bal){
                setVisible(false);
                new Balance(balance).setVisible(true);
            }
        
        }


        public static void main(String[] args) {
            new Atminterface(0);
        }

    }
