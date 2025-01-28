package com.geoproject;

//Verknüpft Daten aus allen Klassen und liefert Updates an die GUI.

import com.geoproject.libraries.CountryLibrary;

//Authors: Theodor, Timo
//Version: 28/1/2025

public class Game {
    public int currentPlayerValue = 1;

    //P1 kriegt USA
    public Player p1 = new Player(19);
    //P2 kriegt Russland
    public Player p2 = new Player(20);
    public Player currentPlayer;
    public Player otherPlayer;

    public Game(){
        currentPlayer = p1;
        otherPlayer = p2;
    }
    
    public void switchPlayer() {
        currentPlayerValue = (currentPlayerValue == 1) ? 2 : 1;
        currentPlayer = (currentPlayerValue == 1) ? p1 : p2;
        otherPlayer = (currentPlayerValue == 1) ? p2 : p1;
    }

    //Methode, die checkt, ob ein Land vom derzeitigen Spieler kaufbar ist (UNFERTIG)
    public boolean isBuyable(int activePlayer, int countryID) {
        boolean isBuyable = true;
        for (int country = 0; country < CountryLibrary.borders.length; country++) {
        }
        return isBuyable;
    }
}






























