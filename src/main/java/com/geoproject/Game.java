package com.geoproject;

//Verknüpft Daten aus allen Klassen und liefert Updates an die GUI.
//Authors: Theodor, Timo
//Version: 21/1/2025

public class Game {
    public int currentPlayerValue = 1;

    public Player p1 = new Player();
    public Player p2 = new Player();
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
}






























