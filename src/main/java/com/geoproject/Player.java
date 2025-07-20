package com.geoproject;

import com.geoproject.libraries.CountryLibrary;

public class Player {
    public int playerMoney;

    public static final int OWNED = 1, NOT_OWNED = 0, NEIGHBORING = 1, NOT_NEIGHBORING = 0;

    public int[][] countryValues = new int[CountryLibrary.countryShortNames.length][9];
    public int[][] eventValues = new int[50][2]; // Events aren't implemented yet, this is a placeholder

    public int[] neighborCountries = new int[countryValues.length];
    public int[] actualNeighborCountries = new int[countryValues.length];

    public int[] ownedCountries = new int[countryValues.length];
    
    public int[] allOwnedCountries;

    public Player (int defaultCountry, int startMoney) {
        countryValues[defaultCountry][0] = 1;
        playerMoney = startMoney;
    }
    
    public void updatePlayerCountryInfos(int[] allOwned) {
        allOwnedCountries = allOwned;

        for (int i = 0; i < countryValues.length; i++) {
            ownedCountries[i] = 0;
            neighborCountries[i] = 0;
            actualNeighborCountries[i] = 0;
        }

        for (int countryIndex = 0; countryIndex < countryValues.length; countryIndex++) {
            if (countryValues[countryIndex][0] == OWNED) {
                ownedCountries[countryIndex] = OWNED;

                for (int neighbor : CountryLibrary.borders[countryIndex]) {
                    neighborCountries[neighbor] = NEIGHBORING;
                }
            }
        }

        for (int countryIndex = 0; countryIndex < countryValues.length; countryIndex++) {
            if (ownedCountries[countryIndex] == OWNED) {
                neighborCountries[countryIndex] = NOT_NEIGHBORING;
            }
        }

        for (int countryIndex = 0; countryIndex < countryValues.length; countryIndex++) {
            if (neighborCountries[countryIndex] == 1 && allOwnedCountries[countryIndex] == 0) {
                actualNeighborCountries[countryIndex] = NEIGHBORING;
            }
        }
    }
}
