package com.geoproject.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Map extends JFrame implements ActionListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Map() {
        setTitle("Map Visualizations");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 3)); // 3 different visualizations side by side

        // Add different visualizations
        add(createMapPanel1());
        add(createMapPanel2());
        add(createMapPanel3());

        setVisible(true);
    }

    private JPanel createMapPanel1() {
        JPanel panel = new JPanel(null);
        addCountry(panel, "DE", 50, 50, 120, 80);
        addCountry(panel, "BENELUX", 180, 50, 60, 40);
        addCountry(panel, "DEN", 250, 30, 40, 60);
        addCountry(panel, "POL", 300, 50, 100, 80);
        addCountry(panel, "FRA", 50, 150, 100, 80);
        addCountry(panel, "CZE", 180, 150, 60, 40);
        return panel;
    }

    private JPanel createMapPanel2() {
        JPanel panel = new JPanel(null);
        addCountry(panel, "DE", 50, 50, 130, 90);
        addCountry(panel, "BENELUX", 190, 50, 70, 50);
        addCountry(panel, "DEN", 270, 30, 50, 70);
        addCountry(panel, "POL", 330, 50, 110, 90);
        addCountry(panel, "FRA", 50, 160, 110, 90);
        addCountry(panel, "CZE", 190, 160, 70, 50);
        return panel;
    }

    private JPanel createMapPanel3() {
        JPanel panel = new JPanel(null);
        addCountry(panel, "DE", 50, 50, 140, 100);
        addCountry(panel, "BENELUX", 200, 50, 80, 60);
        addCountry(panel, "DEN", 290, 30, 60, 80);
        addCountry(panel, "POL", 360, 50, 120, 100);
        addCountry(panel, "FRA", 50, 170, 120, 100);
        addCountry(panel, "CZE", 200, 170, 80, 60);
        return panel;
    }

    private void addCountry(JPanel panel, String name, int x, int y, int width, int height) {
        JButton button = new JButton(name);
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        System.out.println("Country clicked: " + source.getText());
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Map testmap = new Map();
    }
}
