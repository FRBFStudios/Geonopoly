package com.geoproject.gui;

//GUI-Klasse.
//Authors: Theodor, Timo
//Version: 28/01/2025

//Imports//EVENTS BLEIBEN DRAUßEN
/*TO DO
 * - ------------------Dropdown unten hinzufügen (Detailed Info)
 * - ------------------Alles kommentieren und damit strukturieren
 * - ------------------Oben mitte reworken
 * - ------------------Alles neu zentrieren (weil es jetzt fullscreen ist)
 * - ------------------UI-Elemente müssen noch nicht funktionieren!!!
 * - aufteilung neu probieren, main buttons
 * 
 * 
  //theo: 
   - borders fertig machen,
   - multiplikatoren für länder stats hizufügen
   - map skizze schicken

*/

import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import com.geoproject.Game;
import com.geoproject.libraries.*;
import com.geoproject.Player;

//Klasse
public class UI extends JFrame implements ActionListener {
    JFrame frame;
    
    JLabel p1MapArea, p2MapArea;
    JTextField pTurnField, p1MoneyField, p2MoneyField;
    /* JTextArea p1StatsArea, p2StatsArea; */
    JTable p1StatsTable, p2StatsTable;
    JScrollPane p1StatsScrollPane, p2StatsScrollPane;

    JButton buyCountriesButton, upgradeButton, eventManagerButton;
    JPanel subPanel;
    JPanel subSubPanel;
    JButton finishTurnButton;
    
    JButton[] subButtons1, subButtons2, subSubButtons2[], subButtons3, subSubButtons3[];
    JButton[] buttons;

    Game game = new Game();
    
    JTextField searchBar;
    JTable searchResultsTable;
    JScrollPane searchResultsScrollPanel;

    //Konstruktor
    public UI() {
        createNewUI();
    }

