package com.geoproject.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorldMap extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        // Deutschland in der Mitte zeichnen
        g.drawRect(350, 250, 100, 150);
        g.drawString("GER", 390, 325);

        // BeNeLux neben Deutschland zeichnen
        g.drawRect(300, 250, 50, 75);
        g.drawString("BeNeLux", 305, 290);

        // Dänemark nördlich von Deutschland zeichnen
        g.drawRect(350, 200, 50, 50);
        g.drawString("DK", 365, 225);

        // Polen östlich von Deutschland zeichnen
        g.drawRect(450, 250, 100, 100);
        g.drawString("PL", 490, 300);

        // Frankreich westlich von Deutschland zeichnen
        g.drawRect(250, 300, 100, 150);
        g.drawString("FR", 290, 375);

        // Tschechien südöstlich von Deutschland zeichnen
        g.drawRect(450, 350, 50, 50);
        g.drawString("CZ", 465, 375);

        // Österreich und Schweiz südlich von Deutschland zeichnen
        g.drawRect(350, 400, 100, 100);
        g.drawString("AT/CH", 375, 450);

        // Vereinigtes Königreich westlich von BeNeLux zeichnen
        g.drawRect(200, 250, 50, 75);
        g.drawString("UK", 215, 290);

        // Skandinavien nördlich von Dänemark zeichnen
        g.drawRect(350, 100, 100, 100);
        g.drawString("SCA", 380, 150);

        // Baltikum nordöstlich von Polen zeichnen
        g.drawRect(550, 200, 50, 50);
        g.drawString("BAL", 565, 225);

        // Finnland nördlich vom Baltikum zeichnen
        g.drawRect(550, 100, 50, 50);
        g.drawString("FI", 565, 125);

        // Slowakei südlich von Polen zeichnen
        g.drawRect(450, 400, 50, 50);
        g.drawString("SK", 465, 425);

        // Ukraine östlich von Polen zeichnen
        g.drawRect(550, 250, 100, 100);
        g.drawString("UA", 590, 300);

        // Spanien südwestlich von Frankreich zeichnen
        g.drawRect(150, 450, 100, 150);
        g.drawString("ES", 190, 525);

        // Italien südlich von Österreich und Schweiz zeichnen
        g.drawRect(350, 500, 50, 100);
        g.drawString("IT", 365, 550);

        // Slowenien südlich von Österreich zeichnen
        g.drawRect(400, 500, 50, 50);
        g.drawString("SI", 415, 525);

        // Ungarn östlich von Slowenien zeichnen
        g.drawRect(450, 500, 50, 50);
        g.drawString("HU", 465, 525);

        // Irland westlich von Vereinigtes Königreich zeichnen
        g.drawRect(150, 250, 50, 75);
        g.drawString("IE", 165, 290);

        // Island nordwestlich von Vereinigtes Königreich zeichnen
        g.drawRect(50, 150, 50, 50);
        g.drawString("IS", 65, 175);

        // Vereinigte Staaten westlich von Irland zeichnen
        g.drawRect(50, 250, 100, 75);
        g.drawString("US", 90, 290);

        // Russland östlich von Ukraine zeichnen
        g.drawRect(650, 250, 150, 100);
        g.drawString("RU", 725, 300);

        // Belarus östlich von Polen zeichnen
        g.drawRect(550, 350, 50, 50);
        g.drawString("BY", 565, 375);

        // Kanada nordwestlich von Vereinigte Staaten zeichnen
        g.drawRect(50, 100, 100, 100);
        g.drawString("CA", 90, 150);

        // Rumänien südlich von Ukraine zeichnen
        g.drawRect(550, 400, 50, 50);
        g.drawString("RO", 565, 425);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("World Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new WorldMap());
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
