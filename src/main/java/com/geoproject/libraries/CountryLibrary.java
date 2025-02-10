package com.geoproject.libraries;

//Welche Länder grenzen an welche?
//Author: Theodor
//Version: 21/1/2025

public class CountryLibrary
{
    //nur von theo übernommen, nichts neues
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
        {8, 9, 10, 12, 13, 19, 39, 50, 54, 66, 67},//Russland = 38
        {13, 18, 38, 40, 49, 50, 51, 52},//Türkei = 39
        {39, 41, 42, 43, 49},//Syrien = 40
        {40, 42, 44, 49},//Jordanien = 41
        {40, 41, 43},//Israel und Palästina = 42
        {40, 42},//Beirut = 43
        {41, 45, 46, 48, 52},//Saudi-Arabien = 44
        {44, 46},//Jemen = 45
        {44, 45, 48},//Oman = 46
        {4, 14, 21, 22, 25},//Spanien = 47
        {44, 46, 52},//VAE = 48
        {39, 40, 41, 44, 52},//Irak = 49
        {38, 39, 52, 54, 56},//GeArAz = 50
        {17, 18, 39},//Bulgarien = 51
        {39, 44, 48, 49, 50, 53, 56, 58},//Iran = 52
        {52, 56, 58, 60, 67},//Pakistan = 53
        {38, 50, 55, 56, 59, 67},//Kasachstan = 54
        {54, 56, 57, 58, 59},//Usbekistan = 55
        {50, 52, 54, 55, 58},//Turkmenistan = 56
        {55, 58, 59, 67},//Tadschikistan = 57
        {52, 53, 55, 56, 57, 67},//Afghanistan = 58
        {54, 55, 57, 67},//Kirgisistan = 59
        {53, 61, 63, 62, 65, 67},//Indien = 60
        {60, 63, 62, 67},//Burma = 61
        {60, 61},//Bangladesch = 62
        {60, 61, 67},//Nepal = 63
        {19, 21, 24},//Kuba = 64
        {60},//Sri Lanka = 65
        {38, 67},//Mongolei = 66
        {38, 53, 54, 57, 58, 59, 60, 61, 63, 66},//China = 67
    };

    // NICHT WEGMACHEN!!!!!!!!!!
    // Borders mit country names, damit besser und übersichtlicher und schneller bei Mapdesign(anordnung ...)
    // DE = 0 // BNL, DEN, FRA, CZE, SWI/AU,
    // BNL = 1 // DE, FRA, UK,
    // DEN = 2 // DE, SCAN, GRO,
    // POL = 3 // DE, CZE, BALT, SLOVA, UKR, SPA,
    // FRA = 4 // DE, BNL, SWI/AU, UK, ITA, BRA, SUR, SPA,
    // CZE = 5 // DE, POL, SWI/AU, SLOVA,
    // SWI/AU = 6 // DE, FRA, CZE, SLOVA, ITA, BALK, HUN,
    // UK = 7 // BNL, FRA, USA, ICE, IRE,
    // SCAN = 8 // DEN, FIN, RUS,
    // BALT = 9 // POL, FIN, UKR, RUS,
    // FIN = 10 // SCAN, BALT, RUS,
    // SLOVA = 11 // POL, CZE, SWI/AU, UKR, HUN,
    // UKR = 12 // POL, BALT, UKR, RUS,
    // SPA = 13 // POL, SLOVA, UKR, ROM, RUS, TUR,
    // ITA = 14 // FRA, SWI/AU, ITA, SPA,
    // BALK = 15 // SWI/AU, ITA, HUN, GRE/MAK,
    // HUN = 16 // SWI/AU, SLOVA, UKR, BALK, ROM, GRE/MAK,
    // ROM = 17 // UKR, HUN, GRE/MAK, BUL,
    // GRE/MAK = 18 // BALK, HUN, ROM, BUL,
    // USA = 19 // UK, CAN, MEX, IRE, RUS, CUB,
    // CAN = 20 // USA, GRO,
    // MEX = 21 // USA, MIDAM, SPA, CUB,
    // MIDAM = 22 // MEX, COL, SPA,
    // COL = 23 // MIDAM, VEN, BRA, ECU, PER,
    // VEN = 24 // COL, BRA, GUY, CUB,
    // BRA = 25 // FRA, COL, VEN, PER, GUY, SUR, ARG, BOL, PAR, URU, SPA,
    // ECU = 26 // COL, PER,
    // PER = 27 // COL, BRA, ECU, BOL, CHI,
    // GUY = 28 // VEN, BRA, SUR,
    // SUR = 29 // FRA, BRA, GUY,
    // ARG = 30 // CHI, BOL, PAR, URU,
    // CHI = 31 // PER, ARG, BOL,
    // GRO = 32 // DEN, CAN, ICE,
    // BOL = 33 // BRA, PER, ARG, CHI, PAR,
    // PAR = 34 // BRA, ARG, BOL,
    // URU = 35 // BRA, ARG,
    // ICE = 36 // UK, GRO, IRE,
    // IRE = 37 // UK, USA, ICE,
    // RUS = 38 // SCAN, BALT, FIN, UKR, USA, TUR, GEO/ARM/AZE, KAZ, MON, CHI,
    // TUR = 39 // UKR, GRE/MAK, RUS, SYR, IRA, GEO/ARM/AZE, BUL, IRN,
    // SYR = 40 // TUR, JOR, ISR/PAL, BEI, IRA,
    // JOR = 41 // SYR, ISR/PAL, SAU, IRA,
    // ISR/PAL = 42 // SYR, JOR, BEI,
    // BEI = 43 // SYR, ISR/PAL,
    // SAU = 44 // JOR, YEM, OMA, VAE/QAT, IRN,
    // YEM = 45 // SAU, OMA,
    // OMA = 46 // SAU, YEM, VAE/QAT,
    // SPA = 47 // FRA, ITA, MEX, MIDAM, BRA,
    // VAE/QAT = 48 // SAU, OMA, IRN,
    // IRA = 49 // TUR, SYR, JOR, SAU, IRN,
    // GEO/ARM/AZE = 50 // RUS, TUR, IRN, GEO/ARM/AZE, TKM,
    // BUL = 51 // ROM, GRE/MAK, TUR,
    // IRN = 52 // TUR, SAU, VAE/QAT, IRA, GEO/ARM/AZE, PAK, TKM, AFG,
    // PAK = 53 // IRN, TKM, AFG, IND, CHI,
    // KAZ = 54 // RUS, GEO/ARM/AZE, UZB, TKM, KIR, CHI,
    // UZB = 55 // KAZ, TKM, TAD, AFG, KIR,
    // TKM = 56 // GEO/ARM/AZE, IRN, KAZ, UZB, AFG,
    // TAD = 57 // UZB, AFG, KIR, CHI,
    // AFG = 58 // IRN, PAK, UZB, TKM, TAD, CHI,
    // KIR = 59 // KAZ, UZB, TAD, CHI,
    // IND = 60 // PAK, BUR, NEP, BAN, SRI, CHI,
    // BUR = 61 // IND, NEP, BAN, CHI,
    // BAN = 62 // IND, BUR,
    // NEP = 63 // IND, BUR, CHI,
    // CUB = 64 // USA, MEX, VEN,
    // SRI = 65 // IND,
    // MON = 66 // RUS, CHI,
    // CHI = 67 // RUS, PAK, KAZ, TAD, AFG, KIR, IND, BUR, NEP, MON,

    
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
