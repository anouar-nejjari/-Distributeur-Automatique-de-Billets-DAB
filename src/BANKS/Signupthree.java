package BANKS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signupthree extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    
    Signupthree(String formno){
        this.formno = formno;
        setTitle("FORMULAIRE DE DEMANDE D'OUVERTURE DE COMPTE - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo1/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        l1 = new JLabel("Form 3 : Détails du compte");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Type de compte :");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Numéro de carte:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Votre numéro de carte à 16 chiffres)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("Il apparaîtra sur la carte bancaire/le carnet de chèques et les relevés");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(Mot de passe à 4 chiffres)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services requis :");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l11 = new JLabel("Formulaire n° :");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        c1 = new JCheckBox("CARTE DAB");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Bancaires en ligne");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Bancaires mobiles");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("Alertes par e-mail");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Chéquier");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("Relevé Electronique");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("Je déclare par la présente que les informations saisies ci-dessus sont correctes à ma connaissance.", true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        
        r1 = new JRadioButton("Compte d'épargne");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Compte à terme fixe");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Compte courant");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Compte de dépôt récurrent");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
        
        setLayout(null);
        
        l11.setBounds(700, 10, 70, 30);
        add(l11);
        
        l12.setBounds(770, 10, 40, 30);
        add(l12);
        
        l1.setBounds(280, 40, 400, 40);
        add(l1); 
        
        l2.setBounds(100, 100, 200, 30);
        add(l2);
        
        r1.setBounds(100, 140, 150, 30);
        add(r1);
        
        r2.setBounds(350, 140, 300, 30);
        add(r2);
        
        r3.setBounds(100, 180, 250, 30);
        add(r3);
        
        r4.setBounds(350, 180, 250, 30);
        add(r4);
        
        l3.setBounds(100, 240, 200, 30);
        add(l3);
        
        l4.setBounds(330, 240, 250, 30);
        add(l4);
        
        l5.setBounds(100, 270, 200, 20);
        add(l5);
        
        l6.setBounds(330, 270, 500, 20);
        add(l6);
        
        l7.setBounds(100, 310, 200, 30);
        add(l7);
        
        l8.setBounds(330, 310, 200, 30);
        add(l8);
        
        l9.setBounds(100, 340, 200, 20);
        add(l9);
        
        l10.setBounds(100, 380, 200, 30);
        add(l10);
        
        c1.setBounds(100, 420, 200, 30);
        add(c1);
        
        c2.setBounds(350, 420, 200, 30);
        add(c2);
        
        c3.setBounds(100, 460, 200, 30);
        add(c3);
        
        c4.setBounds(350, 460, 200, 30);
        add(c4);
        
        c5.setBounds(100, 500, 200, 30);
        add(c5);
        
        c6.setBounds(350, 500, 200, 30);
        add(c6);
        
        c7.setBounds(100, 570, 600, 20);
        add(c7);
        
        b1.setBounds(250, 600, 100, 30);
        add(b1);
        
        b2.setBounds(420, 600, 100, 30);
        add(b2);
        
        getContentPane().setBackground(Color.cyan);
        
        setSize(850, 700);
        setLocation(500, 120);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Compte d'épargne";
        }
        else if(r2.isSelected()){ 
            atype = "Compte à Terme Fixe";
        }
        else if(r3.isSelected()){ 
            atype = "Compte courant";
        }else if(r4.isSelected()){ 
            atype = "Compte de Dépôt Récurrent";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " Carte DAB";
        }
        if(c2.isSelected()){ 
            facility = facility + "Bancaires en ligne";
        }
        if(c3.isSelected()){ 
            facility = facility + "Bancaires mobiles";
        }
        if(c4.isSelected()){ 
            facility = facility + "Alertes par e-mail";
        }
        if(c5.isSelected()){ 
            facility = facility + "Chéquier";
        }
        if(c6.isSelected()){ 
            facility = facility + "Relevé Electronique";
        }
        
        try{
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Remplissez tous les champs obligatoires");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Numéro de carte: " + cardno + "\n PIN:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
