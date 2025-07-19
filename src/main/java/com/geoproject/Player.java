package com.geoproject;

import com.geoproject.libraries.CountryLibrary;

import java.util.logging.Logger;

public class Player {
    private static final Logger logger = LogHandler.getLogger();
    public int playerMoney = 1000;

    public int[][] countryValues = new int[CountryLibrary.countryShortNames.length][9];
    public int[][] eventValues = new int[50][2]; //NUR BEISPIELHAFT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public int[] neighborCountries = new int[countryValues.length];
    public int[] actualNeighborCountries = new int[countryValues.length];
    public int[] ownedCountries = new int[countryValues.length];
    
    public int[] AllOwnedCountries;

    public Player(int defaultCountry) {
        countryValues[defaultCountry][0] = 1;
    }

    public String getPossession() {
        logger.info("Getting player possession");

        StringBuilder result = new StringBuilder();

        result.append("Owned countries:  ");

        for (int i = 0; i < countryValues.length; i++) {
            if (countryValues[i][0] == 1) {
                if (i < CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]);
                } else {
                    result.append("No country name for countryID ").append(i);
                }
                result.append(", ");
            }
        }
        return result.toString().trim();
    }

    public String getLevels() {
        logger.info("Getting industry levels");
        StringBuilder result = new StringBuilder();

        result.append("Country Levels:\n");
        for (int i = 0; i < countryValues.length; i++) {
            if (countryValues[i][0] == 1) { // Überprüfen, ob das Land dem Spieler gehört
                if (i < CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]).append(": ");
                } else {
                    result.append("No country name for countryID ").append(i);
                }
                for (int j = 1; j < countryValues[i].length; j++) {
                    if (j - 1 < CountryLibrary.statNames.length) {
                        result.append(CountryLibrary.statNames[j - 1][1]).append(": ").append(countryValues[i][j]);
                    } else {
                        result.append("No stat name for statID ").append(j).append(": ").append(countryValues[i][j]);
                    }
                    result.append(", ");
                }
                result.append("\n");
            }
        }
        return result.toString().trim();
    }

    public void updateCountryInfosPlayer(int[] AllOwned) {
        AllOwnedCountries = AllOwned;
        for (int i = 0; i < countryValues.length; i++) {
            ownedCountries[i] = 0;
            neighborCountries[i] = 0;
            actualNeighborCountries[i] = 0;
        }
        for (int i = 0; i < countryValues.length; i++) {
            if (countryValues[i][0] == 1) { // Überprüfen, ob das Land dem Spieler gehört
                ownedCountries[i] = 1; // Markiere Land als besessen
                for (int neighbor : CountryLibrary.borders[i]) {
                    neighborCountries[neighbor] = 1; // Markiere Nachbarland als benachbart
                }
            }
        }
        for (int i = 0; i < countryValues.length; i++) {
            if (ownedCountries[i] == 1) {
                neighborCountries[i] = 0; // Markiere Nachbarland als benachbart
            }
        }
        for (int i = 0; i < countryValues.length; i++) {
            if (neighborCountries[i] == 1 && AllOwnedCountries[i] == 0) {
                actualNeighborCountries[i] = 1; // Markiere Nachbarland als tatsächlich benachbart
            }
        }
    }
}
