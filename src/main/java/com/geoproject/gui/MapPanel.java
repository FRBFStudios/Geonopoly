package com.geoproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

import com.geoproject.libraries.CountryLibrary;

// Note to @TP-xx: For the love of god, read through this and consider my comments I've left, this file is a fucking mess

public class MapPanel extends JPanel /*implements ActionListener */{
    public MapButton[] mapButtons;

    // Dev Tools
    private int lineX1 = 100;
    private int lineY1 = 100;
    private int lineX2 = 100;
    private int lineY2 = 100;

    private JSlider sliderX1;
    private JSlider sliderY1;
    private JSlider sliderX2;
    private JSlider sliderY2;

    private final boolean debug;

    public MapPanel(JButton[] MainButtons, boolean debug) {
        this.debug = debug;

        setLayout(null);
        setOpaque(false);

        mapButtons = new MapButton[CountryLibrary.countryNames.length];
        for (int i = 0; i < CountryLibrary.countryShortNames.length; i++) {
            if (i < countryMapLayout.length) {
                mapButtons[i] = new MapButton(CountryLibrary.getButtonCountryShortNames(i));
                mapButtons[i].setBounds(countryMapLayout[i][0], countryMapLayout[i][1], countryMapLayout[i][2], countryMapLayout[i][3]);
                mapButtons[i].setFont(new Font(getFont().getName(), getFont().getStyle(), countryMapLayout[i][4]));
                add(mapButtons[i]);

                final int index = i;
                final int[][] borders = CountryLibrary.borders;
                markNeighborsOfHoveredCountry(index, borders);
            }
        }

        if (debug) {addSliders();}
        
        //createPolygon();

        /*addFocusListeners(button1, MainButtons[0]);
        addFocusListeners(button2, MainButtons[0]);
        addFocusListeners(button3, MainButtons[1]);
        addFocusListeners(button4, MainButtons[1]);*/
    }


    private void addSliders() {
        sliderX1 = new JSlider(5, 810, 100);
        sliderY1 = new JSlider(5, 400, 100);
        sliderX2 = new JSlider(5, 810, 100);
        sliderY2 = new JSlider(5, 400, 100);
        sliderX1.setBounds(0,400,200,20);
        sliderY1.setBounds(200,400,200,20);
        sliderX2.setBounds(400,400,200,20);
        sliderY2.setBounds(600,400,200,20);
        
        add(sliderX1);
        add(sliderY1);
        add(sliderX2);
        add(sliderY2);

        sliderX1.addChangeListener(e -> {lineX1 = sliderX1.getValue(); repaint(); output();});
        sliderY1.addChangeListener(e -> {lineY1 = sliderY1.getValue(); repaint(); output();});
        sliderX2.addChangeListener(e -> {lineX2 = sliderX2.getValue(); repaint(); output();});
        sliderY2.addChangeListener(e -> {lineY2 = sliderY2.getValue(); repaint(); output();});
    }


