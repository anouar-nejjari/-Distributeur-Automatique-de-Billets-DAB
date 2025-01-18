package BANKS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField t1;
    JButton b1,b2;
    JLabel l1,l2;
    String pin;
    
    Withdrawl(String pin){
        this.pin = pin;
        
        // Image de fond
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo1/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        
        l1 = new JLabel("RETRAIT MAXIMUM : DH 10 000");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        l2 = new JLabel("VEUILLEZ ENTRER VOTRE MONTANT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        
        b1 = new JButton("RETIRER");
        b2 = new JButton("RETOUR");
        
        setLayout(null);
        
        l1.setBounds(200,350,400,20);
        l3.add(l1);
        
        l2.setBounds(190,400,400,20);
        l3.add(l2);
        
        t1.setBounds(190,450,330,30);
        l3.add(t1);
        
        b1.setBounds(390,588,150,35);
        l3.add(b1);
        
        b2.setBounds(390,633,150,35);
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource() == b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Veuillez entrer le montant que vous souhaitez retirer");
                }else{
                    Conn c1 = new Conn();
                    
                    // Récupérer le solde actuel
                    ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pin+"'");
                    int balance = 0;
                    while(rs.next()){
                        // Calculer le solde total en fonction des dépôts et retraits
                        if(rs.getString("mode").equals("Deposit")){
                            balance += Integer.parseInt(rs.getString("amount"));
                        }else{
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    
                    // Vérifier si le solde est suffisant
                    if(balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null, "Solde insuffisant");
                        return;
                    }
                    
                    // Effectuer le retrait en insérant une nouvelle ligne dans la table `bank`
                    c1.s.executeUpdate("insert into bank (pin, date, mode, amount) values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                    
                    // Afficher un message de succès
                    JOptionPane.showMessageDialog(null, "DH. "+amount+" débités avec succès");
                    
                    // Rediriger vers l'écran des transactions
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource() == b2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
    }
}
