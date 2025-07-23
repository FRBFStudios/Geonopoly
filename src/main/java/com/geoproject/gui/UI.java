package com.geoproject.gui;

// Note to @TP-xx:
// Translate these To Dos and remove the ones that are done
// Remove everything that is commented out that you won't add back in
// Remove most comments, make the code readable enough that as little as possible are needed
// Split up functions so every function is as specialized as possible & rename them so every function name describes EVERYTHING it does
// Get rid of all the unused classes and other things that cause warnings when pushing (there are also a lot in MapPanel)

//Imports / EVENTS BLEIBEN DRAUßEN
/* TO DO
 * - oben mitte reworken
 * - aufteilung neu probieren, main buttons
 *  - droppdown, wo ein land auswählen und dann die werte angezeigt bekommt oder man es kaufen kann
 *  - so machen, dass auf map.java zugegriffen wird, statt nacher alles zu kopieren
 *  - evtl umsetzen, dass searchresults nur angezeigt wird, wenn was eingegeben, und dann popt es über die subpanels drüber. UM PLATZ ZU SPAREN
 *  - lieber das array in map.java in countrylibrary packen
 *  - perfekter befehl: mache alles proportional 1/4 kleiner und ändere die position der elemente entsprechend, damit das fenster genauso wie vorher aussieht aber 1/4 kleiner
 *  - pfeile in map hinzufügen (auf "(hier)" achten)
 *  - WICHTIG evtl ganz auf pfeile verzichten??? WICHTIG
 *  - evtl schriftgrößen von mapcountries anpassen
 *  - z. 534  industryProfitMultipliers wenn alles fertig wieder hinzugefügt
 *  - polygon updaten damit werte übergeben werden können
 *
 */

// mappanel: clickedcountries show neighbors
// mappanel: pfeile
// übersicht ob country lukrativ (z.b. grün vs rot)
//kosten und ertrag von stats
//map für stat upgrades nutzen
// sobald countryValues[... immer "+ 1"

// ONCE EVENTS ARE ADDED, SEARCH FOR "//if adding events,"


import com.geoproject.Game;
import com.geoproject.LogHandler;
import com.geoproject.Player;
import com.geoproject.libraries.CountryLibrary;
import com.geoproject.libraries.EventLibrary;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.logging.Logger;

//Klasse
public class UI extends JFrame implements ActionListener {
    // Connects the class to the logger, don't remove!
    private static final Logger logger = LogHandler.getLogger();

    JFrame frame;

    JLabel p1MapPic, p2MapPic;
    MapPanel mapPanel1, mapPanel2;

    JTextField pTurnField, p1MoneyField, p2MoneyField;

    /*
    JComboBox<String> p1DisplayCategoryDropdown, p2DisplayCategoryDropdown;
    JTextArea p1StatsArea, p2StatsArea;
    */

    JTable p1StatsTable, p2StatsTable;
    JScrollPane p1StatsScrollPane, p2StatsScrollPane;

    JButton buyCountriesButton, upgradeButton, eventManagerButton;
    JPanel subPanel;
    JPanel subSubPanel;
    JButton finishTurnButton;

    JButton[] subButtons1;
    JButton[] subButtons2;
    JButton[][] subSubButtons2;
    JButton[] subButtons3;
    JButton[][] subSubButtons3;
    JButton[] buttons;

    Game game = new Game();


    JButton mapweg, mapweg2;


    JTextField searchBar;
    JTable searchResultsTable;
    JScrollPane searchResultsScrollPanel;

    boolean debug = false;

    //Konstruktor
    public UI() {
        createNewUI();
    }

