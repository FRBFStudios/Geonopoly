package com.geoproject.gui;

//GUI-Klasse.
//Authors: Theodor, Timo
//Version: 21/1/2025

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

import com.geoproject.Game;
import com.geoproject.libraries.CountryLibrary;

public class UI extends JFrame implements ActionListener {
    JFrame frame;
    
    JLabel p1MapArea, p2MapArea;
    JTextField pTurnField, p1MoneyField, p2MoneyField;
    JComboBox<String> p1CountryDropdown, p2CountryDropdown;
    JTextArea p1StatsArea, p2StatsArea;

    JButton buyCountriesButton, upgradeButton, eventManagerButton;
    JPanel subPanel;
    JButton backButton;
    JButton finishTurnButton;
    
    JButton[] subButtons;
    JButton[] buttons;

    Game game = new Game();
    

    public UI() {
        createNewGUI();
    }

    private void createNewGUI() {
        //Optimieren und kommentieren!!!!!!!!
        //evtl. für jeden spieler eine karte mit den besitzten ländern farblich markiert und wenn draufdrücken, dann die wwerte dieses eines landes vom spieler anzeigen
        //oder abhängig vom gedrüchten hauptbutton ein droppdown menü anzeigen, wo man eben das anzuzeigende land/eveltklasse/... auswählen kann
        //oder zeile 99 scroll leayout nutzen
        frame = new JFrame("Geonopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1600, 940);
        
        pTurnField = new JTextField("Player -'s turn");
        pTurnField.setBounds(10, 10, 100, 30);
        pTurnField.setEditable(false);

        p1StatsArea = new JTextArea("Property (P1): -");
        p1StatsArea.setBounds(120, 200, 660, 120);
        p1StatsArea.setEditable(false);
        p1StatsArea.setLineWrap(true);
        p1StatsArea.setWrapStyleWord(true);
        
        p2StatsArea = new JTextArea("Property (P2): -");
        p2StatsArea.setBounds(790, 200, 660, 120);
        p2StatsArea.setEditable(false);
        p2StatsArea.setLineWrap(true);
        p2StatsArea.setWrapStyleWord(true);
        
        p1MoneyField = new JTextField("Money (P1): ----");
        p1MoneyField.setBounds(1460, 10, 115, 30);
        p1MoneyField.setEditable(false);
        
        p2MoneyField = new JTextField("Money (P2): ----");
        p2MoneyField.setBounds(1460, 50, 115, 30);
        p2MoneyField.setEditable(false);

        p1CountryDropdown = new JComboBox<>();
        p1CountryDropdown.setBounds(120, 170, 660, 30);
        
        p2CountryDropdown = new JComboBox<>();
        p2CountryDropdown.setBounds(790, 170, 660, 30);

        p1MapArea = new JLabel("Hier Platz für Karte der besitzten länder(P1)");
        p1MapArea.setBounds(380, 70, 660, 30);
        
        p2MapArea = new JLabel("Hier Platz für Karte der besitzten länder(P2)");
        p2MapArea.setBounds(1050, 70, 660, 30);

        buyCountriesButton = new JButton("Land Kaufen");
        buyCountriesButton.setBounds(500, 350, 180, 50);
        
        upgradeButton = new JButton("Wirtschaft Upgraden");
        upgradeButton.setBounds(700, 350, 180, 50);
        
        eventManagerButton = new JButton("Events_Verwalten");
        eventManagerButton.setBounds(900, 350, 180, 50);
        
        subPanel = new JPanel(new FlowLayout()); //hier gab es scrall layout, vielleicht auch für property nutzen!
        subPanel.setBounds(120, 350, 1330, 120);
        
        finishTurnButton = new JButton("Zug_fertig");
        backButton = new JButton("Back");
    
        buttons = new JButton[] {buyCountriesButton, upgradeButton, eventManagerButton, backButton, finishTurnButton};
        
        for (JButton button : buttons) {
            button.addActionListener(this);
        }

        
        updateCountryDropdowns();
        activateAllButtons();
        updateSubButtons();

        frame.getContentPane().removeAll();
        subPanel.removeAll();
        frame.add(pTurnField);
        frame.add(p1MoneyField);
        frame.add(p2MoneyField);
        frame.add(p1StatsArea);
        frame.add(p2StatsArea);
        frame.add(p1CountryDropdown);
        frame.add(p2CountryDropdown);
        frame.add(p1MapArea);
        frame.add(p2MapArea);
        frame.add(buyCountriesButton);
        frame.add(upgradeButton);
        frame.add(eventManagerButton);
        frame.add(subPanel);
        subPanel.add(backButton);
        subPanel.add(finishTurnButton);
        
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


    public void updateCountryDropdowns() {
        game.currentPlayer.werte[1][0] = 1;
        game.currentPlayer.werte[2][0] = 1;
        game.currentPlayer.werte[3][0] = 1;
        game.currentPlayer.werte[1][2] = 4;
        // Remove or comment out the line causing the issue
        // game.currentPlayer.werte[8][0] = 1;

        p1CountryDropdown.removeAllItems();
        p2CountryDropdown.removeAllItems();

        for (int i = 0; i < game.p1.werte.length; i++) {
            if (game.p1.werte[i][0] == 1) {
                if (i < CountryLibrary.countryNames.length) {
                    p1CountryDropdown.addItem(CountryLibrary.countryNames[i]);
                } else {
                    p1CountryDropdown.addItem("Landname nicht hinterlegt: " + i);
                }
            }
        }

        for (int i = 0; i < game.p2.werte.length; i++) {
            if (game.p2.werte[i][0] == 1) {
                p2CountryDropdown.addItem(CountryLibrary.countryNames[i]);
            }
        }
    }


    private void updateSubButtons() {
        int ownedCountriesCount = 0;
        for (int i = 0; i < game.currentPlayer.werte.length; i++) {
            if (game.currentPlayer.werte[i][0] == 1) {
                ownedCountriesCount++;
            }
        }

        subButtons = new JButton[ownedCountriesCount];
        int buttonIndex = 0;
        for (int i = 0; i < game.currentPlayer.werte.length; i++) {
            if (game.currentPlayer.werte[i][0] == 1) {
                String countryName = (i < CountryLibrary.countryNames.length) ? CountryLibrary.countryNames[i] : "Landname nicht hinterlegt: " + i;
                subButtons[buttonIndex] = new JButton(countryName);
                subButtons[buttonIndex].setBounds(20 + (buttonIndex * 160), 600, 150, 30); // Adjust the position and size as needed
                subPanel.add(subButtons[buttonIndex]);
                buttonIndex++;
            }
        }
        frame.add(subPanel);
    }
}






