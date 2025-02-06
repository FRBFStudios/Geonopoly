package com.geoproject.libraries;

//Welche Länder grenzen an welche?
//Author: Theodor
//Version: 21/1/2025

public class CountryLibrary
{
    //Beinhält die Grenzländer aller Länder (muss komplett neu ausgefüllt werden)
    public static int[][] borders = new int[][] {
        {1, 2, 4, 5, 6, 7},//Deutschland - 0
        {0, 2, 5, 8},//BeNeLux - 1
        {0, 1, 4, 9, 19, 23},//Dänemark - 2
        {0, 2, 6, 10, 12, 13},//Polen - 3
        {0, 1, 7, 8, 14, 15},//Frankreich - 4
        {0, 3, 7, 12},//Tschechien - 5
        {0, 4, 6, 12, 16, 17},//Schweiz & Österreich - 6
        {1, 4, 18, 19, 20},//Vereinigtes Königreich - 7
        {2, 3, 10, 11, 21},//Skandinavien [Norwegen und Schweden] - 8
        {3, 8, 11, 21, 22},//Baltikum - 9
        {8, 9, 21},//Finnland - 10
        {3, 5, 7, 13, 17},//Slowakei - 11
        {},//Belarus - 12
        {2, 11, 17, 21, 22, 24},//Ukraine - 13
    };

    public static int statsUpgradeCosts = 100; //Kosten für das Upgraden der Stats

    public static int getCountryPrice(int countryID) {
        int price = 0;
        return price;
    }

    //Beinhält die StatsMultiplier der Industrien
	public static int[][] statsMultiplier = new int[][] {
        {1, 1, 1, 1, 1, 1, 1},//DE
        {1, 1, 1, 1, 1, 1, 1},//BENELUX
        {1, 1, 1, 1, 1, 1, 1},//DEN
        {1, 1, 1, 1, 1, 1, 1},//POL
        {1, 1, 1, 1, 1, 1, 1},//FRA
        {1, 1, 1, 1, 1, 1, 1},//CZE
        {1, 1, 1, 1, 1, 1, 1},//SWI/AU
        {1, 1, 1, 1, 1, 1, 1},//UK
        {1, 1, 1, 1, 1, 1, 1},//SCAN
        {1, 1, 1, 1, 1, 1, 1},//BALT
        {1, 1, 1, 1, 1, 1, 1},//FIN
        {1, 1, 1, 1, 1, 1, 1},//SLOVA
        {1, 1, 1, 1, 1, 1, 1},//UKR
        {1, 1, 1, 1, 1, 1, 1},//SPA
        {1, 1, 1, 1, 1, 1, 1},//ITA
        {1, 1, 1, 1, 1, 1, 1},//SLO
        {1, 1, 1, 1, 1, 1, 1},//HUN
        {1, 1, 1, 1, 1, 1, 1},//IRE
        {1, 1, 1, 1, 1, 1, 1},//ICE
        {1, 1, 1, 1, 1, 1, 1},//USA
        {1, 1, 1, 1, 1, 1, 1},//RUS
        {1, 1, 1, 1, 1, 1, 1},//BEL
        {1, 1, 1, 1, 1, 1, 1},//CAN
        {1, 1, 1, 1, 1, 1, 1},//ROM
	};

    //Array, der die Namen der Länder beinhält
    public static String[] countryNames = new String[] {"Deutschland", "BeNeLux-Ländergruppe", "Dänemark", "Polen", "Frankreich",
            "Tschechien", "Österreich und Schweiz", "Vereinigtes Königreich", "Skandinavische Ländergruppe", "Baltikum", "Finnland",
            "Slowakei", "Belarus", "Ukraine", "Italien", "Balkanländergruppe", "Ungarn", "Romänien", "Griechenland und Makedonien",
            "Vereinigte Staaten", "Kanada", "Mexiko", "Mittelamerikanische Ländergruppe", "Kolumbien", "Venezuela", "Brasilien", "Ecuador",
            "Peru", "Guyana", "Suriname", "Argentinien", "Chile", "Grönland", "Bolivien", "Paraguay", "Uruguay", "Island", "Irland", "Russland",
            "Türkei", "Syrien", "Jordanien", "Israel und Palästina", "Beirut", "Saudi-Arabien", "Jemen", "Oman", "Spanien", "VAE und Katar",
            "Irak", "Georgien, Armenien und Aserbaidschan", "Bulgarien", "Iran", "Pakistan", "Kasachstan", "Usbekistan", "Turkmenistan",
            "Tadschikistan", "Afghanistan", "Kirgistan", "Indien", "Burma", "Bangladesch", "Nepal", "Kuba", "Sri Lanka", "Mongolei", "China"};

    //Listet alle Industrietypen
    public static String[][] statNames = new String[][] {
        {"Bergbau", "BB"},
        {"Landwirtschaft", "LW"},
        {"Warenproduktion", "WP"},
        {"Maschinenbau", "MB"},
        {"Tourismus", "T"},
        {"Energie", "E"},
        {"Wissenschaft", "W"}
    };
}
