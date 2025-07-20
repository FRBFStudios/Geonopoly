package com.geoproject;

import com.geoproject.libraries.CountryLibrary;

import java.util.logging.Logger;

public class Game {
    private static final Logger logger = LogHandler.getLogger();

    public int currentPlayerValue = 1;

    public Player p1 = new Player(CountryLibrary.USA);
    public Player p2 = new Player(CountryLibrary.RUS);

    public Player currentPlayer;
    public Player otherPlayer;
    public int [] AllOwnedCountries = new int[p1.countryValues.length];

    public Game() {
        currentPlayer = p1;
        otherPlayer = p2;
    }

    public void finishTurn() {
        currentPlayer.playerMoney += calculateRoundProfit();
        currentPlayer.playerMoney -= calculateRoundExpenses();

        switchPlayer();

        logger.info("Turn finished successfully.");
    }

    public int calculateRoundProfit() {
        int roundProfit = 0;

        logger.info("Calculating round profits for player " + currentPlayerValue);

        for (int countryID = 0; countryID < currentPlayer.ownedCountries.length; countryID++) {
            if (currentPlayer.ownedCountries[countryID] == 1) {
                roundProfit += calculateCountryProfits(countryID);
            }
        }
        logger.info("Total round profit calculated as " + roundProfit);
        return roundProfit;
    }

    public int calculateCountryProfits(int countryID) {
        int countryProfits = 0;

        for (int industryID = 0; (industryID < CountryLibrary.statNames.length - 1); industryID++) {
            countryProfits += calculateIndustryOfCountryProfits(countryID, industryID);
        }

        return countryProfits;
    }

    public int calculateIndustryOfCountryProfits(int countryID, int industryID) {
        return (CountryLibrary.countryData[countryID][2] / 5000) *
                ((CountryLibrary.statsMultiplier[countryID][industryID] * currentPlayer.countryValues[countryID][industryID+1]) / 10);

    }

    public int calculateRoundExpenses() {
        int roundExpenses = 0;

        logger.info("Calculating round expenses for player " + currentPlayerValue);

        for (int countryID = 0; countryID < currentPlayer.ownedCountries.length; countryID++) {
            if (currentPlayer.ownedCountries[countryID] == 1) {
                roundExpenses += CountryLibrary.getCountryExpenses(countryID);
            }
        }
        logger.info("Total round expenses calculated as " + roundExpenses);
        return roundExpenses;
    }

    public int getIndustryUpgradeCost(int countryID, int industryID) {
        return 100 + (100 * (currentPlayer.countryValues[countryID][industryID+1]));
    }

    public void switchPlayer() {
        logger.info("Switching player from " + currentPlayerValue);
        currentPlayerValue = (currentPlayerValue == 1) ? 2 : 1;
        logger.info("currentPlayerValue is now set to " + currentPlayerValue);

        currentPlayer = (currentPlayerValue == 1) ? p1 : p2;
        otherPlayer = (currentPlayerValue == 1) ? p2 : p1;
    }

    public String tryBuyingCountryAndReturnStatus(int countryID) {
        if (currentPlayer.neighborCountries[countryID] == 1) {
            if (AllOwnedCountries[countryID] == 0) {
                int countryPrice = CountryLibrary.getCountryPrice(countryID);

                if (canAfford(countryPrice)) {
                    currentPlayer.playerMoney -= countryPrice;

                    currentPlayer.countryValues[countryID][0] = 1;
                    // System.out.println("You bought " + CountryLibrary.countryNames[countryID] + " for " + CountryLibrary.getCountryPrice(countryID) + "$.");
                    return "OK";
                } else {
                    return "You can't afford to buy this country!";
                }

            } else {
                return "This country already belongs to the other player!";
            }

        } else {
            return "You don't share a border with this country!";
        }
    }

    public String tryBuyingIndustryAndReturnStatus(int countryID, int industryID) {
        if (currentPlayer.ownedCountries[countryID] == 1) {
            int industryUpgradeCost = getIndustryUpgradeCost(countryID, industryID);

            if (canAfford(industryUpgradeCost)) {
                currentPlayer.playerMoney -= industryUpgradeCost;

                currentPlayer.countryValues[countryID][industryID + 1]++;
                return "OK";

            } else {
                return "You can't afford to upgrade this industry!";
            }

        } else {
            return "You need to buy this country first!";
        }
    }

    public boolean canAfford(int amount) {
        logger.info("Calculating affordability of " + amount + "$");
        boolean canAfford = currentPlayer.playerMoney >= amount;
        logger.info("Calculated " + canAfford + ", returning");
        return canAfford;

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