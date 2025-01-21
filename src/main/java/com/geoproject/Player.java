package com.geoproject;

//Speichert den Status aller Länder im Verhältnis zum Spieler.
//Author: Timo
//Version: 21/1/2025

public class Player {
    //2D array to store country information
    public int[][] countryStatus;

    //Reihenfolge: ID des Lands, gekauft von diesem Spieler?, Level Bergbau, Level LW, Level Prod., Level Maschinenbau, Level Tourismus, Level Energie
    //Für Eintrag 2 gilt: 0 = nicht gekauft, 1 = gekauft
    //Industrien starten auf Level 1, um Länder von Anfang an etwas profitabel zu machen und um evtl. Teilen durch 0 zu vermeiden (Eventkarten)
    public Player() {
        countryStatus = new int[][] {
            {1, 0, 1, 1, 1, 1, 1, 1},
            {2, 0, 1, 1, 1, 1, 1, 1},
            {3, 0, 1, 1, 1, 1, 1, 1},
            {4, 0, 1, 1, 1, 1, 1, 1},
            {5, 0, 1, 1, 1, 1, 1, 1}
        };
    }

    public static void main(String[] args) {
    }
}