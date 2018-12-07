/*Készítsünk egy egyszerű számológépet! Ablakos alkalmazás legyen, ami tartalmaz
        2 textField-et, 4 rádiógombot, valamint egy "doIt" Button-t. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SzamologepGui extends JFrame{
        private JPanel contentPane;

        public SzamologepGui() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            setTitle("Számológép");
            contentPane = new JPanel();
            contentPane.setLayout(null);
            setContentPane(contentPane);

            JTextField firstTextField = new JTextField();
            firstTextField.setBounds(50, 40, 80, 30);
            add(firstTextField);

            JTextField secondTextField = new JTextField();
            secondTextField.setBounds(160, 40, 80, 30);
            add(secondTextField);

            ButtonGroup csoport = new ButtonGroup();

            JRadioButton osszeadas = new JRadioButton("Összeadás");
            osszeadas.setBounds(270, 40, 100, 30);
            osszeadas.setSelected(true);
            csoport.add(osszeadas);
            add(osszeadas);

            JRadioButton kivonas = new JRadioButton("Kivonás");
            kivonas.setBounds(270, 80, 100, 30);
            kivonas.setSelected(true);
            csoport.add(kivonas);
            add(kivonas);

            JRadioButton szorzas = new JRadioButton("Szorzás");
            szorzas.setBounds(270, 120, 100, 30);
            szorzas.setSelected(true);
            csoport.add(szorzas);
            add(szorzas);

            JRadioButton osztas = new JRadioButton("Osztás");
            osztas.setBounds(270, 160, 100, 30);
            osztas.setSelected(true);
            csoport.add(osztas);
            add(osztas);

            JButton firstButton = new JButton("Számolj!");
            firstButton.setBounds(70, 170, 150, 30);
            add(firstButton);
            //firstButton.addActionListener();

            JLabel cimke = new JLabel("Eredmény:");
            cimke.setBounds(110, 90, 150, 30);
            add(cimke);

            JTextField eredmeny = new JTextField();
            eredmeny.setBounds(70, 120, 150, 30);
            add(eredmeny);
    }
}


