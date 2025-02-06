package com.geoproject.gui;

import javax.swing.*;



    //so machen, dass dies eine hilfsklasse für UI wird

    //Map wird durch UI angezeigt

public class Map {
    public static void main(String[] args) {
        new Map();
    }

    JFrame frame;
    
    JLabel Map;
    JButton[] countries;

    public Map() {
        frame = new JFrame("Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1040);
        frame.setLayout(null);
        
        Map = new JLabel();
        Map.setBounds(0, 0, 800, 600);
        Map.setIcon(new ImageIcon("src/main/resources/Map.png"));
        frame.add(Map);
        
        countries = new JButton[33];
        for (int i = 0; i < countries.length; i++) {
            countries[i] = new JButton();
            countries[i].setBounds(0, 0, 0, 0);
            frame.add(countries[i]);
        }
        
        frame.setVisible(true);
    }
}