    private void markNeighborsOfHoveredCountry(final int index, final int[][] borders) {
        mapButtons[index].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                // Nachbarländer lila machen
                for (int j = 0; j < borders[index].length; j++) {
                    int borderCountry = borders[index][j];
                    if (borderCountry >= 0 && borderCountry < mapButtons.length) {
                        mapButtons[borderCountry].setBorder(new LineBorder(Color.YELLOW, 2));
                    }
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                // Nachbarländer zurücksetzen
                for (int j = 0; j < borders[index].length; j++) {
                    int borderCountry = borders[index][j];
                    if (borderCountry >= 0 && borderCountry < mapButtons.length) {
                        MapButton btn = mapButtons[borderCountry];
                        if (btn.isMarked && btn.markedColor != null) {
                            btn.setBorder(new LineBorder(btn.markedColor, 2));
                        } else {
                            btn.setBorder(new LineBorder(MapButton.defaultColor, 2));
                        }
                    }
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.GRAY);
        g2d.drawLine(155, 120, 260, 95); //UK USA
        g2d.drawLine(230, 80, 245, 80);  //UK IRE
        g2d.drawLine(265, 95, 270, 115); //UK FRA
        g2d.drawLine(275, 80, 285, 90);  //UK BNL
        g2d.drawLine(145, 155, 150, 160);//CUB USA
        g2d.drawLine(130, 175, 140, 175);//CUB MEX
        g2d.drawLine(160, 185, 160, 210);//CUB VEN
        g2d.drawLine(250, 200, 120, 200);//IBE MID
        g2d.drawLine(255, 65, 240, 40);  //UK ICE
        g2d.drawLine(210, 30, 190, 25);  //ICE GRN
        g2d.drawLine(125, 40, 160, 20);  //GRN CAN
        g2d.drawLine(250, 200, 130, 190);//IBE MEX
        g2d.drawLine(345, 70, 355, 60);  //SCA DEN
        g2d.drawLine(440, 55, 445, 65);  //BLT FIN
        //g2d.drawLine(500, 135, 495, 195);//TUR RUS
        g2d.drawLine(480, 150, 490, 195);//TUR UKR
        g2d.drawLine(440, 220, 470, 222);//TUR GRE/MAC
        g2d.drawLine(550, 160, 575, 165);//GEO/ARM/AZE TKM
        g2d.drawLine(690, 295, 690, 300);//SRI IND
        g2d.drawLine(240, 265, 280, 225);//IBE BRA

        //connection between RUS and USA
        g2d.setStroke(new BasicStroke(2));
        g2d.setFont(new Font("1", this.getFont().getStyle(), 9));
        g2d.drawString("(RUS)", 2, 125);
        g2d.drawString("(USA)", 775, 70);

        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawRect(760, 40, 60, 50);
        g2d.drawLine(760, 60, 700, 60);//RUS (USA)

        g2d.drawRect(0, 105, 35, 35);
        g2d.drawLine(35, 120, 50, 120);//USA (RUS)

        if (debug) {g2d.drawLine(lineX1, lineY1, lineX2, lineY2);}
    }

    private void output(){
        System.out.println(lineX1 + " " + lineY1 + " " + lineX2 + " " + lineY2);
    }

    

    public void markCountries(int[] ownedCountries, int[] neighborCountries) {
        clearPreviousCountryMarks();
        markOwnedCountries(ownedCountries);
        markNeighborCountries(neighborCountries);
    }

    private void markNeighborCountries(int[] neighborCountries) {
        for (int i = 0; i < neighborCountries.length; i++) {
            if (neighborCountries[i] > 0) {
                mapButtons[i].markButton(true, Color.GREEN);
            } else if (i < mapButtons.length) {
            } else {
                //System.out.println("Error: Country index out of bounds: " + i);
            }
        }
    }

    private void markOwnedCountries(int[] ownedCountries) {
        for (int i = 0; i < ownedCountries.length; i++) {
            if (ownedCountries[i] > 0) {
                mapButtons[i].markButton(true, Color.BLUE);
            } else if (i < mapButtons.length) {
                mapButtons[i].markButton(false, null);
            } else {
                //System.out.println("Error: Country index out of bounds: " + i);
            }
        }
    }

    private void clearPreviousCountryMarks() {
        for (MapButton mapButton : mapButtons) {
            mapButton.markButton(false, null);
        }
    }


    
    public static int[][] countryMapLayout = new int[][] {
        {310,90,50,50,10},//Deutschland  DE  0
        {280,90,30,25,10},//BeNeLux  BNL  1
        {295,70,65,20,10},//Dänemark  DEN  2
        {360,90,60,30,10},//Polen  POL  3
        {265,115,45,65,10},//Frankreich  FRA  4
        {360,120,30,20,10},//Tschiechen  CZE  5
        {310,140,80,20,10},//Österreich & Schweiz  AU & SWI  6
        {245,65,30,30,10},//UK UK  7
        {350,5,50,55,10},//Skandinavien  SCAN  8
        {410,65,70,25,10},//Baltikum  BALT  9
        {400,5,80,50,10},//Finnland  FIN  10
        {390,120,30,30,10},//Slovakai  SVK  11
        {420,90,60,20,10},//Belarus  BLR  12
        {420,110,60,40,10},//Ukraine  UKR  13
        {310,160,30,60,10},//Italien  ITA  14
        {340,160,50,30,10},//Balkan  BALK  15
        {390,150,40,25,10},//Ungarn  HUN  16
        {430,150,40,25,10},//Rumänien  RUM  17
        {390,175,50,50,10},//Griechenland & Nordmazedonien  GRE/NMK  18
        {50,90,105,65,10},//USA USA 19
        {60,40,90,50,10},//Kanada CAN 20
        {75,155,55,35,10},//Mexiko MEX 21
        {85,190,35,20,10},//Mittelamerika MID 22
        {65,210,75,35,10},//Kolumbien COL 23
        {140,210,40,35,10},//Venezuela VEN 24
        {125,245,115,60,10},//Brasilien BRA 25
        {35,220,30,50,10},//Ecuador ECU 26
        {65,245,60,35,10},//Peru PER 27
        {180,210,30,35,10},//Guyana GUY 28
        {210,210,30,35,10},//Suriname SUR 29
        {95,305,30,70,10},//Argentinien ARG 30
        {65,280,30,95,10},//Chile CHI 31
        {160,5,30,35,10},//Grönland GRN 32
        {95,280,30,25,10},//Bolivien BOL 33
        {125,305,30,30,10},//Paraguay PAR 34
        {155,305,30,30,10},//Uruguay URU 35
        {210,20,30,30,10},//Island ICE 36
        {205,65,25,25,10},//Irland IRE 37
        {480,5,220,130,10},//Russland RUS 38
        {470,195,80,40,10},//Türkei TUR 39
        {470,235,45,30,10},//Syrien SYR 40
        {470,265,45,30,10},//Jordanien JOR 41
        {435,255,35,40,10},//Israel und Palästina ISR/PAL 42
        {435,235,35,20,10},//Libanon LEB 43
        {470,295,80,55,10},//Saudi-Arabien SAU 44
        {470,350,45,30,10},//Jemen YEM 45
        {515,350,70,30,10},//Oman OMA 46
        {250,180,60,45,10},//Iberische Halbinsel IBE 47
        {550,315,35,35,10},//VAE UAE/QAT 48
        {515,235,35,60,10},//Irak IRQ 49
        {510,135,40,60,10},//GeArAz GEO/ARM/AZE 50
        {440,175,30,35,10},//Bulgarien BUL 51

        {550,185,55,80,10},//Iran IRN 52
        {605,210,70,30,10},//Pakistan PAK 53
        {575,135,100,20,10},//Kasachstan KAZ 54
        {615,155,30,25,10},//Usbekistan UZB 55
        {575,155,40,30,10},//Turkmenistan TKM 56
        {645,170,30,15,10},//Tadschikistan TAD 57
        {605,185,70,25,10},//Afghanistan AFG 58
        {645,155,30,15,10},//Kirgisistan KYR 59
        {655,240,55,55,10},//Indien IND 60
        {710,220,25,35,10},//Myanmar BUR 61
        {710,255,25,25,10},//Bangladesch BAN 62
        {685,220,25,20,10},//Nepal NEP 63
        {140,160,30,25,10},//Kuba CUB 64
        {680,300,25,20,10},//Sri Lanka SRI 65
        {700,110,35,25,10},//Mongolei MON 66
        {675,135,60,85,10},//China CHN 67
    };

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
        hexButton.setForeground(Color.BLACK); // Set text color to black
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

        // Call UI.actionPerformed when button is pressed
        hexButton.addActionListener(e -> {
            com.geoproject.gui.UI uiInstance = com.geoproject.gui.UI.getInstance();
            if (uiInstance != null) {
                uiInstance.actionPerformed(e);
            }
        });
    }*/
}

