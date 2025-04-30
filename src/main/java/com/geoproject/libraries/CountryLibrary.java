package com.geoproject.libraries;

//Informationen über die Länder
//Autor: Theodor
//Version: 7/2/2025

public class CountryLibrary
{
    //nur von theo übernommen, nichts neues
    public static int[][] borders = new int[][] {
        {1, 2, 4, 5, 6},//Deutschland = 0
        {0, 4, 7},//BeNeLux = 1
        {0, 8, 32},//Dänemark = 2
        {0, 5, 9, 11, 12, 13},//Polen = 3
        {0, 1, 6, 7, 14, 47},//Frankreich = 4
        {0, 3, 6, 11},//Tschechien = 5
        {0, 4, 5, 11, 14, 15, 16},//SwiAuLi
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
        {13, 16, 18, 51},//Rumänien = 17
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
        {40, 42},//Libanon = 43
        {41, 45, 46, 48, 52},//Saudi-Arabien = 44
        {44, 46},//Jemen = 45
        {44, 45, 48},//Oman = 46
        {4, 14, 21, 22, 25},//Iberische Halbinsel = 47
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
        {60, 63, 62, 67},//Myanmar = 61
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
    // UK = 7 // (hier) BNL, (hier) FRA, (hier) USA, (hier) ICE, IRE,
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
    // MEX = 21 // USA, MID, IBE, CUB,
    // MID = 22 // MEX, COL, IBE,
    // COL = 23 // MID, VEN, BRA, ECU, PER,
    // VEN = 24 // COL, BRA, GUY, CUB,
    // BRA = 25 // FRA, COL, VEN, PER, GUY, SUR, ARG, BOL, PAR, URU, IBE,
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
    // RUS = 38 // SCA, BLT, FIN, UKR, USA, TUR, GEO/ARM/AZE, KAZ, MON, CHI,
    // TUR = 39 // UKR, GRE/MAC, RUS, SYR, IRQ, GEO/ARM/AZE, BUL, IRN,
    // SYR = 40 // TUR, JOR, ISR/PAL, LEB, IRQ,
    // JOR = 41 // SYR, ISR/PAL, SAU, IRQ,
    // ISR/PAL = 42 // SYR, JOR, LEB,
    // LEB = 43 // SYR, ISR/PAL,
    // SAU = 44 // JOR, YEM, OMA, UAE/QAT, IRN,
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
    // IND = 60 // PAK, MYA, NEP, BAN, SRI, CHI,
    // MYA = 61 // IND, NEP, BAN, CHI,
    // BAN = 62 // IND, BUR,
    // NEP = 63 // IND, MYA, CHI,
    // CUB = 64 // USA, MEX, VEN,
    // SRI = 65 // IND,
    // MON = 66 // RUS, CHI,
    // CHI = 67 // RUS, PAK, KAZ, TAD, AFG, KIR, IND, MYA, NEP, MON,



    public static int industryUpgradeCost = 100; //Kosten für das Upgraden der Industrien

    //Berechnet den Preis eines Landes nach der Formel BIP in Mio. USD / 1.000
    public static int getCountryPrice(int countryID) {
        try {
            return Math.round((float) countryData[countryID][2] / 1000);
        } catch (Exception e) {
            // Handle the error gracefully, e.g., return a default value or log the error lol Copilot go brr
            return -1; // Default value indicating an error
        }
    }

    public static int getCountryExpenses(int countryID)
    {
        return Math.round((float) countryData[countryID][1] / 100000);
    }

    // Diese Formeln müssen beim Balancing angepasst werden
    public static int[] getCountryIndustryCaps (int countryID)
    {
        // Mining Cap: Flächen-Dependant + sekundär Einwohner-Dependant (Arbeitskräfte)
        int miningCap = Math.round(((float) countryData[countryID][0] / 20000) + ((float) countryData[countryID][1] / 1000000));

        // LW-Cap: Flächen-Dependant
        int agricultureCap = Math.round((float) countryData[countryID][0] / 200000);

        // Produktionscap: Einwohner-Dependant + sekundär Flächen-Dependant
        int productionCap = Math.round(((float) countryData[countryID][1] / 200000) + ((float) countryData[countryID][0] / 1000000));

        // Tourismuscap: Einwohner-Dependant
        int tourismCap = Math.round(((float) countryData[countryID][1] / 200000) + ((float) countryData[countryID][0] / 1000000));

        // Energiecap: Flächen-Dependant minus sekundär Einwohner, da die eigene Bevölkerung den Energieexport limitiert
        int energyCap = Math.round(((float) countryData[countryID][0] / 200000) - ((float) countryData[countryID][1] / 1000000));

        return new int[] {miningCap, agricultureCap, productionCap, tourismCap, energyCap};
    }

    //Speichert Informationen in folgender Reihenfolge: Fläche (in km²), Einwohnerzahl, BIP in Mio. USD
    //Bei Ländergruppen: Summe
    public static int [][] countryData = new int[][] {
        {357022, 84552242, 4527009},//GER
        {74657, 30640541, 1873073},//BNL
        {43094, 5977412, 407092},//DEN
        {312685, 38539201, 811736},//POL
        {643801, 66548530, 3052712},//FRA
        {78867, 10735859, 343208},//CZE
        {125308, 18795915, 1412473},//SWI/AU/LI
        {243610, 69138192, 3382115},//UK
        {774097, 16183659, 1070225},//SCA
        {175117, 6091527, 162781},//BLT
        {338145, 5617310, 295618},//FIN
        {49035, 5506760, 132832},//SLV
        {207600, 9056696, 71792},//BEL
        {637401, 40895182, 194916},//UKR
        {301340, 59342867, 2301603},//ITA
        {258975, 18890828, 225621},//BLK
        {93028, 9676135, 212464},//HUN
        {238391, 19015088, 351074},//ROM
        {157670, 13082778, 253044},//GRE/MAC
        {9525067, 345426571, 27720725},//USA
        {9984670, 39742430, 2142471},//CAN
        {1964375, 130861007, 1788821},//MEX
        {521876, 52548954, 363484},//MID
        {1138910, 52886363, 363570},//COL
        {912050, 28405543, 99203},//VEN
        {8515770, 211998573, 2173671},//BRA
        {283561, 18135478, 118845},//ECU
        {1285216, 34217848, 266912},//PER
        {214969, 831087, 17050},//GUY
        {163820, 634431, 3747},//SUR
        {2780400, 45696159, 645511},//ARG
        {756102, 19764771, 335642},//CHI
        {2166086, 55840, 3236},//GRO
        {1098581, 12413315, 45468},//BOL
        {406752, 6929153, 42955},//PAR
        {176215, 3386588, 77241},//URU
        {103000, 393396, 31325},//ICE
        {70273, 5262009, 551554},//IRE
        {17098242, 144820423, 2009959},//RUS
        {783562, 87473805, 1129974},//TUR
        {187437, 24174628, 8980},//SYR
        {89342, 11552876, 50885},//JOR
        {27555, 14882464, 531032},//ISR/PAL
        {10400, 5805962, 24023},//LEB
        {2168268, 40504313, 1277379},//SAU
        {527968, 40583164, 18806},//YEM
        {309500, 5281538, 108811},//OMA
        {597928, 58417756, 1911473},//IBE
        {95186, 14075552, 727133},//UAE/QAT
        {438317, 46042015, 252407},//IRQ
        {186043, 17118087, 126978},//GEO/ARM/AZE
        {110879, 6757689, 101611},//BUL
        {1648195, 91567738, 372820},//IRN
        {796095, 251269164, 337457},//PAK
        {2724900, 20592571, 263372},//KAZ
        {447400, 36361859, 101584},//UZB
        {488100, 7494498, 77716},//TKM
        {144100, 10590927, 11855},//TAD
        {652230, 42647492, 17329},//AFG
        {199951, 7186009, 13993},//KIR
        {3287263, 1450935791, 3567552},//IND
        {676578, 54500091, 64505},//MYA
        {148460, 173562364, 451534},//BAN
        {147181, 29651054, 40907},//NEP
        {110860, 10979783, 104055},//CUB
        {65610, 23103565, 74239},//SRI
        {1564116, 3475540, 20315},//MON
        {9596960, 1419321278, 17758046},//CHI
    };

    //Beinhält die StatsMultiplier der Industrien, ohne Wirtschaft
    //Werte (meistens von 1-10) basieren auf dem Anteil des Sektors am BIP
    //Bergbau, Landwirtschaft, Warenproduktion, Tourismus, Energie
    public static int[][] statsMultiplier = new int[][] {
	    {1, 3, 10, 7, 6},//GER
	    {2, 2, 6, 8, 7},//BNL
        {2, 2, 5, 9, 7},//DEN
        {7, 5, 7, 5, 9},//POL
        {1, 2, 8, 10, 1},//FRA
        {4, 10, 9, 5, 2},//CZE
        {5, 1, 8, 10, 7},//SWI/AU/LI
        {1, 7, 4, 7, 9},//UK
        {8, 10, 6, 8, 10},//SCA
        {7, 8, 5, 2, 5},//BLT
        {7, 6, 5, 4, 1},//FIN
        {3, 3, 9, 2, 8},//SLV
        {2, 3, 2, 1, 3},//BEL
        {8, 9, 5, 1, 7},//UKR
        {6, 3, 2, 11, 8},//ITA
        {7, 6, 5, 6, 1},//BLK
        {2, 3, 8, 9, 8},//HUN
        {1, 8, 8, 1, 7},//ROM
        {1, 6, 6, 9, 1},//GRE/MAC
        {1, 1, 1, 1, 1},//USA ----- STOP
        {1, 1, 1, 1, 1},//CAN
        {1, 1, 1, 1, 1},//MEX
        {1, 1, 1, 1, 1},//MID
        {1, 1, 1, 1, 1},//COL
        {1, 1, 1, 1, 1},//VEN
        {1, 1, 1, 1, 1},//BRA
        {1, 1, 1, 1, 1},//ECU
        {1, 1, 1, 1, 1},//PER
        {1, 1, 1, 1, 1},//GUY
        {1, 1, 1, 1, 1},//SUR
        {1, 1, 1, 1, 1},//ARG
        {1, 1, 1, 1, 1},//CHI
        {1, 1, 1, 1, 1},//GRO
        {1, 1, 1, 1, 1},//BOL
        {1, 1, 1, 1, 1},//PAR
        {1, 1, 1, 1, 1},//URU
        {1, 1, 1, 1, 1},//ICE
        {1, 1, 1, 1, 1},//IRE
        {1, 1, 1, 1, 15},//RUS
        {1, 1, 1, 1, 1},//TUR
        {1, 1, 1, 1, 1},//SYR
        {1, 1, 1, 1, 1},//JOR
        {1, 1, 1, 1, 1},//ISR/PAL
        {1, 1, 1, 1, 1},//LEB
        {1, 1, 1, 1, 1},//SAU
        {1, 1, 1, 1, 1},//YEM
        {1, 1, 1, 1, 1},//OMA
        {1, 1, 1, 1, 1},//IBE
        {1, 1, 1, 1, 12},//UAE/QAT
        {1, 1, 1, 1, 1},//IRQ
        {1, 1, 1, 1, 1},//GEO/ARM/AZE
        {1, 1, 1, 1, 1},//BUL
        {1, 1, 1, 1, 1},//IRN
        {1, 1, 1, 1, 1},//PAK
        {1, 1, 1, 1, 1},//KAZ
        {1, 1, 1, 1, 1},//UZB
        {1, 1, 1, 1, 1},//TKM
        {1, 1, 1, 1, 1},//TAD
        {1, 1, 1, 1, 1},//AFG
        {1, 1, 1, 1, 1},//KIR
        {1, 1, 1, 1, 1},//IND
        {1, 1, 1, 1, 1},//MYA
        {1, 1, 1, 1, 1},//BAN
        {1, 1, 1, 1, 1},//NEP
        {1, 1, 1, 1, 1},//CUB
        {1, 1, 1, 1, 1},//SRI
        {1, 1, 1, 1, 1},//MON
        {1, 1, 15, 1, 1},//CHI
    };

    //Array, der die Namen der Länder beinhält. HOCHGRADIG SENSITIV! NICHTS ÄNDERN!
    public static String[] countryNames = new String[] {"Deutschland", "BeNeLux", "Dänemark", "Polen", "Frankreich & Monaco",
        "Tschechien", "Österreich, Liechtenstein & Schweiz", "Vereinigtes Königreich", "Skandinavien", "Baltikum", "Finnland",
        "Slowakei", "Belarus", "Ukraine & Moldau", "Italien", "Balkan", "Ungarn", "Rumänien", "Griechenland & Nordmazedonien",
        "Vereinigte Staaten", "Kanada", "Mexiko", "Mittelamerikanische Ländergruppe", "Kolumbien", "Venezuela", "Brasilien", "Ecuador",
        "Peru", "Guyana", "Suriname", "Argentinien", "Chile", "Grönland", "Bolivien", "Paraguay", "Uruguay", "Island", "Irland", "Russland",
        "Türkei & Zypern", "Syrien", "Jordanien", "Israel & Palästina", "Beirut", "Saudi-Arabien", "Jemen", "Oman", "Iberische Halbinsel",
        "VAE & Katar", "Irak", "Georgien, Armenien & Aserbaidschan", "Bulgarien", "Iran", "Pakistan", "Kasachstan", "Usbekistan", "Turkmenistan",
        "Tadschikistan", "Afghanistan", "Kirgisistan", "Indien", "Myanmar", "Bangladesch", "Nepal", "Kuba", "Sri Lanka", "Mongolei", "China"
    };


    //Wichtig!!!!! bitte beim compilen übernehmen
    public static String[] countryShortNames = new String[] {"DE", "BNL", "DEN", "POL", "FRA", "CZE", "SWI/AU", "UK", "SCAN", "BALT", "FIN", "SLOVA", "UKR", "SPA", "ITA", "BALK", "HUN", "ROM", "GRE/MAK", "USA", "CAN", "MEX", "MIDAM", "COL", "VEN", "BRA", "ECU", "PER", "GUY", "SUR", "ARG", "CHI", "GRO", "BOL", "PAR", "URU", "ICE", "IRE", "RUS", "TUR", "SYR", "JOR", "ISR/PAL", "BEI", "SAU", "YEM", "OMA", "SPA", "VAE/QAT", "IRA", "GEO/ARM/AZE", "BUL", "IRN", "PAK", "KAZ", "UZB", "TKM", "TAD", "AFG", "KIR", "IND", "BUR", "BAN", "NEP", "CUB", "SRI", "MON", "CHI"};
    
    //Listet alle Industrietypen
    public static String[][] statNames = new String[][] {
        {"Bergbau", "Bb"},
        {"Landwirtschaft", "Lw"},
        {"Warenproduktion", "Wp"},
        {"Tourismus", "T"},
        {"Energie", "E"},
        {"Wissenschaft", "W"}
    };
}
