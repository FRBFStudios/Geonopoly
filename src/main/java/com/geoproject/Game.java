package com.geoproject;

import com.geoproject.libraries.CountryLibrary;

import java.util.logging.Logger;

public class Game {
    private static final Logger logger = LogHandler.getLogger();

    public int currentPlayerValue = 1;

    public Player p1 = new Player(CountryLibrary.USA, 1000);
    public Player p2 = new Player(CountryLibrary.RUS, 1000);

    public Player currentPlayer;
    public Player otherPlayer;

    public int [] allOwnedCountries = new int[p1.countryValues.length];

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
            if (currentPlayer.ownedCountries[countryID] == Player.OWNED) {
                roundProfit += calculateCountryProfits(countryID);
            }
        }

        logger.info("Total round profit calculated as " + roundProfit);
        return roundProfit;
    }

    public int calculateCountryProfits(int countryID) {
        int countryProfits = 0;

        for (int industryID = 0; (industryID < CountryLibrary.industryNames.length - 1); industryID++) {
            countryProfits += calculateIndustryOfCountryProfits(countryID, industryID);
        }

        return countryProfits;
    }

    public int calculateIndustryOfCountryProfits(int countryID, int industryID) {
        return (CountryLibrary.countryData[countryID][CountryLibrary.GDP] / 5000) *
                ((CountryLibrary.industryProfitMultipliers[countryID][industryID] * currentPlayer.countryValues[countryID][industryID+1]) / 10);
    }

    public int calculateRoundExpenses() {
        int roundExpenses = 0;

        logger.info("Calculating round expenses for player " + currentPlayerValue);

        for (int countryID = 0; countryID < currentPlayer.ownedCountries.length; countryID++) {
            if (currentPlayer.ownedCountries[countryID] == Player.OWNED) {
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
        if (currentPlayer.neighborCountries[countryID] == Player.NEIGHBORING) {
            if (allOwnedCountries[countryID] == Player.NOT_OWNED) {
                int countryPrice = CountryLibrary.getCountryPrice(countryID);

                if (canAfford(countryPrice)) {
                    currentPlayer.playerMoney -= countryPrice;
                    currentPlayer.countryValues[countryID][0] = Player.OWNED;

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

    public String tryUpgradingIndustryAndReturnStatus(int countryID, int industryID) {
        if (currentPlayer.ownedCountries[countryID] == Player.OWNED) {
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
        return currentPlayer.playerMoney >= amount;
    }

    public void updateCountryInfos() {
        p1.updatePlayerCountryInfos(allOwnedCountries);
        p2.updatePlayerCountryInfos(allOwnedCountries);

        for (int countryIndex = 0; countryIndex < p1.ownedCountries.length; countryIndex++) {
            if (p1.ownedCountries[countryIndex] == Player.OWNED) {
                allOwnedCountries[countryIndex] = Player.OWNED;
            }
            if (p2.ownedCountries[countryIndex] == Player.OWNED) {
                allOwnedCountries[countryIndex] = Player.OWNED;
            }
            if (p1.ownedCountries[countryIndex] == 0 && p2.ownedCountries[countryIndex] == Player.NOT_OWNED) {
                allOwnedCountries[countryIndex] = Player.NOT_OWNED;
            }
        }
    }
}