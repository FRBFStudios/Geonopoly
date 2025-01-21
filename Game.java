public class Game
{
    int currentPlayer = 1;

    public Spieler spieler1 = new Spieler();
    public Spieler spieler2 = new Spieler();
    public Spieler currentSpieler;
    public Spieler otherSpieler;

    public Game(){
        currentSpieler = spieler1;
        otherSpieler = spieler2;
    }
    
    public void currentSpielerAktualisieren(){
        currentSpieler = (currentPlayer == 1) ? spieler1 : spieler2;
        otherSpieler = (currentPlayer == 1) ? spieler2 : spieler1;
    }
}






























