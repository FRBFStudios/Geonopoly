package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Area;

        // Should be insertet in another class
        
        // RussiaPanel russiaPanel = new RussiaPanel();
        // russiaPanel.setBounds(400, 5, 200, 100);
        // add(russiaPanel);

class RussiaPanel extends JPanel {
    public RussiaPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Russia clicked");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);

        // Erstelle ein Quadrat
        Area russia = new Area(new Rectangle(50, 50, 100, 100));

        // Entferne das Quadrat in der unteren rechten Ecke
        Area missingSquare = new Area(new Rectangle(100, 100, 50, 50));
        russia.subtract(missingSquare);

        g2d.fill(russia);
    }
}