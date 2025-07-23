package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

class HexButton extends JButton {
    private final Polygon hexagon;

    public HexButton(String text, ActionListener listener) {
        super(text);
        hexagon = new Polygon();
        for (int i = 0; i < 6; i++) {
            hexagon.addPoint(
                (int) (50 + 50 * Math.cos(i * 2 * Math.PI / 6)),
                (int) (50 + 50 * Math.sin(i * 2 * Math.PI / 6))
            );
        }
        setBorderPainted(false);
        setBounds(500, 200, 100, 100);
        setFont(new Font(getFont().getName(), getFont().getStyle(), 10));
        setForeground(Color.BLACK);
        setBorder(new LineBorder(Color.BLACK, 10));
        addActionListener(listener);

        // Add hover effect
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setForeground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setForeground(Color.BLACK);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getBackground());
        g2d.setColor(getForeground());
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(hexagon);
        g2d.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        return hexagon.contains(x, y);
    }
}