    //Erstellt eine neue GUI
    private void createNewUI() {
        /*
        Optimieren und kommentieren!!!!!!!!
        oder zeile 99 scroll leayout nutzen
        benennung der buttons klären(allgemeines konzept)
        überhaupt schlau, die UI so zu machen, und nicht zb droppdown, wo ein land auswählen und dann die werte angezeigt bekommt oder man es kaufen kann
        über umsetzung von eventklasse?? (oder wie sonnst die unterschiedlichen actions speichern? oder einfach array dass für jede mgl sache ein obj. hat) sprechen
        */


        //Alle Elemente des Fensters werden initialisiert

        //Fenster wird erstellt
        logger.info("Creating new Geonopoly JFrame");
        frame = new JFrame("Geonopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //Fenster wird automatisch auf Fullscreen gesetzt, Layout muss noch angepasst werden
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //BITTE SO LASSEN, sonst verschwinden manche elemente
        frame.setSize(1920, 1040);
        //frame.setLocationRelativeTo(null);

        //Erst mal weglassen, sorgt nur für probleme wenn auf anderen monitoren geöffnet usw.
        /*
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {frame.setExtendedState(JFrame.MAXIMIZED_BOTH);}
        });
        */

        //Zeigt den Spieler an, der am Zug ist
        logger.info("Creating pTurnField");
        pTurnField = new JTextField("Player -'s turn");
        pTurnField.setBounds(10, 10, 100, 30);
        pTurnField.setEditable(false);

        /*
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

        //TextField für den Kontostand beider Spieler
        logger.info("Creating p1MoneyField");
        p1MoneyField = new JTextField("Money P1: ----");
        p1MoneyField.setBounds(1790, 10, 110, 30);
        p1MoneyField.setEditable(false);

        logger.info("Creating p2MoneyField");
        p2MoneyField = new JTextField("Money P2: ----");
        p2MoneyField.setBounds(1790, 50, 110, 30);
        p2MoneyField.setEditable(false);

        /*
        p1DisplayCategoryDropdown = new JComboBox<>();
        p1DisplayCategoryDropdown.setBounds(120, 270, 660, 30);
        p2DisplayCategoryDropdown = new JComboBox<>();
        p2DisplayCategoryDropdown.setBounds(965, 270, 660, 30);
        */

        if (debug) {
            logger.info("Debug mode: Active");

            p1MapPic = new JLabel(new ImageIcon("src/main/java/com/geoproject/gui/map070225.jpg"));
            p1MapPic.setBounds(120, 5, 815, 425);
            p1MapPic.setIcon(new ImageIcon(new ImageIcon("src/main/java/com/geoproject/gui/map070225.jpg").getImage().getScaledInstance(-1, p1MapPic.getHeight(), Image.SCALE_SMOOTH)));

            p2MapPic = new JLabel(new ImageIcon("src/main/java/com/geoproject/gui/map070225.jpg"));
            p2MapPic.setBounds(965, 5, 815, 425);
            p2MapPic.setIcon(new ImageIcon(new ImageIcon("src/main/java/com/geoproject/gui/map070225.jpg").getImage().getScaledInstance(-1, p2MapPic.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            logger.info("Debug mode: Inactive");

            logger.info("Creating p1MapPic");
            p1MapPic = new JLabel();
            p1MapPic.setBounds(120, 5, 815, 425);
            p1MapPic.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

            logger.info("Creating p2MapPic");
            p2MapPic = new JLabel();
            p2MapPic.setBounds(965, 5, 815, 425);
            p2MapPic.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }

        logger.info("Creating mapPanel for Player 1");
        mapPanel1 = new MapPanel(buttons, debug);
        mapPanel1.setBounds(120, 5, 815, 425);
        for (int i = 0; i < mapPanel1.mapButtons.length; i++) {
            mapPanel1.mapButtons[i].addActionListener(this);
            //mapPanel1.mapButtons[i].add
        }

        logger.info("Creating mapPanel for Player 2");
        mapPanel2 = new MapPanel(buttons, debug);
        mapPanel2.setBounds(970, 5, 815, 425);
        for (int i = 0; i < mapPanel2.mapButtons.length; i++) {
            mapPanel2.mapButtons[i].addActionListener(this);
        }

        if (debug) {
            mapweg = new JButton("SHOW");
            mapweg.setBounds(10, 50, 80, 40);
            mapweg.addActionListener(this);
            mapweg.setVisible(true);//auch bei void achtionPerformed & beim frame.add() zeug & bei deklarationen

            mapweg2 = new JButton("HIDE");
            mapweg2.setBounds(10, 100, 80, 40);
            mapweg2.addActionListener(this);
            mapweg2.setVisible(true);
        }


        // Initialize tables for player stats
        logger.info("Creating and initializing p1StatsTable");
        p1StatsTable = new JTable();
        p1StatsTable.setShowGrid(false);
        p1StatsTable.setIntercellSpacing(new Dimension(0, 0));
        p1StatsTable.getTableHeader().setUI(null);
        p1StatsTable.setBackground(Color.WHITE);
        p1StatsScrollPane = new JScrollPane(p1StatsTable);
        p1StatsScrollPane.setBounds(120, 435, 815, 120);
        p1StatsScrollPane.getViewport().setBackground(Color.WHITE);

        logger.info("Creating and initializing p2StatsTable");
        p2StatsTable = new JTable();
        p2StatsTable.setShowGrid(false);
        p2StatsTable.setIntercellSpacing(new Dimension(0, 0));
        p2StatsTable.getTableHeader().setUI(null);
        p2StatsTable.setBackground(Color.WHITE);
        p2StatsScrollPane = new JScrollPane(p2StatsTable);
        p2StatsScrollPane.setBounds(965, 435, 815, 120);
        p2StatsScrollPane.getViewport().setBackground(Color.WHITE);

        logger.info("Setting button font");
        Font buttonFont = new Font("Arial", Font.CENTER_BASELINE, 14);

        logger.info("Creating buyCountriesButton");
        buyCountriesButton = new JButton("Buy countries");
        buyCountriesButton.setBounds(660, 570, 180, 50);
        buyCountriesButton.setFont(buttonFont);

        logger.info("Creating upgradeButton");
        upgradeButton = new JButton("Upgrade country economies");
        upgradeButton.setBounds(860, 570, 180, 50);
        upgradeButton.setFont(buttonFont);

        logger.info("Creating eventManagerButton");
        eventManagerButton = new JButton("Manage events");
        eventManagerButton.setBounds(1060, 570, 180, 50);
        eventManagerButton.setFont(buttonFont);

        logger.info("Creating finishTurnButton");
        finishTurnButton = new JButton("Finish turn");
        finishTurnButton.setBounds(1600, 570, 100, 30);

        logger.info("Creating subPanel");
        subPanel = new JPanel(new FlowLayout());
        subPanel.setBounds(150, 630, 1620, 180);

        logger.info("Creating subSubPanel");
        subSubPanel = new JPanel(new FlowLayout());
        subSubPanel.setBounds(260, 800, 1400, 50);

        logger.info("Creating buttons array");
        buttons = new JButton[]{buyCountriesButton, upgradeButton, eventManagerButton, finishTurnButton};

        for (JButton button : buttons) {
            logger.info("Adding action listener to " + button.getName());
            button.addActionListener(this);

            logger.info("Enabling " + button.getName());
            button.setEnabled(true);
        }

        // Initialize search bar
        logger.info("Creating searchBar");
        searchBar = new JTextField("Search...");
        searchBar.setBounds(/*(frame.getWidth() - 400)*/750, 965, 400, 30);
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
        logger.info("Creating searchResultsTable");
        searchResultsTable = new JTable();
        searchResultsTable.setShowGrid(false);
        searchResultsTable.setIntercellSpacing(new Dimension(0, 0));
        searchResultsTable.getTableHeader().setUI(null);
        searchResultsTable.setBackground(Color.WHITE);
        searchResultsScrollPanel = new JScrollPane(searchResultsTable);
        searchResultsScrollPanel.setBounds(580, 860, 740, 100);
        searchResultsScrollPanel.getViewport().setBackground(frame.getBackground());

        frame.getContentPane().removeAll();
        subPanel.removeAll();
        subSubPanel.removeAll();

        logger.info("Adding elements to frame");
        frame.add(pTurnField);
        frame.add(p1MoneyField);
        frame.add(p2MoneyField);
        frame.add(mapPanel1);
        frame.add(mapPanel2);
        frame.add(p1MapPic);
        frame.add(p2MapPic);

        if (debug) {
            frame.add(mapweg);
            frame.add(mapweg2);
        }

        frame.add(p1StatsScrollPane);
        frame.add(p2StatsScrollPane);

        /*
        frame.add(p1StatsArea);
        frame.add(p2StatsArea);
        frame.add(p1DisplayCategoryDropdown);
        frame.add(p2DisplayCategoryDropdown);
        */

        frame.add(buyCountriesButton);
        frame.add(upgradeButton);
        frame.add(eventManagerButton);
        frame.add(finishTurnButton);
        frame.add(subPanel);
        frame.add(subSubPanel);
        frame.add(searchBar);
        frame.add(searchResultsScrollPanel);
        //MapPanel mapPanel1 = new MapPanel(buttons);

        frame.setVisible(true);
        subSubButtons2 = new JButton[CountryLibrary.countryNames.length][];
        subSubButtons3 = new JButton[EventLibrary.eventNames.length][];

        if (debug) {p2MapPic.setVisible(false);}
        UIupdate();
    }

    // Method is run at every button press
    @Override
    public void actionPerformed(ActionEvent e) {
        logger.info("A button was pressed");

        if (e.getSource() == buyCountriesButton) {
            logger.info("buyCountriesButton pressed");
            showMainMenu();
            updateSubPanel(1);
        } 
        else if (e.getSource() == upgradeButton) {
            logger.info("upgradeButton pressed");
            showMainMenu();
            updateSubPanel(2);
        } 
        else if (e.getSource() == eventManagerButton) {
            logger.info("eventManagerButton pressed");
            showMainMenu();
            updateSubPanel(3);
        } 
        else if (e.getSource() == finishTurnButton) {
            logger.info("finishTurnButton pressed, finishing turn...");
            game.finishTurn();
            UIupdate();
            if (game.p1.playerMoney < 0) {
                logger.info("Player 1 has no money left, GAME OVER.");
                System.out.println("Player 1 has no money left, GAME OVER.");
                if(pleaseConfirm("Player 1 has no money left, GAME OVER. Close?")) {
                    logger.info("User confirmed to close the game.");
                    System.out.println("User confirmed to close the game.");
                    System.exit(0);
                } else {
                    logger.info("User cancelled closing the game.");
                    System.out.println("User cancelled closing the game.");
                    for (JButton button : buttons) {
                        button.setEnabled(false);
                    }
                    for (MapButton button : mapPanel1.mapButtons) {
                        button.setEnabled(false);
                    }
                    for (MapButton button : mapPanel2.mapButtons) {
                        button.setEnabled(false);
                    }
                }
            } 
            else if (game.p2.playerMoney < 0) {
                logger.info("Player 2 has no money left, GAME OVER.");
                System.out.println("Player 2 has no money left, GAME OVER.");
                if(pleaseConfirm("Player 1 has no money left, GAME OVER. Close?")) {
                    logger.info("User confirmed to close the game.");
                    System.out.println("User confirmed to close the game.");
                    System.exit(0);
                } else {
                    logger.info("User cancelled closing the game.");
                    System.out.println("User cancelled closing the game.");
                    for (JButton button : buttons) {
                        button.setEnabled(false);
                    }
                    for (MapButton button : mapPanel1.mapButtons) {
                        button.setEnabled(false);
                    }
                    for (MapButton button : mapPanel2.mapButtons) {
                        button.setEnabled(false);
                    }
                }
            }
            showMainMenu();
        } 
        else if (e.getSource() == searchBar) {
            logger.info("searchBar pressed");
        } 
        else if (e.getSource() == mapweg) {//for tests
            logger.info("mapweg pressed");
            mapPanel1.setVisible(true);
            for (MapButton button : mapPanel1.mapButtons) {
                button.setForeground(Color.BLACK);
            }
        } 
        else if (e.getSource() == mapweg2) {
            logger.info("mapweg2 pressed");
            mapPanel1.setVisible(false);
            for (MapButton button : mapPanel1.mapButtons) {
                button.setForeground(Color.BLACK);
            }
        } 
        else {
            if (subButtons1 != null) {
                for (int i = 0; i < subButtons1.length; i++) {
                    if (e.getSource() == subButtons1[i]) {
                        System.out.println("subButton1 pressed: " + i);
                        logger.info("subButton1 pressed: " + i);
                        // if (game.currentPlayer.neighborCountries[i] != 1) {
                        //     logger.info("Player failed to buy countryID " + i + ": Not a neighbor");
                        //     JOptionPane.showMessageDialog(frame, "You can't buy " + CountryLibrary.countryNames[i] + ", it's not your neighbor!");
                        //     return;
                        // }
                        // if (!game.canAfford(CountryLibrary.getCountryPrice(i))) {
                        //     logger.info("Player failed to buy countryID " + i + ": Can't afford");
                        //     JOptionPane.showMessageDialog(frame, "You can't afford this country!");
                        //     return;
                        // }
                        if (pleaseConfirm("Confirm purchase of " + CountryLibrary.countryNames[i] + " for " + CountryLibrary.getCountryPrice(i) + "$?")) {
                            String result = game.tryBuyingCountryAndReturnStatus(i);
                            if (result.equals("OK")) {
                                logger.info("Player " + game.currentPlayerValue + " successfully bought " + CountryLibrary.countryNames[i] + " for " + CountryLibrary.getCountryPrice(i) + "$");
                                JOptionPane.showMessageDialog(frame, "You bought " + CountryLibrary.countryNames[i] + " for " + CountryLibrary.getCountryPrice(i) + "$");
                            }
                            else {
                                logger.info("Player " + game.currentPlayerValue + " failed to buy  " + CountryLibrary.countryNames[i] + ": " + result);
                                JOptionPane.showMessageDialog(frame, "You couldn't buy " + CountryLibrary.countryNames[i] + ": " + result); 
                            }
                            updateSubPanel(1);
                        }
                        else {
                            logger.info("Player " + game.currentPlayerValue + " cancelled purchase of " + CountryLibrary.countryNames[i]);
                        }
                        break;
                    }
                }
            }

            if (subButtons2 != null) {
                for (int i = 0; i < subButtons2.length; i++) {
                    if (e.getSource() == subButtons2[i]) {
                        logger.info("subButton2 pressed: " + i);
                        updateSubSubPanel(i, 2);
                        break;
                    }
                }
            }

            if (subButtons3 != null) {
                for (int i = 0; i < subButtons3.length; i++) {
                    if (e.getSource() == subButtons3[i]) {
                        logger.info("subButton3 pressed: " + i);
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
                                logger.info("subSubButton2 pressed: " + i + ", " + j);
                                if (pleaseConfirm("Confirm upgrade of " + CountryLibrary.countryNames[i] + " - " + CountryLibrary.industryNames[j][0] + " for " + game.calculateIndustryUpgradeCost(i, j) + "$?")) {
                                    String result = game.tryUpgradingIndustryAndReturnStatus(i,j);
                                    if (result.equals("OK")) {
                                        logger.info("Player " + game.currentPlayerValue + " successfully upgraded " + CountryLibrary.countryNames[i] + " - " + CountryLibrary.industryNames[j][0] + " to level" + game.currentPlayer.countryValues[i][j + 1]);
                                        JOptionPane.showMessageDialog(frame, "You upgraded " + CountryLibrary.countryNames[i] + " - " + CountryLibrary.industryNames[j][0] + " to level " + game.currentPlayer.countryValues[i][j + 1]);
                                        
                                        
                                        // for (int k = 0; k < CountryLibrary.countryNames.length; k++) {
                                        //     System.out.print("Country: " + CountryLibrary.countryNames[k] + " - ");
                                        //     for (int l = 0; l < CountryLibrary.industryNames.length-1; l++) {
                                        //         System.out.print(CountryLibrary.industryNames[l][0] + ": ");
                                        //         System.out.print(CountryLibrary.getCountryIndustryCaps(k)[l] + ", ");
                                        //     }
                                        //     System.out.println(" ");
                                        // }
                                    
                                    
                                    }
                                    else {
                                        logger.info("Player " + game.currentPlayerValue + " failed to upgrade " + CountryLibrary.countryNames[i] + " - " + CountryLibrary.industryNames[j][0] + ": " + result);
                                        JOptionPane.showMessageDialog(frame, "You couldn't upgrade " + CountryLibrary.countryNames[i] + " - " + CountryLibrary.industryNames[j][0] + ": " + result);
                                    }
                                    updateSubSubPanel(i, 2); 
                                }
                                else {
                                    logger.info("Player " + game.currentPlayerValue + " cancelled upgrade of " + CountryLibrary.countryNames[i] + " - " + CountryLibrary.industryNames[j][0]);
                                }
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
                                logger.info("subSubButton3 pressed: " + i + ", " + j);
                                break;
                            }
                        }
                    }
                }
            }

            if (mapPanel1.mapButtons != null) {
                for (int i = 0; i < mapPanel1.mapButtons.length; i++) {
                    if (e.getSource() == mapPanel1.mapButtons[i]) {
                        logger.info("Player 1 pressed mapButton: " + i);
                        if (game.currentPlayerValue != 1) {
                            logger.info("Map access denied for Player 1: It's Player " + game.currentPlayerValue + "'s turn");
                            JOptionPane.showMessageDialog(frame, "It's not your turn!");
                        }
                        else if (game.currentPlayer.countryValues[i][0] != 1) {
                            buyCountriesButton.doClick(); // Simulate the buyCountriesButton being pressed
                            subButtons1[i].doClick(); // Simulate the subButton1 being pressed
                        }
                        else if (game.currentPlayer.countryValues[i][0] == 1) {
                            logger.info("Player 1 clicked on owned country: " + CountryLibrary.countryNames[i]);
                            updateSubPanel(2); // Show upgrade options
                            subButtons2[i].doClick(); // Simulate the subButton2 being pressed
                        }
                        break;
                    }
                }
            }

            if (mapPanel2.mapButtons != null) {
                for (int i = 0; i < mapPanel2.mapButtons.length; i++) {
                    if (e.getSource() == mapPanel2.mapButtons[i]) {
                        logger.info("Player 2 pressed mapButton: " + i);
                        if (game.currentPlayerValue != 2) {
                            logger.info("Map access denied for Player 2: It's Player " + game.currentPlayerValue + "'s turn");
                            JOptionPane.showMessageDialog(frame, "It's not your turn!");
                        }
                        else {
                            buyCountriesButton.doClick(); // Simulate the buyCountriesButton being pressed
                            subButtons1[i].doClick(); // Simulate the subButton1 being pressed
                        }
                        break;
                    }
                }
            }

        }
        UIupdate();
    }

    private boolean pleaseConfirm(String text) {
        int response = JOptionPane.showConfirmDialog(
                frame,
                text,
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            logger.info("User selected Yes, returning true");
            return true;
        } else if (response == JOptionPane.NO_OPTION) {
            logger.info("User selected No, returning false");
            return false;
        }
        return false; // Default case, should not happen
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
        logger.info("Updating UI...");
        game.updateCountryInfos();
        // Updates the country infos
        logger.info("Updating Player 1 Country Infos");

        logger.info("Updating Player 2 Country Infos");

        /*
        p1StatsArea.setText(game.p1.getLevels());
        p2StatsArea.setText(game.p2.getLevels());
        */

        // Updates the money fields
        logger.info("Updating Player 1 Money Field");
        p1MoneyField.setText("Money P1: " + game.p1.playerMoney);
        logger.info("Updating Player 2 Money Field");
        p2MoneyField.setText("Money P2: " + game.p2.playerMoney);
        pTurnField.setText("Player " + game.currentPlayerValue + "'s turn");

        // updateCountryDropdowns();

        logger.info("Updating Player 1 Stats Table");
        updateStatsTable(p1StatsTable, game.p1);
        logger.info("Updating Player 2 Stats Table");
        updateStatsTable(p2StatsTable, game.p2);

        updateSearchResults();

        logger.info("Updating Player 1 Country Marks");
        mapPanel1.markCountries(game.p1.ownedCountries, game.p1.actualNeighborCountries);
        logger.info("Updating Player 2 Country Marks");
        mapPanel2.markCountries(game.p2.ownedCountries, game.p2.actualNeighborCountries);
        eventManagerButton.setEnabled(false);//if adding events, auskommentieren
    }

    /*
    NUR EIN TEST: Aktualisiert die TEST Dropdowns
    void updateCountryDropdowns() {
        p1DisplayCategoryDropdown.removeAllItems();
        p2DisplayCategoryDropdown.removeAllItems();

        for (int i = 0; i < game.p1.countryValues.length; i++) {
            if (game.p1.countryValues[i][0] == 1) {
                if (i < CountryLibrary.countryNames.length) {
                    p1DisplayCategoryDropdown.addItem(CountryLibrary.countryNames[i]);
                } else {
                    p1DisplayCategoryDropdown.addItem("no countryname: " + i);
                }
            }
        }

        for (int i = 0; i < game.p2.countryValues.length; i++) {
            if (game.p2.countryValues[i][0] == 1) {
                p2DisplayCategoryDropdown.addItem(CountryLibrary.countryNames[i]);
            }
        }
    }
    */

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
                    subButtons1[i].setEnabled(game.currentPlayer.countryValues[i][0] != 1);
                }
            }
            case 2 -> {
                subButtons2 = new JButton[CountryLibrary.countryNames.length];
                for (int i = 0; i < CountryLibrary.countryNames.length; i++) {
                    String countryName = (i < CountryLibrary.countryNames.length) ? CountryLibrary.countryNames[i] : "no countryname: " + i;
                    subButtons2[i] = new JButton(countryName);
                    subButtons2[i].addActionListener(this);
                    subPanel.add(subButtons2[i]);
                    subButtons2[i].setEnabled(game.currentPlayer.countryValues[i][0] == 1);
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
        }
        */
    }

