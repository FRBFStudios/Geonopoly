package com.geoproject;

import com.geoproject.libraries.CountryLibrary;

public class Player
{
    public int playerMoney;
    
    public int[][] werte = new int[33][6];
    /*
    
    // IDs der Länder
    const int DE = 0;
    const int CHINA = 1;
    const int CHILE = 2;
    const int USA = 3;

    // Nummern der gefragten Werte
    const int BESITZT = 0;
    const int EDELSTEIN_LEVEL = 1;
    const int WALD_LEVEL = 2;
    const int INDUSTRIE_LEVEL = 3;
    const int LANDWIRTSCHAFT_LEVEL = 4;

    // Beispiel für das Setzen von Werten
    werte[DE][BESITZT] = 0;
    werte[DE][EDELSTEIN_LEVEL] = 0;
    */
    
    public Player(){
        playerMoney = 1000;
    }
    
    public String getBesitz() {
        StringBuilder result = new StringBuilder();

        result.append("Länder in Besitz:  ");
        for (int i = 0; i < werte.length; i++) {
            if (werte[i][0] == 1) {
                if (i <= CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]);
                }
                else {
                    result.append("Landname nicht hinterlegt: ").append(i);
                }
                result.append(", ");
            }
        }
        return result.toString().trim();
    }


    public String getLevels() {
        StringBuilder result = new StringBuilder();

        result.append("Country Levels:\n");
        for (int i = 0; i < werte.length; i++) {
            if (werte[i][0] == 1) {
                if (i <= CountryLibrary.countryNames.length) {
                    result.append(CountryLibrary.countryNames[i]).append(": ");
                }
                else {
                    result.append("Landname nicht hinterlegt: ").append(i);
                }
                for (int j = 1; j < werte[i].length; j++) {
                    
                        if (j <= CountryLibrary.StatNames.length) {
                            result.append(CountryLibrary.StatNames[j][1]).append(": ").append(werte[i][j]);
                        }
                        else {
                            result.append("Statname nicht hinterlegt: ").append(j).append(": ").append(werte[i][j]);
                        }
                    
                    result.append(", ");
                }
                result.append("\n");
            }
        }
        return result.toString().trim();
    }
    



    /*public String getBesitz() {
     * 

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
