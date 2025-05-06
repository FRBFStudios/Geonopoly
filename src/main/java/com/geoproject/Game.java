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

    public void finishTurn ()
    {
        int roundProfit = 0;

        // Iteriert durch alle Länder, die der derzeitige Spieler
        for(int countryID : currentPlayer.ownedCountries)
        {
            for (int industryID = 0; industryID < 5; industryID++) {
                // BIP * ((Stat Multiplier * Industrielevel) / 10)
                roundProfit += CountryLibrary.countryData[countryID][2] * ((CountryLibrary.statsMultiplier[countryID][industryID] * currentPlayer.countryValues[countryID][industryID]) / 10);
                roundProfit -= CountryLibrary.getCountryExpenses(countryID);
            }
        }
        if (roundProfit <= 0)
        {
            roundProfit = 0;
        }
        currentPlayer.playerMoney += roundProfit;

        switchPlayer();
    }
    
    public void switchPlayer()
    {
        p1 = (currentPlayerValue == 1) ? currentPlayer : otherPlayer;
        p2 = (currentPlayerValue == 2) ? currentPlayer : otherPlayer;

        currentPlayerValue = (currentPlayerValue == 1) ? 2 : 1;

        currentPlayer = (currentPlayerValue == 1) ? p1 : p2;
        otherPlayer = (currentPlayerValue == 1) ? p2 : p1;
    }
}






























