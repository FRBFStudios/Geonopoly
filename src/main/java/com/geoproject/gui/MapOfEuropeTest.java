import java.awt.*;
import javax.swing.*;

public class CopyOfWorldMap extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        // Deutschland in der Mitte zeichnen
        g.drawRect(350, 250, 60, 90);
        g.drawString("DE", 375, 295);

        // BeNeLux neben Deutschland zeichnen
        g.drawRect(300, 250, 30, 45);
        g.drawString("BeNeLux", 305, 270);

        // Dänemark nördlich von Deutschland zeichnen
        g.drawRect(350, 200, 20, 30);
        g.drawString("DK", 355, 215);

        // Polen östlich von Deutschland zeichnen
        g.drawRect(410, 250, 80, 100);
        g.drawString("PL", 445, 300);

        // Frankreich westlich von Deutschland zeichnen
        g.drawRect(250, 300, 90, 130);
        g.drawString("FR", 290, 375);

        // Tschechien südöstlich von Deutschland zeichnen
        g.drawRect(410, 350, 40, 50);
        g.drawString("CZ", 425, 375);

        // Österreich und Schweiz südlich von Deutschland zeichnen
        g.drawRect(350, 360, 60, 70);
        g.drawString("AT/CH", 365, 395);

        // Vereinigtes Königreich westlich von BeNeLux zeichnen
        g.drawRect(200, 250, 30, 45);
        g.drawString("UK", 210, 270);

        // Skandinavien nördlich von Dänemark zeichnen
        g.drawRect(350, 100, 60, 100);
        g.drawString("SCA", 370, 150);

        // Baltikum nordöstlich von Polen zeichnen
        g.drawRect(490, 200, 20, 30);
        g.drawString("BAL", 495, 215);

        // Finnland nördlich vom Baltikum zeichnen
        g.drawRect(490, 100, 40, 50);
        g.drawString("FI", 505, 125);

        // Slowakei südlich von Polen zeichnen
        g.drawRect(410, 400, 40, 40);
        g.drawString("SK", 425, 420);

        // Ukraine östlich von Polen zeichnen
        g.drawRect(490, 250, 80, 100);
        g.drawString("UA", 525, 300);

        // Spanien südwestlich von Frankreich zeichnen
        g.drawRect(150, 450, 100, 120);
        g.drawString("ES", 190, 510);

        // Italien südlich von Österreich und Schweiz zeichnen
        g.drawRect(350, 430, 30, 90);
        g.drawString("IT", 365, 475);

        // Slowenien südlich von Österreich zeichnen
        g.drawRect(380, 430, 20, 30);
        g.drawString("SI", 385, 445);

        // Ungarn östlich von Slowenien zeichnen
        g.drawRect(400, 430, 30, 50);
        g.drawString("HU", 410, 455);

        // Irland westlich von Vereinigtes Königreich zeichnen
        g.drawRect(150, 250, 20, 30);
        g.drawString("IE", 155, 265);

        // Island nordwestlich von Vereinigtes Königreich zeichnen
        g.drawRect(50, 150, 20, 20);
        g.drawString("IS", 55, 160);

        // Vereinigte Staaten westlich von Irland zeichnen
        g.drawRect(50, 250, 150, 100);
        g.drawString("US", 100, 300);

        // Russland östlich von Ukraine zeichnen
        g.drawRect(570, 250, 150, 200);
        g.drawString("RU", 635, 350);

        // Belarus östlich von Polen zeichnen
        g.drawRect(490, 350, 30, 50);
        g.drawString("BY", 495, 375);

        // Kanada nordwestlich von Vereinigte Staaten zeichnen
        g.drawRect(50, 100, 150, 100);
        g.drawString("CA", 110, 150);

        // Rumänien südlich von Ukraine zeichnen
        g.drawRect(490, 400, 40, 50);
        g.drawString("RO", 505, 425);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("World Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new WorldMap());
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