    //Erstellt eine neue GUI
    private void createNewUI() {
        //Optimieren und kommentieren!!!!!!!!
        //oder zeile 99 scroll leayout nutzen
        //benennung der buttons klären(allgemeines konzept)
        //überhaupt schlau, die UI so zu machen, und nicht zb droppdown, wo ein land auswählen und dann die werte angezeigt bekommt oder man es kaufen kann
        //über umsetzung von eventklasse?? (oder wie sonnst die unterschiedlichen actions speichern? oder einfach array dass für jede mgl sache ein obj. hat) sprechen
        //über kaufbarkeit und anzahl und verkaufbarkeit von events sprechen
        
        
        //Alle Elemente des Fensters werden initialisiert
        
        //Fenster wird erstellt
        frame = new JFrame("Geonopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1600, 940);
        
        //Fenster wird automatisch auf Fullscreen gesetzt, Layout muss noch angepasst werden
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        //bitte so lasssen, sonnst verschwindel manche elemente
        frame.setSize(1920, 1040);
        //frame.setLocationRelativeTo(null);

        //bitte weglassen, worgt nur für porbleme wenn auf anderen monitoren geöffnet usw.
        /*frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });*/

        //Zeigt den Spieler an, der am Zug ist
        pTurnField = new JTextField("Player -'s turn");
        pTurnField.setBounds(10, 10, 100, 30);
        pTurnField.setEditable(false);

        /*//TextAreas für die Stats beider Spieler
        p1StatsArea = new JTextArea("Property (P1): -");
        p1StatsArea.setBounds(10, 200, 945, 120);
        p1StatsArea.setEditable(false);
        p1StatsArea.setLineWrap(true);
        p1StatsArea.setWrapStyleWord(true);
        
        p2StatsArea = new JTextArea("Property (P2): -");
        p2StatsArea.setBounds(965, 200, 945, 120);
        p2StatsArea.setEditable(false);
        p2StatsArea.setLineWrap(true);
        p2StatsArea.setWrapStyleWord(true);
         */

        // Initialize tables for player stats
        p1StatsTable = new JTable();
        p1StatsTable.setShowGrid(false);
        p1StatsTable.setIntercellSpacing(new Dimension(0, 0));
        p1StatsTable.getTableHeader().setUI(null);
        p1StatsTable.setBackground(Color.WHITE);
        p1StatsScrollPane = new JScrollPane(p1StatsTable);
        p1StatsScrollPane.setBounds(120, 200, 815, 120);
        p1StatsScrollPane.getViewport().setBackground(Color.WHITE);
        
        p2StatsTable = new JTable();
        p2StatsTable.setShowGrid(false);
        p2StatsTable.setIntercellSpacing(new Dimension(0, 0));
        p2StatsTable.getTableHeader().setUI(null);
        p2StatsTable.setBackground(Color.WHITE);
        p2StatsScrollPane = new JScrollPane(p2StatsTable);
        p2StatsScrollPane.setBounds(965, 200, 815, 120);
        p2StatsScrollPane.getViewport().setBackground(Color.WHITE);
        
        //TextField für den Kontostand beider Spieler
        p1MoneyField = new JTextField("Money (P1): ----");
        p1MoneyField.setBounds(1795, 10, 115, 30);
        p1MoneyField.setEditable(false);
        
        p2MoneyField = new JTextField("Money (P2): ----");
        p2MoneyField.setBounds(1795, 50, 115, 30);
        p2MoneyField.setEditable(false);

        //WTF
        p1MapArea = new JLabel("Hier Platz für Karte der besitzten länder(P1)");
        p1MapArea.setBounds(380, 70, 660, 30);
        
        p2MapArea = new JLabel("Hier Platz für Karte der besitzten länder(P2)");
        p2MapArea.setBounds(1050, 70, 660, 30);

        //WTF
        Font buttonFont = new Font("Arial", Font.CENTER_BASELINE, 15);

        //Du musst mir mal erklären, wie deine Submenüs funktionieren
        buyCountriesButton = new JButton("buy countries");
        buyCountriesButton.setBounds(660, 350, 180, 50);
        buyCountriesButton.setFont(buttonFont);
        
        upgradeButton = new JButton("upgrade economy");
        upgradeButton.setBounds(860, 350, 180, 50);
        upgradeButton.setFont(buttonFont);
        
        eventManagerButton = new JButton("manage events");
        eventManagerButton.setBounds(1060, 350, 180, 50);
        eventManagerButton.setFont(buttonFont);
        
        finishTurnButton = new JButton("finish turn");
        finishTurnButton.setBounds(1600, 370, 100, 30);

        subPanel = new JPanel(new FlowLayout());
        subPanel.setBounds(260, 450, 1400, 120);
        
        subSubPanel = new JPanel(new FlowLayout());
        subSubPanel.setBounds(260, 580, 1400, 120);

        buttons = new JButton[] {buyCountriesButton, upgradeButton, eventManagerButton, finishTurnButton};

        for (JButton button : buttons) {
            button.addActionListener(this);
            button.setEnabled(true);
        }

        // Initialize search bar
        searchBar = new JTextField("Search...");
        searchBar.setBounds(/*(frame.getWidth() - 400)*/800, 960, 360, 30);
        searchBar.setForeground(Color.GRAY);
        searchBar.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {         //code, der ausgeführt wird, wenn der courser in der searchbar ist
                searchBar.setText("");
                searchBar.setForeground(Color.BLACK);
                searchResultsScrollPanel.getViewport().setBackground(Color.WHITE);
                searchResultsTable.setBackground(Color.WHITE);
            }

            @Override
            public void focusLost(FocusEvent e) {       //codee, der ausgeführt wird, wenn man etwas anderes anklickt
                if (searchBar.getText().isEmpty()) {
                    searchBar.setForeground(Color.GRAY);
                    searchBar.setText("Search...");
                }
                searchResultsScrollPanel.getViewport().setBackground(frame.getBackground());
                searchResultsTable.setBackground(frame.getBackground());

            }
        });
        searchBar.getDocument().addDocumentListener(new DocumentListener() {    //code, der ausgeführt wird, wenn sich der inhalt der searchbar ändert
            public void changedUpdate(DocumentEvent e) {
                updateSearchResults();
            }
            public void removeUpdate(DocumentEvent e) {
                updateSearchResults();
            }
            public void insertUpdate(DocumentEvent e) {
                updateSearchResults();
            }
        });