    //zeigt die buttons für das subsubpanel an, je nachdem, welcher hauptbuttons gedrückt wurde, im array subsubbuttons2-3, um nachher zu wissen, welcher gedrückt wurde
    void updateSubSubPanel(int buttonPressed, int MainButtonNumber) {
        subSubPanel.removeAll();
        if (MainButtonNumber == 2) {
            subSubButtons2[buttonPressed] = new JButton[CountryLibrary.industryNames.length-1];//if adding events, -1 weg
            for (int i = 0; i < CountryLibrary.industryNames.length-1; i++) {//if adding events, -1 weg
                subSubButtons2[buttonPressed][i] = new JButton(CountryLibrary.industryNames[i][0] + " = " + game.currentPlayer.countryValues[buttonPressed][i + 1]);
                subSubButtons2[buttonPressed][i].addActionListener(this);
                subSubPanel.add(subSubButtons2[buttonPressed][i]);
            }
        } else if (MainButtonNumber == 3) {
            subSubButtons3[buttonPressed] = new JButton[EventLibrary.statNames.length + 2];
            int k;
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
        String[] columnNames = new String[CountryLibrary.industryNames.length + 1];
        columnNames[0] = "Country";
        for (int i = 0; i < CountryLibrary.industryNames.length; i++) {
            columnNames[i + 1] = CountryLibrary.industryNames[i][1];
        }

        DefaultTableModel model = new DefaultTableModel(0, columnNames.length);
        for (int i = 0; i < player.countryValues.length; i++) {
            if (player.countryValues[i][0] == 1) {
                Object[] row = new Object[columnNames.length];
                row[0] = (i < CountryLibrary.countryNames.length) ? CountryLibrary.countryNames[i] : "no countryname: " + i;
                for (int j = 1; j < row.length; j++) {
                    row[j] = CountryLibrary.industryNames[j - 1][1] + ": " + player.countryValues[i][j];
                }
                model.addRow(row);
            }
        }
        table.setModel(model);
        table.getColumnModel().getColumn(0).setPreferredWidth(150);
    }

    //Aktualisiert die Suchergebnisse
    private void updateSearchResults() {
        logger.info("Updating search results");

        String query = searchBar.getText().toLowerCase();

        String[] columnNames = new String[CountryLibrary.industryNames.length + 2];
        columnNames[0] = "Country";
        columnNames[1] = "Price";
        for (int i = 0; i < CountryLibrary.industryNames.length; i++) {
            columnNames[i + 2] = CountryLibrary.industryNames[i][1];
        }
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (int i = 0; i < CountryLibrary.countryNames.length; i++) {
            String countryName = CountryLibrary.countryNames[i];
            if (countryName.toLowerCase().contains(query)) {
                Object[] row = new Object[columnNames.length];
                row[0] = countryName;
                row[1] = "Price: " + CountryLibrary.getCountryPrice(i);
                for (int j = 2; j < row.length; j++) {
                    row[j] = CountryLibrary.industryNames[j - 2][1] + ": " /*+ CountryLibrary.industryProfitMultipliers[i][j - 2]*/;
                }
                model.addRow(row);
            }
        }

        // for (int i = 0; i < EventLibrary.eventNames.length; i++) {//if adding events, auskommentieren
        //     String eventName = EventLibrary.eventNames[i];
        //     if (eventName.toLowerCase().contains(query)) {
        //         model.addRow(new Object[]{eventName});
        //     }
        // }

        searchResultsTable.setModel(model);
        searchResultsTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        searchResultsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
    }
}