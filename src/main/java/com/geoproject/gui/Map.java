package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;

public class Map extends JFrame {
    JFrame frame;
    JPanel panel;
    JButton button1, button2, button3;
    JButton[] buttons = new JButton[3];
    
    public static void main(String[] args) {
        new Map();
    }

    //.
    //.

    public Map() {
        frame = new JFrame();
        frame.setTitle("Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1040);
        frame.setLayout(null); // Set layout to null for absolute positioning

        panel = new JPanel(new FlowLayout());
        panel.setBounds(710, 200, 500, 50);

        button1 = new JButton("topButton 1");
        button2 = new JButton("topButton 2");
        button3 = new JButton("topButton 3");

        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        
        frame.add(panel);


        //muss in UI übertragen werden
        MapPanel mapPanel = new MapPanel(buttons);
        mapPanel.setBounds(760, 300, 400, 150);
        frame.add(mapPanel);

        frame.setVisible(true);

    }
}
//.
//.
//.
//.
//.
//.
//.
//.
class MapPanel extends JPanel {
    JButton button1, button2, button3, button4;

    public MapPanel(JButton[] MainButtons) {
        setLayout(new FlowLayout());

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");

        add(button1);
        add(button2);
        add(button3);
        add(button4);

        MapButton test = new MapButton("test");
        add(test);

        addHoverListeners(button1, MainButtons[0]);
        addHoverListeners(button2, MainButtons[0]);
        addHoverListeners(button3, MainButtons[1]);
        addHoverListeners(button4, MainButtons[1]);
    }

    private void addHoverListeners(JButton button, JButton targetButton) {
        button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                targetButton.setBackground(Color.GREEN);
            }

            @Override
            public void focusLost(FocusEvent e) {
                targetButton.setBackground(UIManager.getColor("Button.background"));
            }
        });
    }
}
//.
//.
//.
//.
//.
//.
//.
//.
class MapButton extends JButton {
    public MapButton(String text) {
        super(text);
        setFocusPainted(true);
        setBorderPainted(true);
        setContentAreaFilled(false);
        setBorder(new LineBorder(Color.BLACK, 2)); // Set a thicker border
    }
}
