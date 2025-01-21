package com.geoproject.gui;

//GUI-Klasse.
//Authors: Theodor, Timo
//Version: 21/1/2025

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.geoproject.Game;

public class UI extends JFrame implements ActionListener {
    JFrame frame;
    JButton[] buttons;
    JTextField pTurnField, p1MoneyField, p2MoneyField;
    JTextArea p1StatsArea, p2StatsArea;
    JButton buyCountriesButton, upgradeButton, eventManagerButton;
    JPanel panel;
    JButton backButton;
    JButton finishTurnButton;
    JPanel subPanel2;
    Game game = new Game();
    

    public UI() {
        createNewGUI();
    }

    private void createNewGUI() {
        //Optimieren und kommentieren!!!!!!!!
        frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Absolute Positionierung
        frame.setSize(1400, 800);
        
        pTurnField = new JTextField("Spieler -'s Zug");
        pTurnField.setBounds(5, 10, 120, 30);
        pTurnField.setEditable(false);

        p1MoneyField = new JTextField("Geld (P1): ----");
        p1MoneyField.setBounds(675, 10, 105, 30);
        p1MoneyField.setEditable(false);
        
        p2MoneyField = new JTextField("Geld (P2): ----");
        p2MoneyField.setBounds(675, 50, 105, 30);
        p2MoneyField.setEditable(false);

        p1StatsArea = new JTextArea("Besitz: -");
        p1StatsArea.setBounds(130, 10, 260, 120);
        p1StatsArea.setEditable(false);
        p1StatsArea.setLineWrap(true);
        p1StatsArea.setWrapStyleWord(true);
        
        p2StatsArea = new JTextArea("Besitz: -");
        p2StatsArea.setBounds(400, 10, 260, 120);
        p2StatsArea.setEditable(false);
        p2StatsArea.setLineWrap(true);
        p2StatsArea.setWrapStyleWord(true);
        
        buyCountriesButton = new JButton("Land Kaufen");
        buyCountriesButton.setBounds(140, 170, 170, 50);
        
        upgradeButton = new JButton("Wirtschaft Upgraden");
        upgradeButton.setBounds(315, 170, 170, 50);
        
        eventManagerButton = new JButton("Events_Verwalten");
        eventManagerButton.setBounds(490, 170, 170, 50);
        
        panel = new JPanel(new FlowLayout());
        panel.setBounds(20, 270, 760, 120);
        
        finishTurnButton = new JButton("Zug_fertig");
        backButton = new JButton("Back");
        
        subPanel2 = new JPanel(new FlowLayout());
        subPanel2.setBounds(20, 400, 760, 300);
        
        buttons = new JButton[] {buyCountriesButton, upgradeButton, eventManagerButton, backButton, finishTurnButton};
        
        for (JButton button : buttons) {
            button.addActionListener(this);
        }
        
        frame.getContentPane().removeAll();
        panel.removeAll();
        subPanel2.removeAll();
        frame.add(pTurnField);
        frame.add(p1MoneyField);
        frame.add(p2MoneyField);
        frame.add(p1StatsArea);
        frame.add(p2StatsArea);
        frame.add(buyCountriesButton);
        frame.add(upgradeButton);
        frame.add(eventManagerButton);
        frame.add(panel);
        panel.add(backButton);
        panel.add(finishTurnButton);
        frame.add(subPanel2);
        
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buyCountriesButton) { 
            
            //showButton1Options();
        } else if (e.getSource() == upgradeButton) {
        } else if (e.getSource() == eventManagerButton) {
        } else if (e.getSource() == backButton) {
        } 
    }
    
    public void activateAllButtons () {
        for (JButton button : buttons) {
            button.setEnabled(true);
        }
    }
}