        // Initialize search results table
        searchResultsTable = new JTable();
        searchResultsTable.setShowGrid(false);
        searchResultsTable.setIntercellSpacing(new Dimension(0, 0));
        searchResultsTable.getTableHeader().setUI(null);
        searchResultsTable.setBackground(Color.WHITE);
        searchResultsScrollPanel = new JScrollPane(searchResultsTable);
        searchResultsScrollPanel.setBounds(650, 855, 620, 100);
        searchResultsScrollPanel.getViewport().setBackground(frame.getBackground());

        frame.getContentPane().removeAll();
        subPanel.removeAll();
        subSubPanel.removeAll();

        testValues();                                                                   //for tests
        UIupdate();

        frame.add(searchBar);
        frame.add(searchResultsScrollPanel);
        frame.add(pTurnField);
        frame.add(p1MoneyField);
        frame.add(p2MoneyField);
        frame.add(p1StatsScrollPane);
        frame.add(p2StatsScrollPane);
        /*frame.add(p1StatsArea);
        frame.add(p2StatsArea); */
        frame.add(p1MapArea);
        frame.add(p2MapArea);
        frame.add(buyCountriesButton);
        frame.add(upgradeButton);
        frame.add(eventManagerButton);
        frame.add(subPanel);
        frame.add(subSubPanel);
        frame.add(finishTurnButton);
        frame.setVisible(true);
        subSubButtons2 = new JButton[CountryLibrary.countryNames.length][];
        subSubButtons3 = new JButton[EventLibrary.eventNames.length][];
    }

    //methode zu ausführen von aktionen bei buttonklick
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buyCountriesButton) {
            showMainMenu();
            updateSubPanel(1);
            System.out.println("buycountries Button pressed");
        } else if (e.getSource() == upgradeButton) {
            showMainMenu();
            updateSubPanel(2);
            System.out.println("upgrade Button pressed");
        } else if (e.getSource() == eventManagerButton) {
            showMainMenu();
            updateSubPanel(3);
            System.out.println("eventManager pressed");
        } else if (e.getSource() == finishTurnButton) {
            System.out.println("finish turn pressed");
            game.switchPlayer();
            showMainMenu();
        } else if (e.getSource() == searchBar) {
            String query = searchBar.getText().toLowerCase();
            StringBuilder results = new StringBuilder("<html>");
            
            for (String countryName : CountryLibrary.countryNames) {
                if (countryName.toLowerCase().contains(query)) {
                    results.append(countryName).append("<br>");
                }
            }
            
            for (String eventName : EventLibrary.eventNames) {
                if (eventName.toLowerCase().contains(query)) {
                    results.append(eventName).append("<br>");
                }
            }
            
        } else {
            if (subButtons1 != null) {
                for (int i = 0; i < subButtons1.length; i++) {
                    if (e.getSource() == subButtons1[i]) {
                        System.out.println("subButton1 pressed: " + i);
                        break;
                    }
                }
            }
            if (subButtons2 != null) {
                for (int i = 0; i < subButtons2.length; i++) {
                    if (e.getSource() == subButtons2[i]) {
                        System.out.println("subButton2 pressed: " + i);
                        updateSubSubPanel(i, 2);
                        break;
                    }
                }
            }
            if (subButtons3 != null) {
                for (int i = 0; i < subButtons3.length; i++) {
                    if (e.getSource() == subButtons3[i]) {
                        System.out.println("subButton3 pressed: " + i);
                        updateSubSubPanel(i, 3);
                        break;
                    }
                }
            }
            if (subSubButtons2 != null) {
                for (int i = 0; i < subSubButtons2.length; i++) {
                    if (subSubButtons2[i] != null) {
                        for (int j = 0; j < subSubButtons2[i].length; j++) {
                            if (e.getSource() == subSubButtons2[i][j]) {
                                System.out.println("subSubButton2 pressed: " + i + ", " + j);
                                break;
                            }
                        }
                    }
                }
            }
            if (subSubButtons3 != null) {
                for (int i = 0; i < subSubButtons3.length; i++) {
                    if (subSubButtons3[i] != null) {
                        for (int j = 0; j < subSubButtons3[i].length; j++) {
                            if (e.getSource() == subSubButtons3[i][j]) {
                                System.out.println("subSubButton3 pressed: " + i + ", " + j);
                                break;
                            }
                        }
                    }
                }
            }

        }
        UIupdate();
    }

    //zeigt ein aufgeräumtes Hauptmenü an (ohne Submenüs)
    private void showMainMenu() {
        UIupdate();
        subPanel.removeAll();
        subPanel.revalidate();
        subPanel.repaint();
        subSubPanel.removeAll();
        subSubPanel.revalidate();
        subSubPanel.repaint();
    }

    //Aktualisiert die GUI
    void UIupdate() {
        /*p1StatsArea.setText(game.p1.getLevels());
        p2StatsArea.setText(game.p2.getLevels()); */
        p1MoneyField.setText("Money (P1): " + game.p1.playerMoney);
        p2MoneyField.setText("Money (P2): " + game.p2.playerMoney);
        pTurnField.setText("Player " + game.currentPlayerValue + "'s turn");
        updateStatsTable(p1StatsTable, game.p1);
        updateStatsTable(p2StatsTable, game.p2);
        updateSearchResults();
    }

    //zeigt die buttons für das subpanel an, je nachdem, welcher hauptbuttons gedrückt wurde, im array subbuttons1-3, um nachher zu wissen, welcher gedrückt wurde
    void updateSubPanel(int buttonPressed) {
        subPanel.removeAll();
        switch (buttonPressed) {
            case 1 -> {
                subButtons1 = new JButton[CountryLibrary.countryNames.length];
                for (int i = 0; i < CountryLibrary.countryNames.length; i++) {
                    String countryName = (i < CountryLibrary.countryNames.length) ? CountryLibrary.countryNames[i] : "no countryname: " + i;
                    subButtons1[i] = new JButton(countryName);
                    subButtons1[i].addActionListener(this);
                    subPanel.add(subButtons1[i]);
                    if (game.currentPlayer.countryValues[i][0] == 1) {
                        subButtons1[i].setEnabled(false);
                    
                    } else {
                        subButtons1[i].setEnabled(true);
                    }
                }
            }
            case 2 -> {
                subButtons2 = new JButton[CountryLibrary.countryNames.length];
                for (int i = 0; i < CountryLibrary.countryNames.length; i++) {
                    String countryName = (i < CountryLibrary.countryNames.length) ? CountryLibrary.countryNames[i] : "no countryname: " + i;
                    subButtons2[i] = new JButton(countryName);
                    subButtons2[i].addActionListener(this);
                    subPanel.add(subButtons2[i]);
                    if (game.currentPlayer.countryValues[i][0] == 1) {
                        subButtons2[i].setEnabled(true);
                    } else {
                        subButtons2[i].setEnabled(false);
                    }
                }
            }
            case 3 -> {
                subButtons3 = new JButton[EventLibrary.eventNames.length];
                for (int i = 0; i < EventLibrary.eventNames.length; i++) {
                    String eventName = (i < EventLibrary.eventNames.length) ? EventLibrary.eventNames[i] + ": " + game.currentPlayer.eventValues[i][0] : "no eventname: " + i;
                    subButtons3[i] = new JButton(eventName);
                    subButtons3[i].addActionListener(this);
                    subPanel.add(subButtons3[i]);
                    subButtons3[i].setEnabled(true);
                }
            }
            default -> {
            }
        }
        subPanel.revalidate();
        subPanel.repaint();
        
        //Möchte ich mir für späteren anwendungsfall bitte merken
        /*
        case 2 -> {
            int ownedCountriesCount = 0;
            for (int i = 0; i < game.currentPlayer.countryValues.length; i++) {
                if (game.currentPlayer.countryValues[i][0] == 1) {
                    ownedCountriesCount++;
                }
            }

            subButtons = new JButton[CountryLibrary.StatNames.length];
            for (int i = 0; i < CountryLibrary.StatNames.length; i++) {
                subButtons[i] = new JButton(CountryLibrary.StatNames[i][0]);
                subPanel.add(subButtons[i]);
            }
        }*/
    }

    //zeigt die buttons für das subsubpanel an, je nachdem, welcher hauptbuttons gedrückt wurde, im array subsubbuttons2-3, um nachher zu wissen, welcher gedrückt wurde
    void updateSubSubPanel(int buttonPressed, int MainButtonNumber) {
        subSubPanel.removeAll();
        if (MainButtonNumber == 2) {    
            subSubButtons2[buttonPressed] = new JButton[CountryLibrary.statNames.length];
            for (int i = 0; i < CountryLibrary.statNames.length; i++) {
                subSubButtons2[buttonPressed][i] = new JButton(CountryLibrary.statNames[i][0] + " = " + game.currentPlayer.countryValues[buttonPressed][i + 1]);
                subSubButtons2[buttonPressed][i].addActionListener(this);
                subSubPanel.add(subSubButtons2[buttonPressed][i]);
            }
        } else if (MainButtonNumber == 3) {
            subSubButtons3[buttonPressed] = new JButton[EventLibrary.statNames.length + 2];
            int k = 0;
            for (k = 0; k < EventLibrary.statNames.length; k++) {
                subSubButtons3[buttonPressed][k] = new JButton(EventLibrary.statNames[k] + " = " + game.currentPlayer.eventValues[buttonPressed][k]);
                subSubButtons3[buttonPressed][k].addActionListener(this);
                subSubPanel.add(subSubButtons3[buttonPressed][k]);
            }
            subSubButtons3[buttonPressed][k] = new JButton("buy");
            subSubButtons3[buttonPressed][k].addActionListener(this);
            subSubPanel.add(subSubButtons3[buttonPressed][k]);
            k++;
            subSubButtons3[buttonPressed][k] = new JButton("sell");
            subSubButtons3[buttonPressed][k].addActionListener(this);
            subSubPanel.add(subSubButtons3[buttonPressed][k]);
        }
        subSubPanel.revalidate();
        subSubPanel.repaint();
    }

    //Aktualisiert die Stats-Tabelle(früher p1StatsArea)
    void updateStatsTable(JTable table, Player player) {
        String[] columnNames = new String[CountryLibrary.statNames.length + 1];
        columnNames[0] = "Country";
        for (int i = 0; i < CountryLibrary.statNames.length; i++) {
            columnNames[i + 1] = CountryLibrary.statNames[i][1];
        }

        DefaultTableModel model = new DefaultTableModel(0, columnNames.length);
        for (int i = 0; i < player.countryValues.length; i++) {
            if (player.countryValues[i][0] == 1) {
                Object[] row = new Object[columnNames.length];
                row[0] = (i < CountryLibrary.countryNames.length) ? CountryLibrary.countryNames[i] : "no countryname: " + i;
                for (int j = 1; j < row.length; j++) {
                    row[j] = CountryLibrary.statNames[j - 1][1] + ": " + player.countryValues[i][j];
                }
                model.addRow(row);
            }
        }
        table.setModel(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
    }

    //Aktualisiert die Suchergebnisse
    private void updateSearchResults() {
        String query = searchBar.getText().toLowerCase();

        String[] columnNames = new String[CountryLibrary.statNames.length + 2];
        columnNames[0] = "Country";
        columnNames[1] = "Price";
        for (int i = 0; i < CountryLibrary.statNames.length; i++) {
            columnNames[i + 2] = CountryLibrary.statNames[i][1];
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);//erstellt eine tabelle mit dem richtigen formfaktor

        for (int i = 0; i < CountryLibrary.countryNames.length; i++) {
            String countryName = CountryLibrary.countryNames[i];
            if (countryName.toLowerCase().contains(query)) {
                Object[] row = new Object[columnNames.length];
                row[0] = countryName;
                row[1] = "Price: " + CountryLibrary.countryPrice[i];
                for (int j = 2; j < row.length; j++) {
                    row[j] = CountryLibrary.statNames[j - 2][1] + ": " + CountryLibrary.statsMultiplier[i][j - 2];
                }
                model.addRow(row);
            }
        }

        for (String eventName : EventLibrary.eventNames) {
            if (eventName.toLowerCase().contains(query)) {
                model.addRow(new Object[]{eventName});
            }
        }

        searchResultsTable.setModel(model);
        searchResultsTable.getColumnModel().getColumn(0).setPreferredWidth(230);
        searchResultsTable.getColumnModel().getColumn(1).setPreferredWidth(120);
    }

    //Wir müssen das ASAP hier wegkriegen
    public void testValues() {
        game.currentPlayer.countryValues[0][0] = 1;
        game.currentPlayer.countryValues[1][0] = 1;
        //game.currentPlayer.countryValues[2][0] = 1;
        game.currentPlayer.countryValues[3][0] = 1;
        game.currentPlayer.countryValues[1][2] = 4;
        game.currentPlayer.countryValues[8][0] = 1;
        //game.currentPlayer.countryValues[4][0] = 1;
        game.currentPlayer.countryValues[5][0] = 1;
        game.currentPlayer.countryValues[6][0] = 1;
        game.currentPlayer.countryValues[7][0] = 1;
        game.currentPlayer.countryValues[1][1] = 2;
        game.currentPlayer.countryValues[2][1] = 3;
        game.currentPlayer.countryValues[3][6] = 4;
        game.currentPlayer.countryValues[4][2] = 5;
        game.currentPlayer.countryValues[5][2] = 6;
        game.currentPlayer.countryValues[6][3] = 7;
        game.currentPlayer.countryValues[7][7] = 8;
        game.currentPlayer.countryValues[1][1] = 12;
        game.currentPlayer.countryValues[2][2] = 13;
        game.currentPlayer.countryValues[3][3] = 14;
        game.currentPlayer.countryValues[4][4] = 15;
        game.currentPlayer.countryValues[5][5] = 16;
        game.currentPlayer.countryValues[6][1] = 17;
        game.currentPlayer.countryValues[7][2] = 18;
        game.currentPlayer.countryValues[8][3] = 19;
        game.currentPlayer.countryValues[9][0] = 1;
        game.currentPlayer.countryValues[10][0] = 1;
        game.currentPlayer.countryValues[12][0] = 1;
        game.currentPlayer.countryValues[13][5] = 6;
        game.currentPlayer.countryValues[9][0] = 7;
        game.currentPlayer.countryValues[8][0] = 1;
        game.currentPlayer.countryValues[14][0] = 1;
        game.currentPlayer.countryValues[15][0] = 1;
        game.currentPlayer.countryValues[16][0] = 1;
        game.currentPlayer.countryValues[17][0] = 1;

        game.currentPlayer.eventValues[0][0] = 5;
        game.currentPlayer.eventValues[1][0] = 1;
        //game.currentPlayer.eventValues[2][0] = 1;
        game.currentPlayer.eventValues[3][0] = 1;
        game.currentPlayer.eventValues[1][1] = 4;
        game.currentPlayer.eventValues[8][0] = 1;
        //game.currentPlayer.eventValues[4][0] = 1;
        game.currentPlayer.eventValues[5][0] = 1;
        game.currentPlayer.eventValues[6][0] = 1;
        game.currentPlayer.eventValues[7][0] = 1;
        game.currentPlayer.eventValues[1][1] = 2;
        game.currentPlayer.eventValues[2][1] = 3;
        game.currentPlayer.eventValues[3][1] = 4;
        game.currentPlayer.eventValues[4][1] = 5;
        game.currentPlayer.eventValues[5][1] = 6;
        game.currentPlayer.eventValues[6][1] = 7;
        game.currentPlayer.eventValues[7][1] = 8;
        game.currentPlayer.eventValues[1][1] = 12;
        game.currentPlayer.eventValues[2][1] = 13;
        game.currentPlayer.eventValues[3][0] = 14;
        game.currentPlayer.eventValues[4][0] = 15;
        game.currentPlayer.eventValues[5][0] = 16;
        game.currentPlayer.eventValues[6][1] = 17;
        game.currentPlayer.eventValues[7][1] = 18;
    }
}