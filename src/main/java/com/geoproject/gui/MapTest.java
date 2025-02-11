package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MapTest extends JFrame {

    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(() -> {
            MapTest mapTest = new MapTest();
            mapTest.setVisible(true);
        });
    }


    public MapTest() {
        // Set the title of the window
        setTitle("Map Test");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        setSize(800, 200);

        // Create a panel with FlowLayout to arrange buttons horizontally
        JPanel panel = new JPanel(new FlowLayout());

        // Create three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add FocusListener to each button
        addFocusListenerToButton(button1, null, button2);
        addFocusListenerToButton(button2, button1, button3);
        addFocusListenerToButton(button3, button2, null);

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Create another panel with FlowLayout to arrange buttons horizontally
        JPanel panel2 = new JPanel(new FlowLayout());

        // Create four more buttons
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");

        // Add FocusListener to each button
        addHoverListenerToButton(button4, null, button5);
        addHoverListenerToButton(button5, button4, button6);
        addHoverListenerToButton(button6, button5, button7);
        addHoverListenerToButton(button7, button6, null);

        // Add buttons to the second panel
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);

        // Add panels to the frame
        add(panel, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
    }

    private void addFocusListenerToButton(JButton button, JButton leftNeighbor, JButton rightNeighbor) {
        button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (leftNeighbor != null) {
                    leftNeighbor.setBackground(Color.GREEN);
                }
                if (rightNeighbor != null) {
                    rightNeighbor.setBackground(Color.GREEN);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (leftNeighbor != null) {
                    leftNeighbor.setBackground(UIManager.getColor("Button.background"));
                }
                if (rightNeighbor != null) {
                    rightNeighbor.setBackground(UIManager.getColor("Button.background"));
                }
            }
        });
    }

    

    private void addHoverListenerToButton(JButton button, JButton leftNeighbor, JButton rightNeighbor) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (leftNeighbor != null) {
                    leftNeighbor.setBackground(Color.GREEN);
                }
                if (rightNeighbor != null) {
                    rightNeighbor.setBackground(Color.GREEN);
                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (leftNeighbor != null) {
                    leftNeighbor.setBackground(UIManager.getColor("Button.background"));
                }
                if (rightNeighbor != null) {
                    rightNeighbor.setBackground(UIManager.getColor("Button.background"));
                }
            }
        });
    }

}