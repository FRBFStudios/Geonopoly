package com.geoproject;

//Verknüpft Daten aus allen Klassen und liefert Updates an die GUI.
//Authors: Theodor, Timo
//Version: 21/1/2025

public class Game {
    int currentPlayerValue = 1;

    public Spieler spieler1 = new Spieler();
    public Spieler spieler2 = new Spieler();
    public Spieler currentSpieler;
    public Spieler otherSpieler;

    public Game(){
        currentPayer = p1;
        otherPlayer = p2;
    }
    
    public void switchSpieler(){
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
        currentSpieler = (currentPlayer == 1) ? spieler1 : spieler2;
        otherSpieler = (currentPlayer == 1) ? spieler2 : spieler1;
    }
}






























