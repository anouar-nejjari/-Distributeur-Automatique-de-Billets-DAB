package BANKS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signuptow extends JFrame implements ActionListener {
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    JButton b;
    JRadioButton r1, r2, r3, r4;
    JTextField t1, t2, t3;
    JComboBox c1, c2, c3, c4, c5;
    String formno;

    Signuptow(String formno) {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo1/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);

        this.formno = formno;
        setTitle("FORMULAIRE DE DEMANDE DE NOUVEAU COMPTE - PAGE 2");

        l1 = new JLabel("Form 2: DETAILS SUPPLEMENTAIRES");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        l3 = new JLabel("Catégorie:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        l4 = new JLabel("Revenu:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));

        l5 = new JLabel("Qualification Éducative:");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));

        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));

        l7 = new JLabel("Numéro PAN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        l8 = new JLabel("Numéro Aadhar:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));

        l9 = new JLabel("Citoyen Senior:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));

        l10 = new JLabel("Compte Existant:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));

        l12 = new JLabel("Formulaire N°:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));

        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));

        b = new JButton("Suivant");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        r1 = new JRadioButton("Oui");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Non");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Oui");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Non");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        String religion[] = {"Musulm","Hindos",  "Sikh", "Chrétien", "Autre"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));

        String category[] = {"Général", "OBC", "SC", "ST", "Autre"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));

        String income[] = {"Aucun", "<1 50 000", "<2 50 000", "<5 00 000", "Jusqu'à 10 00 000", "Au-delà de 10 00 000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = {"Non diplômé", "Diplômé", "Post-Diplômé", "Doctorat", "Autres"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));

        String occupation[] = {"Salarié", "Indépendant", "Entreprise", "Étudiant", "Retraité", "Autres"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));

        setLayout(null);

        l12.setBounds(670, 10, 60, 30);
        add(l12);

        l13.setBounds(760, 10, 60, 30);
        add(l13);

        l1.setBounds(280, 30, 600, 40);
        add(l1);

        l2.setBounds(100, 120, 100, 30);
        add(l2);

        c1.setBounds(350, 120, 320, 30);
        add(c1);

        l3.setBounds(100, 160, 100, 30);
        add(l3);

        c2.setBounds(350, 160, 320, 30);
        add(c2);

        l4.setBounds(100, 200, 100, 30);
        add(l4);

        c3.setBounds(350, 200, 320, 30);
        add(c3);

        l5.setBounds(100, 240, 150, 30);
        add(l5);

        c4.setBounds(350, 240, 320, 30);
        add(c4);

        l6.setBounds(100, 280, 150, 30);
        add(l6);

        c5.setBounds(350, 280, 320, 30);
        add(c5);

        l7.setBounds(100, 320, 150, 30);
        add(l7);

        t1.setBounds(350, 320, 320, 30);
        add(t1);

        l8.setBounds(100, 360, 150, 30);
        add(l8);

        t2.setBounds(350, 360, 320, 30);
        add(t2);

        l9.setBounds(100, 400, 150, 30);
        add(l9);

        r1.setBounds(350, 400, 100, 30);
        add(r1);

        r2.setBounds(460, 400, 100, 30);
        add(r2);

        l10.setBounds(100, 440, 150, 30);
        add(l10);

        r3.setBounds(350, 440, 100, 30);
        add(r3);

        r4.setBounds(460, 440, 100, 30);
        add(r4);

        b.setBounds(570, 500, 100, 30);
        add(b);

        b.addActionListener(this);

        getContentPane().setBackground(Color.cyan);

        setSize(850, 600); // Reduced height to adjust for the compact layout
        setLocation(500, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) c1.getSelectedItem();
        String category = (String) c2.getSelectedItem();
        String income = (String) c3.getSelectedItem();
        String education = (String) c4.getSelectedItem();
        String occupation = (String) c5.getSelectedItem();

        String pan = t1.getText();
        String aadhar = t2.getText();

        String scitizen = "";
        if (r1.isSelected()) {
            scitizen = "Oui";
        } else if (r2.isSelected()) {
            scitizen = "Non";
        }

        String eaccount = "";
        if (r3.isSelected()) {
            eaccount = "Oui";
        } else if (r4.isSelected()) {
            eaccount = "Non";
        }

        try {
            if (t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs obligatoires");
            } else {
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('" + formno + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" + scitizen + "','" + eaccount + "')";
                c1.s.executeUpdate(q1);

                new Signupthree(formno).setVisible(true);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
