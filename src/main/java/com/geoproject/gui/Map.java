package com.geoproject.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import com.geoproject.libraries.CountryLibrary;

public class Map extends JFrame {
    JFrame frame;
    JPanel panel;
    JButton button1, button2, button3;
    JButton[] buttons = new JButton[3];
    
    // public static void main(String[] args) {
    //     new Map();
    // }

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
        mapPanel.setBounds(760, 300, 815, 295);
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
class MapPanel extends JPanel implements ActionListener {
    MapButton[] mapButtons;

    public MapPanel(JButton[] MainButtons) {
        /*setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        mapButtons = new MapButton[CountryLibrary.countryNames.length];
        for (int i = 0; i < CountryLibrary.countryNames.length; i++) {
            mapButtons[i] = new MapButton(CountryLibrary.countryNames[i]);
            mapButtons[i].addActionListener(this);
            gbc.gridx = i % 3; // Adjust this based on your desired layout
            gbc.gridy = i / 3;
            add(mapButtons[i], gbc);
        }

        MapButton test = new MapButton("test");
        add(test);*/

        setLayout(null);
        setOpaque(false);

        mapButtons = new MapButton[CountryLibrary.countryNames.length];
        for (int i = 0; i < CountryLibrary.countryShortNames.length; i++) {
            if (i < countryMapLayout.length) {
                mapButtons[i] = new MapButton(CountryLibrary.countryShortNames[i]);
                mapButtons[i].addActionListener(this);
                mapButtons[i].setBounds(countryMapLayout[i][0], countryMapLayout[i][1], countryMapLayout[i][2], countryMapLayout[i][3]);
                mapButtons[i].setFont(new Font(getFont().getName(), getFont().getStyle(), countryMapLayout[i][4]));
                add(mapButtons[i]);
            }
        }

        RussiaPanel russiaPanel = new RussiaPanel();
        russiaPanel.setBounds(400, 5, 200, 100);
        add(russiaPanel);

        /*addHoverListeners(button1, MainButtons[0]);
        addHoverListeners(button2, MainButtons[0]);
        addHoverListeners(button3, MainButtons[1]);
        addHoverListeners(button4, MainButtons[1]);*/
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mapButtons[0]) {
            System.out.println("mapButtons 0 presses (should get removed)");
        }
    }

    //maps sind 815x425
    //EVTL AUCH TEXTORIENTIERUNG ALS VARIABLE REINNEHMEN
    public static int[][] countryMapLayout = new int[][] {
        {310,90,50,50,10},//GER 0
        {280,90,30,25,10},//BNL 1
        {295,70,65,20,10},//DEN 2
        {360,90,65,30,10},//POL 3
        {255,115,55,65,10},//FRA 4
        {360,120,40,20,10},//CZE 5
        {310,140,90,20,10},//AU & SWI 6
        {245,55,25,30,10},//UK 7
        {325,5,40,60,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        {0,0,0,0,10},//
        //{400,5,200,100,10},// RUS 38
    };
}
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
        setForeground(Color.RED); // Set text color to black
        setFont(new Font(getFont().getName(), getFont().getStyle(), 10));
        setBorder(new LineBorder(Color.BLACK, 2)); // Set a thicker border
        
        // Add hover effect
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBorder(new LineBorder(Color.GREEN, 2)); // Change border color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBorder(new LineBorder(Color.BLACK, 2)); // Revert border color when not hovering
            }
        });
    }
}

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


