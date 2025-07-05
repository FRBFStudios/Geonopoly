package com.geoproject;

//Verknüpft Daten aus allen Klassen und liefert Updates an die GUI.

import com.geoproject.libraries.CountryLibrary;

import java.util.logging.Logger;

//Authors: Theodor, Timo
//Version: 6/5/2025

public class Game {
    private static final Logger logger = LogHandler.getLogger();

    public int currentPlayerValue = 1;

    //P1 kriegt USA
    public Player p1 = new Player(0);
    //P2 kriegt Russland
    public Player p2 = new Player(4);
    public Player currentPlayer;
    public Player otherPlayer;
    public int [] AllOwnedCountries = new int[p1.countryValues.length];

    public Game() {
        currentPlayer = p1;
        otherPlayer = p2;
    }

    public void finishTurn() {

        int roundProfit = 0;

        logger.info("Calculating round profits for player " + currentPlayerValue);
        // Iteriert durch alle Länder, die der derzeitige Spieler
        for (int countryID = 0; countryID < currentPlayer.ownedCountries.length; countryID++) {
            if (currentPlayer.ownedCountries[countryID] == 1) {
                for (int industryID = 0; industryID < 5; industryID++) {
                    // BIP * ((Stat Multiplier * Industrielevel) / 10)
                    logger.info("Calculating profit and expenses of countryID " + countryID + " on industryID " + industryID);
                    int countryProfit = CountryLibrary.countryData[countryID][2] * ((CountryLibrary.statsMultiplier[countryID][industryID] * currentPlayer.countryValues[countryID][industryID]) / 10);
                    logger.info("Profit calculated as " + countryProfit + ", adding to roundProfit");
                    roundProfit += countryProfit;

                    roundProfit -= CountryLibrary.getCountryExpenses(countryID);
                }
            }
        }
        logger.info("Total round profit calculated as " + roundProfit);
        if (roundProfit <= 0) {
            logger.info("Round profit set to 0 due to too high expenses");
            roundProfit = 0;
        }

        currentPlayer.playerMoney += roundProfit;

        switchPlayer();
        logger.info("Turn finished successfully.");
    }

    public int getIndustryUpgradeCost(int countryID, int industryID) {
        logger.info("Calculating industryUpgradeCost for countryID " + countryID + " on industryID " + industryID);

        int industryUpgradeCost = 100 + (100 * currentPlayer.countryValues[countryID][industryID]);
        logger.info("Calculated " + industryUpgradeCost + "$, returning");
        return industryUpgradeCost;
    }

    public void switchPlayer() {
        logger.info("Switching player from " + currentPlayerValue);
        currentPlayerValue = (currentPlayerValue == 1) ? 2 : 1;
        logger.info("currentPlayerValue is now set to " + currentPlayerValue);

        currentPlayer = (currentPlayerValue == 1) ? p1 : p2;
        otherPlayer = (currentPlayerValue == 1) ? p2 : p1;
    }

    public void subtractMoney(int amount) {
        logger.info("Subtracting " + amount + "$ from playerMoney.");
        currentPlayer.playerMoney -= amount;
        logger.info("Remaining playerMoney: " + currentPlayer.playerMoney);
    }

    public boolean canAfford(int amount) {
        logger.info("Calculating affordability of " + amount + "$");
        boolean canAfford = currentPlayer.playerMoney >= amount;
        logger.info("Calculated " + canAfford + ", returning");
        return canAfford;
    }

    public boolean buyCountry(int countryID) {
        if (currentPlayer.neighborCountries[countryID] == 1 && AllOwnedCountries[countryID] == 0) {
            subtractMoney(CountryLibrary.getCountryPrice(countryID));
            currentPlayer.countryValues[countryID][0] = 1;
            System.out.println("You bought " + CountryLibrary.countryNames[countryID] + " for " + CountryLibrary.getCountryPrice(countryID) + "$.");
            return true;
        }
        else {
            return false;
        }
    }

    public void buyStat(int countryID, int statID) {
        //Todo
    }

    public void updateCountryInfos() {
        p1.updateCountryInfosPlayer(AllOwnedCountries);
        p2.updateCountryInfosPlayer(AllOwnedCountries);

        for (int i = 0; i < p1.ownedCountries.length; i++) {
            if (p1.ownedCountries[i] == 1) {
                AllOwnedCountries[i] = 1;
            }
            if (p2.ownedCountries[i] == 1) {
                AllOwnedCountries[i] = 1;
            }
            if (p1.ownedCountries[i] == 0 && p2.ownedCountries[i] == 0) {
                AllOwnedCountries[i] = 0;
            }
        }
    }
}































