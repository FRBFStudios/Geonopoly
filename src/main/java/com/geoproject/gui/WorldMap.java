package com.geoproject.gui;

import java.awt.*;
import javax.swing.*;

public class WorldMap extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        // GER
        g.drawRect(350, 250, 100, 150);
        g.drawString("DE", 390, 325);

        // BNL
        g.drawRect(300, 250, 50, 75);
        g.drawString("BeNeLux", 305, 290);

        // DEN
        g.drawRect(350, 200, 50, 50);
        g.drawString("DK", 365, 225);

        // POL
        g.drawRect(450, 250, 100, 100);
        g.drawString("PL", 490, 300);

        // FRA
        g.drawRect(250, 300, 100, 150);
        g.drawString("FR", 290, 375);

        // CZE
        g.drawRect(450, 350, 50, 50);
        g.drawString("CZ", 465, 375);

        // SWI/AU/LI
        g.drawRect(350, 400, 100, 100);
        g.drawString("AT/CH", 375, 450);

        // UK
        g.drawRect(200, 250, 50, 75);
        g.drawString("UK", 215, 290);

        // SCA
        g.drawRect(350, 100, 100, 100);
        g.drawString("SCA", 380, 150);

        // BLT
        g.drawRect(550, 200, 50, 50);
        g.drawString("BAL", 565, 225);

        // FIN
        g.drawRect(550, 100, 50, 50);
        g.drawString("FI", 565, 125);

        // SLV
        g.drawRect(450, 400, 50, 50);
        g.drawString("SK", 465, 425);

        // UKR
        g.drawRect(550, 250, 100, 100);
        g.drawString("UA", 590, 300);

        // IBE
        g.drawRect(150, 450, 100, 150);
        g.drawString("ES", 190, 525);

        // ITA
        g.drawRect(350, 500, 50, 100);
        g.drawString("IT", 365, 550);

        // SLO
        g.drawRect(400, 500, 50, 50);
        g.drawString("SI", 415, 525);

        // HUN
        g.drawRect(450, 500, 50, 50);
        g.drawString("HU", 465, 525);

        // IRE
        g.drawRect(150, 250, 50, 75);
        g.drawString("IE", 165, 290);

        // ICE
        g.drawRect(50, 150, 50, 50);
        g.drawString("IS", 65, 175);

        // USA
        g.drawRect(50, 250, 100, 75);
        g.drawString("US", 90, 290);

        // RUS
        g.drawRect(650, 250, 150, 100);
        g.drawString("RU", 725, 300);

        // BEL
        g.drawRect(550, 350, 50, 50);
        g.drawString("BY", 565, 375);

        // CAN
        g.drawRect(50, 100, 100, 100);
        g.drawString("CA", 90, 150);

        // ROM
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
