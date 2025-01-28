package com.geoproject;

import com.geoproject.libraries.*;

public class Player {
    public int playerMoney = 1000;
    
    public int[][] countryValues = new int[33][8];
    public int[][] eventValues = new int[50][2]; //NUR BEISPIELHAFT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    public Player(int defaultCountry) {
        countryValues[defaultCountry][0] = 1;
    }
    
    //Das hier muss kommentiert werden
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
            if (countryValues[i][0] == 1) {
                if (i < CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]).append(": ");
                } else {
                    result.append("no countryname: ").append(i);
                }
                for (int j = 1; j < countryValues[i].length; j++) {
                    if (j < CountryLibrary.statNames.length) {
                        result.append(CountryLibrary.statNames[j][1]).append(": ").append(countryValues[i][j]);
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
