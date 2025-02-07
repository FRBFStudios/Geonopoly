package com.geoproject.libraries;

//Informationen über die Länder
//Autor: Theodor
//Version: 7/2/2025

public class CountryLibrary
{
    //Beinhält die Grenzländer aller Länder (muss komplett neu ausgefüllt werden)
    public static int[][] borders = new int[][] {
        {1, 2, 4, 5, 6},//Deutschland = 0
        {0, 4, 7},//BeNeLux = 1
        {0, 8, 32},//Dänemark = 2
        {0, 5, 9, 11, 12, 13},//Polen = 3
        {0, 1, 6, 7, 14, 25, 29, 47},//Frankreich = 4
        {0, 3, 6, 11},//Tschechien = 5
        {0, 4, 5, 11, 14, 15, 16},//AU & SWI = 6
        {1, 4, 19, 36, 37},//UK = 7
        {2, 10, 38},//Skandinavien = 8
        {3, 10, 12, 38},//Baltikum = 9
        {8, 9, 38},//Finnland = 10
        {3, 5, 6, 13, 16},//Slowakei = 11
        {3, 9, 13, 38},//Belarus = 12
        {3, 11, 12, 17, 38, 39},//Ukraine = 13
        {4, 6, 15, 47},//Italien = 14
        {6, 14, 16, 18},//Balkan = 15
        {6, 11, 13, 15, 17, 18},//Ungarn = 16
        {13, 16, 18, 51},//Romänien = 17
        {15, 16, 17, 51},//Griechenland = 18
        {7, 20, 21, 37, 38, 64},//USA = 19
        {19, 32},//Kanada = 20
        {19, 22, 47, 64},//Mexiko = 21
        {21, 23, 47},//Mittelamerika = 22
        {22, 24, 25, 26, 27},//Kolumbien = 23
        {23, 25, 28, 64},//Venezuela = 24
        {4, 23, 24, 27, 28, 29, 30, 33, 34, 35, 47},//Brasilien = 25
        {23, 27},//Ecuador = 26
        {23, 25, 26, 33, 31},//Peru = 27
        {24, 25, 29},//Guyana = 28
        {4, 25, 28},//Suriname = 29
        {31, 33, 34, 35},//Argentinien = 30
        {27, 30, 33},//Chile = 31
        {2, 20, 36},//Grönland = 32
        {25, 27, 30, 31, 34},//Bolivien = 33
        {25, 30, 33},//Paraguay = 34
        {25, 30},//Uruguay = 35
        {7, 32, 37},//Island = 36
        {7, 19, 36},//Irland = 37
        {8, 9, 10, 12, 13, 20, 39, 50, 54, 66, 67},//Russland = 38
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

    //Array, der die Namen der Länder beinhält. HOCHGRADIG SENSITIV! NICHT ÄNDERN!
    public static String[] countryNames = new String[] {"Deutschland", "BeNeLux-Ländergruppe", "Dänemark", "Polen", "Frankreich und Monaco",
        "Tschechien", "Österreich, Liechtenstein und Schweiz", "Vereinigtes Königreich", "Skandinavische Ländergruppe", "Baltikum", "Finnland",
        "Slowakei", "Belarus", "Ukraine und Moldavien", "Italien", "Balkanländergruppe", "Ungarn", "Romänien", "Griechenland und Nordmazedonien",
        "Vereinigte Staaten", "Kanada", "Mexiko", "Mittelamerikanische Ländergruppe", "Kolumbien", "Venezuela", "Brasilien", "Ecuador",
        "Peru", "Guyana", "Suriname", "Argentinien", "Chile", "Grönland", "Bolivien", "Paraguay", "Uruguay", "Island", "Irland", "Russland",
        "Türkei und Zypern", "Syrien", "Jordanien", "Israel und Palästina", "Beirut", "Erweitertes Saudi-Arabien", "Jemen", "Oman", "Länder der Iberischen Halbinsel",
        "VAE und Katar", "Irak", "Georgien, Armenien und Aserbaidschan", "Bulgarien", "Iran", "Pakistan", "Kasachstan", "Usbekistan", "Turkmenistan",
        "Tadschikistan", "Afghanistan", "Kirgistan", "Indien", "Burma", "Bangladesch", "Nepal", "Kuba und Karibische Ländergruppe", "Sri Lanka", "Mongolei", "China"};

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
