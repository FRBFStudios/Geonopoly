package com.geoproject;

public class Player {
    public int playerMoney;
    
    public int[][] countryValues = new int[33][8];
    public int[][] eventValues = new int[50][2]; //NUR BEISPIELHAFT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    public Player(int defaultCountry) {
        countryValues[defaultCountry][0] = 1;
    }
    
    //Das hier muss optimiert und kommentiert werden
    //Außerdem funktioniert es nicht
    /*
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
    



    public String getBesitz() {
        StringBuilder result = new StringBuilder();

        result.append("Länder in Besitz:        ");

        result.append(besitzt_de == 1 ? "Deutschland     "   : "");
        result.append(besitzt_china == 1 ? "China     "   : "");
        result.append(besitzt_chile == 1 ? "Chile     "   : "");
        result.append(besitzt_usa == 1 ? "USA     "   : "");

        result.append("\nDeutschland:   ");

        if (deEdelsteinLevel != 0) result.append("Edelsteinlevel: ").append(deEdelsteinLevel).append("        ");
        if (deWaldLevel != 0) result.append("Waldlevel: ").append(deWaldLevel).append("        ");
        if (deIndustrieLevel != 0) result.append("Industrielevel: ").append(deIndustrieLevel).append("        ");
        if (deLandwirtschaftLevel != 0) result.append("Landwirtschaftslevel: ").append(deLandwirtschaftLevel);

        
        return result.toString().trim();
    }*/
}
