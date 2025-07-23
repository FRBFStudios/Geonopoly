package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

class MapButton extends JButton {
    boolean isMarked = false;//true if owned or neighboring
    Color markedColor;
    static Color defaultColor = Color.GRAY;
    static Color hoverColor = Color.RED;

    public MapButton(String text) {
        super(text);
        setFocusPainted(true);
        setBorderPainted(true);
        setContentAreaFilled(false);
        setForeground(Color.BLACK);// Set text color to black
        setFont(new Font(getFont().getName(), getFont().getStyle(), 10));
        setBorder(new LineBorder(defaultColor, 2)); // Set a thicker border
        
        addHoverEffects();
        addClickEffects();
    }

    private void addHoverEffects() {
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                    setBorder(new LineBorder(hoverColor, 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!isFocusOwner()) {
                    setBorder(new LineBorder(markedColor, 2));
                }
            }
        });
    }
    
    private void addClickEffects() {
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                setBorder(new LineBorder(hoverColor, 2));
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBorder(new LineBorder(markedColor, 2));
            }
        });
    }

    void markButton(boolean wahr, Color color) {
        if (wahr) {
            isMarked = true;
            markedColor = color;
            setBorder(new LineBorder(color, 2));
        }
        else {
            isMarked = false;
            markedColor = defaultColor;
            setBorder(new LineBorder(defaultColor, 2));
        }
    }
}