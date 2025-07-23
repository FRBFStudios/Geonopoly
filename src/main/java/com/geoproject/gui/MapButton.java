package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

class MapButton extends JButton {
    boolean isMarked = false;
    static Color markedColor = Color.BLACK;
    static Color defaultColor = Color.GRAY;
    static Color hoverColor = Color.YELLOW;

    public MapButton(String text) {
        super(text);
        setFocusPainted(true);
        setBorderPainted(true);
        setContentAreaFilled(false);
        setForeground(Color.BLACK);// Set text color to black
        setFont(new Font(getFont().getName(), getFont().getStyle(), 10));
        setBorder(new LineBorder(defaultColor, 2)); // Set a thicker border
        
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) { // Change border color on hover
                    setBorder(new LineBorder(hoverColor, 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!isFocusOwner()) {
                    //if (isMarked) {
                        setBorder(new LineBorder(markedColor, 2));// Keep border color if marked
                    //} else {
                    //    setBorder(new LineBorder(Color.BLACK, 2)); // Revert border color to light blue when not hovering and not focused
                    //}
                }
            }
        });

        // Get rid of this commented out code
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                    setBorder(new LineBorder(hoverColor, 2));
            }

            @Override
            public void focusLost(FocusEvent e) {
                    //if (isMarked) {
                        setBorder(new LineBorder(markedColor, 2)); // Keep border color if marked
                    // } else {
                    //     setBorder(new LineBorder(Color.BLACK, 2));
                    // }
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