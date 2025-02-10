package com.geoproject.libraries;

//Welche Länder grenzen an welche?
//Author: Theodor
//Version: 21/1/2025

public class CountryLibrary
{
    
    public static int[][] borders = new int[][] {
        {2, 3, 4, 5, 6, 7},//DE - 1
        {1, 3, 5, 8, 0, 0},//BENELUX - 2
        {1, 2, 4, 9, 19, 23},//DEN - 3
        {1, 3, 6, 10, 12, 13},//POL - 4
        {1, 2, 7, 8, 14, 15},//FRA - 5
        {1, 4, 7, 12, 0, 0},//CZE - 6
        {1, 5, 6, 12, 16, 17},//SWI/AU - 7
        {2, 5, 18, 19, 20, 0},//UK - 8
        {3, 4, 10, 11, 21, 0},//SCAN - 9
        {4, 9, 11, 21, 22, 0},//BALT - 10
        {9, 10, 21, 0, 0, 0},//FIN - 11
        {4, 6, 7, 13, 17, 0},//SLOVA - 12
        {4, 12, 17, 21, 22, 24},//UKR - 13
        {0, 0, 0, 0, 0, 0},//SPA - 14
        {0, 0, 0, 0, 0, 0},//ITA - 15
        {0, 0, 0, 0, 0, 0},//SLO - 16
        {0, 0, 0, 0, 0, 0},//HUN - 17
        {0, 0, 0, 0, 0, 0},//IRE - 18
        {0, 0, 0, 0, 0, 0},//ICE - 19
        {0, 0, 0, 0, 0, 0},//USA - 20
        {0, 0, 0, 0, 0, 0},//RUS - 21
        {0, 0, 0, 0, 0, 0},//BEL - 22
        {0, 0, 0, 0, 0, 0},//CAN - 23
        {0, 0, 0, 0, 0, 0},//ROM - 24
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
        {0, 0, 0, 0, 0, 0},//
    };

    
    public static int statsUpgradeCosts = 100; //Kosten für das Upgraden der Stats

    
    public static int[] countryPrice = new int[] //Bitte ausfüllen
        {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};

    
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
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 1},
	};  //bitte Vervollständigen (werte von 1 bis 5 wären wahrscheinlich sinnvoll)!

    
    //Array, der die Namen der Länder beinhält
    public static String[] countryNames = new String[] {"Deutschland", "BeNeLux", "Dänemark", "Polen", "Frankreich",
        "Tschechien", "Österreich & Schweiz", "Vereinigtes Königreich", "Skandinavische Ländergruppe", "Baltikum", "Finnland",
        "Slowakei", "Belarus", "Ukraine", "Italien", "Balkanländergruppe", "Ungarn", "Romänien", "Griechenland & Makedonien",
        "Vereinigte Staaten", "Kanada", "Mexiko", "Mittelamerikanische Ländergruppe", "Kolumbien", "Venezuela", "Brasilien", "Ecuador",
        "Peru", "Guyana", "Suriname", "Argentinien", "Chile", "Grönland", "Bolivien", "Paraguay", "Uruguay", "Island", "Irland", "Russland",
        "Türkei", "Syrien", "Jordanien", "Israel & Palästina", "Beirut", "Saudi-Arabien", "Jemen", "Oman", "Spanien", "VAE & Katar",
        "Irak", "Georgien, Armenien & Aserbaidschan", "Bulgarien", "Iran", "Pakistan", "Kasachstan", "Usbekistan", "Turkmenistan",
        "Tadschikistan", "Afghanistan", "Kirgistan", "Indien", "Burma", "Bangladesch", "Nepal", "Kuba", "Sri Lanka", "Mongolei", "China"
    };

    //Wichtig!!!!! bitte beim compilen übernehmen
    public static String[] countryShortNames = new String[] {"DE", "BNL", "DEN", "POL", "FRA", "CZE", "SWI/AU", "UK", "SCAN", "BALT", "FIN", "SLOVA", "UKR", "SPA", "ITA", "BALK", "HUN", "ROM", "GRE/MAK", "USA", "CAN", "MEX", "MIDAM", "COL", "VEN", "BRA", "ECU", "PER", "GUY", "SUR", "ARG", "CHI", "GRO", "BOL", "PAR", "URU", "ICE", "IRE", "RUS", "TUR", "SYR", "JOR", "ISR/PAL", "BEI", "SAU", "YEM", "OMA", "SPA", "VAE/QAT", "IRA", "GEO/ARM/AZE", "BUL", "IRN", "PAK", "KAZ", "UZB", "TKM", "TAD", "AFG", "KIR", "IND", "BUR", "BAN", "NEP", "CUB", "SRI", "MON", "CHI"};
    
    public static String[][] statNames = new String[][] {
        {"Bergbau", "Bb"},
        {"Landwirtschaft", "Lw"},
        {"Warenproduktion", "Wp"},
        {"Maschinenbau", "Mb"},
        {"Tourismus", "T"},
        {"Energie", "E"},
        {"Wissenschaft", "W"}
    };
}
