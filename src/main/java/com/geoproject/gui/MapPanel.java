package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
// import java.awt.event.FocusAdapter;
// import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.geom.Area;

import com.geoproject.libraries.CountryLibrary;
import com.geoproject.gui.HexButton;

/*public class Map extends JFrame {
    JFrame frame;
    JPanel panel;
    JButton button1, button2, button3;
    JButton[] buttons = new JButton[3];
    // public static void main(String[] args) {
    //     new Map();
    // }
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
        MapPanel mapPanel = new MapPanel(buttons);
        mapPanel.setBounds(760, 300, 815, 295);
        frame.add(mapPanel);
        frame.setVisible(true);
    }
}*/
//.
//.
//.
//.
//.
public class MapPanel extends JPanel implements ActionListener {
    public MapButton[] mapButtons;
    //MapButton hexButton;

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
                //mapButtons[i].addActionListener(this);
                mapButtons[i].setBounds(countryMapLayout[i][0], countryMapLayout[i][1], countryMapLayout[i][2], countryMapLayout[i][3]);
                mapButtons[i].setFont(new Font(getFont().getName(), getFont().getStyle(), countryMapLayout[i][4]));
                add(mapButtons[i]);
            }
        }



        // RussiaPanel russiaPanel = new RussiaPanel();
        // russiaPanel.setBounds(400, 5, 200, 100);
        // add(russiaPanel);
        
        //createPolygon();

        //add(hexButton);

        /*addFocusListeners(button1, MainButtons[0]);
        addFocusListeners(button2, MainButtons[0]);
        addFocusListeners(button3, MainButtons[1]);
        addFocusListeners(button4, MainButtons[1]);*/
    }


    /*private void createPolygon() {
        // Add a hexagonal button
         hexButton = new MapButton("Hexagon") {
            Polygon hexagon = new Polygon();

            {
            for (int i = 0; i < 6; i++) {
                hexagon.addPoint(
                (int) (50 + 50 * Math.cos(i * 2 * Math.PI / 6)),
                (int) (50 + 50 * Math.sin(i * 2 * Math.PI / 6))
                );
            }
            setBorderPainted(false);
            
            }

            @Override
            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(getBackground());
            //g2d.fill(hexagon);
            g2d.setColor(getForeground());
            g2d.setStroke(new BasicStroke(2));
            g2d.draw(hexagon);
            g2d.dispose();
            }

            @Override
            public boolean contains(int x, int y) {
            return hexagon.contains(x, y);
            }
        };

        hexButton.setBounds(500, 200, 100, 100);
        hexButton.setFont(new Font(getFont().getName(), getFont().getStyle(), 10));
        hexButton.setForeground(Color.BLACK); // Set text color to red
        hexButton.setBorder(new LineBorder(Color.BLACK, 10)); // Set a thicker border
        

        // Add hover effect
        hexButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            hexButton.setForeground(Color.GREEN); // Change text color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            hexButton.setForeground(Color.BLACK); // Revert text color when not hovering
            }
        });

        hexButton.addActionListener(this);
    }*/




    private void addFocusListeners(JButton button, JButton targetButton) {
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
        // if (e.getSource() == mapButtons[0]) {
        //     System.out.println("mapButtons 0 presses (should get removed)");
        // }
        /*if (e.getSource() == hexButton) {
            System.out.println("Hexagon pressed");
        }*/
    }

    public void markCountries(int[] ownedCountries, int[] neighborCountries) {
        for (int i = 0; i < ownedCountries.length; i++) {
            if (ownedCountries[i] > 0 && i < mapButtons.length) {
                mapButtons[i].markButton(true, Color.GREEN);
            } 
            else if (i < mapButtons.length) {
                mapButtons[i].markButton(false, null);
            } 
            else {
                System.out.println("Error: Country index out of bounds: " + i);
            }
        }
        for (int i = 0; i < neighborCountries.length; i++) {
            if (neighborCountries[i] > 0 && i < mapButtons.length) {
                mapButtons[i].markButton(true, Color.BLACK);
            } 
            //else if (i < mapButtons.length) {mapButtons[i].markButton(false, Color.BLACK);} 
            else {
                System.out.println("Error: Country index out of bounds: " + i);
            }
        }
    }


    //maps sind 815x425
    //EVTL AUCH TEXTORIENTIERUNG ALS VARIABLE REINNEHMEN
    public static int[][] countryMapLayout = new int[][] {
        {310,90,50,50,10},//Deutschland  DE  0
        {280,90,30,25,10},//BeNeLux  BNL  1
        {295,70,65,20,10},//Dänemark  DEN  2
        {360,90,60,30,10},//Polen  POL  3
        {255,115,55,65,10},//Frankreich  FRA  4
        {360,120,30,20,10},//Tschiechen  CZE  5
        {310,140,80,20,10},//Österreich & Schweiz  AU & SWI  6
        {245,65,35,50,10},//UK  UK  7
        {335,5,55,65,10},//Skandinavien  SCAN  8
        {400,55,60,35,10},//Baltikum  BALT  9
        {390,5,70,50,10},//Finnland  FIN  10
        {390,120,30,30,10},//Slovakai  SVK  11
        {420,90,40,20,10},//Belarus  BLR  12
        {420,110,40,40,10},//Ukraine  UKR  13
        {310,160,30,60,10},//Italien  ITA  14
        {340,160,50,30,10},//Balkan  BALK  15
        {390,150,40,25,10},//Ungarn  HUN  16
        {430,150,30,25,10},//Rumänien  RUM  17
        {390,175,50,40,10},//Griechenland & Nordmazedonien  GRE/NMK  18
        {0,0,0,0,10},//USA USA 19
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
class MapButton extends JButton {
    boolean isMarked = false;
    Color markedColor = Color.BLACK;
    static Color defaultColor = Color.GRAY;
    static Color hoverColor = Color.YELLOW;

    public MapButton(String text) {
        super(text);
        setFocusPainted(true);
        setBorderPainted(true);
        setContentAreaFilled(false);
        setForeground(Color.BLACK); // Set text color to black
        setFont(new Font(getFont().getName(), getFont().getStyle(), 10));
        setBorder(new LineBorder(defaultColor, 2)); // Set a thicker border
        
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                    setBorder(new LineBorder(hoverColor, 2)); // Change border color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!isFocusOwner()) {
                    //if (isMarked) {
                        setBorder(new LineBorder(markedColor, 2)); // Keep border color if marked
                    //} else {
                    //    setBorder(new LineBorder(Color.BLACK, 2)); // Revert border color to light blue when not hovering and not focused
                    //}
                }
            }
        });

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




class HexButton extends JButton {
    private Polygon hexagon;

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



