package com.geoproject;

import com.geoproject.libraries.*;

public class Player {
    public int playerMoney;
    
    public int[][] countryValues = new int[68][9];
    public int[][] eventValues = new int[50][2]; //NUR BEISPIELHAFT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public int[] ownedCountries;

    public Player(int defaultCountry) {
        countryValues[defaultCountry][0] = 1;
    }
    
    public String getPossession() {
        StringBuilder result = new StringBuilder();

        result.append("owned countries:  ");
        for (int i = 0; i < countryValues.length; i++) {
            if (countryValues[i][0] == 1) {
                if (i < CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]);
                } else {
                    result.append("no countryname: ").append(i);
                }
                result.append(", ");
            }
        }
        return result.toString().trim();
    }

    public String getLevels() {
        StringBuilder result = new StringBuilder();

        result.append("Country Levels:\n");
        for (int i = 0; i < countryValues.length; i++) {
            if (countryValues[i][0] == 1) { // Überprüfen, ob das Land dem Spieler gehört
                if (i < CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]).append(": ");
                } else {
                    result.append("no countryname: ").append(i);
                }
                for (int j = 1; j < countryValues[i].length; j++) {
                    if (j - 1 < CountryLibrary.statNames.length) {
                        result.append(CountryLibrary.statNames[j - 1][1]).append(": ").append(countryValues[i][j]);
                    } else {
                        result.append("no Statname: ").append(j).append(": ").append(countryValues[i][j]);
                    }
                    result.append(", ");
                }
                result.append("\n");
            }
        }
        return result.toString().trim();
    }
}
