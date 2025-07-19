package com.geoproject.libraries;

//Informationen über die Länder
//Autor: Theodor
//Version: 7/2/2025

public class CountryLibrary {
    //nur von theo übernommen, nichts neues
    public static int[][] borders = new int[][]{
            {1, 2, 3, 4, 5, 6},//Deutschland = 0
            {0, 4, 7},//BeNeLux = 1
            {0, 8, 32},//Dänemark = 2
            {0, 5, 9, 11, 12, 13},//Polen = 3
            {0, 1, 6, 7, 14, 47},//Frankreich = 4
            {0, 3, 6, 11},//Tschechien = 5
            {0, 4, 5, 11, 14, 15, 16},//SwiAuLi
            {1, 4, 19, 36, 37},//UK = 7
            {2, 10},//Skandinavien = 8
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
            {7, 20, 21, 38, 64},//USA = 19
            {19, 32},//Kanada = 20
            {19, 22, 47, 64},//Mexiko = 21
            {21, 23, 47},//Mittelamerika = 22
            {22, 24, 25, 26, 27},//Kolumbien = 23
            {23, 25, 28, 64},//Venezuela = 24
            {23, 24, 27, 28, 29, 33, 34, 35, 47},//Brasilien = 25
            {23, 27},//Ecuador = 26
            {23, 25, 26, 33, 31},//Peru = 27
            {24, 25, 29},//Guyana = 28
            {25, 28},//Suriname = 29
            {31, 33, 34, 35},//Argentinien = 30
            {27, 30, 33},//Chile = 31
            {2, 20, 36},//Grönland = 32
            {25, 27, 30, 31, 34},//Bolivien = 33
            {25, 30, 33},//Paraguay = 34
            {25, 30},//Uruguay = 35
            {7, 32, 37},//Island = 36
            {7, 36},//Irland = 37
            {9, 10, 12, 13, 19, 39, 50, 54, 66, 67},//Russland = 38
            {13, 18, 38, 40, 49, 50, 51, 52},//Türkei = 39
            {39, 41, 42, 43, 49},//Syrien = 40
            {40, 42, 44, 49},//Jordanien = 41
            {40, 41, 43},//Israel und Palästina = 42
            {40, 42},//Libanon = 43
            {41, 45, 46, 48},//Saudi-Arabien = 44
            {44, 46},//Jemen = 45
            {44, 45, 48},//Oman = 46
            {4, 14, 21, 22, 25},//Iberische Halbinsel = 47
            {44, 46},//VAE = 48
            {39, 40, 41, 44, 52},//Irak = 49
            {38, 39, 52, 54, 56},//GeArAz = 50
            {17, 18, 39},//Bulgarien = 51
            {39, 49, 50, 53, 56, 58},//Iran = 52
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
    //Speichert Informationen in folgender Reihenfolge: Fläche (in km²), Einwohnerzahl, BIP in Mio. USD
    //Bei Ländergruppen: Summe
    public static int[][] countryData = new int[][]{
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
    public static int[][] statsMultiplier = new int[][]{
            {1, 3, 13, 7, 6},//GER
            {2, 2, 6, 8, 7},//BNL
            {2, 2, 5, 9, 7},//DEN
            {5, 7, 10, 7, 6},//POL
            {1, 2, 8, 12, 1},//FRA
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
            {1, 5, 5, 13, 4},//GRE/MAC
            {4, 4, 12, 6, 13},//USA
            {7, 5, 8, 7, 10},//CAN
            {6, 7, 8, 8, 6},//MEX
            {3, 8, 5, 9, 3},//MID
            {7, 7, 6, 7, 7},//COL
            {8, 5, 4, 4, 13},//VEN
            {8, 8, 9, 7, 8},//BRA
            {7, 8, 5, 7, 7},//ECU
            {10, 7, 5, 7, 5},//PER
            {8, 7, 3, 6, 5},//GUY
            {8, 7, 3, 6, 5},//SUR
            {6, 7, 8, 7, 6},//ARG
            {12, 5, 6, 7, 7},//CHI
            {10, 2, 2, 5, 5},//GRO
            {8, 5, 4, 6, 4},//BOL
            {5, 10, 4, 6, 4},//PAR
            {3, 8, 6, 7, 4},//URU
            {4, 2, 4, 8, 9},//ICE
            {3, 4, 9, 8, 3},//IRE
            {12, 5, 8, 6, 15},//RUS
            {5, 6, 8, 9, 6},//TUR
            {5, 7, 4, 5, 7},//SYR
            {7, 5, 5, 7, 7},//JOR
            {2, 5, 9, 8, 6},//ISR/PAL
            {2, 4, 5, 9, 4},//LEB
            {7, 2, 4, 5, 15},//SAU
            {6, 7, 3, 5, 7},//YEM
            {7, 3, 5, 7, 10},//OMA
            {3, 5, 9, 12, 5},//IBE
            {7, 1, 4, 9, 15},//UAE/QAT
            {8, 3, 3, 4, 14},//IRQ
            {7, 5, 5, 6, 7},//GEO/ARM/AZE
            {5, 6, 8, 7, 6},//BUL
            {9, 6, 7, 6, 12},//IRN
            {6, 9, 7, 6, 5},//PAK
            {12, 5, 5, 5, 12},//KAZ
            {8, 7, 5, 5, 8},//UZB
            {8, 4, 4, 4, 10},//TKM
            {7, 9, 4, 5, 6},//TAJ
            {7, 10, 3, 4, 5},//AFG
            {8, 7, 4, 5, 6},//KYR
            {6, 15, 15, 8, 8},//IND
            {7, 9, 5, 6, 6},//MYA
            {2, 12, 10, 7, 4},//BAN
            {2, 10, 3, 7, 3},//NEP
            {5, 7, 4, 9, 5},//CUB
            {3, 9, 5, 9, 4},//SRI
            {12, 5, 3, 5, 7},//MON
            {10, 8, 15, 7, 12},//CHI
    };
    //Array, der die Namen der Länder beinhält. HOCHGRADIG SENSITIV! NICHTS ÄNDERN!
    public static String[] countryNames = new String[]{"Deutschland", "BeNeLux", "Dänemark", "Polen", "Frankreich & Monaco",
            "Tschechien", "Österreich, Liechtenstein & Schweiz", "Vereinigtes Königreich", "Skandinavien", "Baltikum", "Finnland",
            "Slowakei", "Belarus", "Ukraine & Moldau", "Italien", "Balkan", "Ungarn", "Rumänien", "Griechenland & Nordmazedonien",
            "Vereinigte Staaten", "Kanada", "Mexiko", "Mittelamerikanische Ländergruppe", "Kolumbien", "Venezuela", "Brasilien", "Ecuador",
            "Peru", "Guyana", "Suriname", "Argentinien", "Chile", "Grönland", "Bolivien", "Paraguay", "Uruguay", "Island", "Irland", "Russland",
            "Türkei & Zypern", "Syrien", "Jordanien", "Israel & Palästina", "Libanon", "Saudi-Arabien", "Jemen", "Oman", "Iberische Halbinsel",
            "VAE & Katar", "Irak", "Georgien, Armenien & Aserbaidschan", "Bulgarien", "Iran", "Pakistan", "Kasachstan", "Usbekistan", "Turkmenistan",
            "Tadschikistan", "Afghanistan", "Kirgisistan", "Indien", "Myanmar", "Bangladesch", "Nepal", "Kuba", "Sri Lanka", "Mongolei", "China"
    };

    // Borders mit country names, damit besser und übersichtlicher und schneller bei Map design (anordnung ...)
    // GER = 0 // BNL, DEN, FRA, CZE, SWI/AU/LI,
    // BNL = 1 // GER, FRA, UK,
    // DEN = 2 // GER, SCA, GRO,
    // POL = 3 // GER, CZE, BLT, SLV, UKR, IBE,
    // FRA = 4 // GER, BNL, SWI/AU/LI, UK, ITA, BRA, SUR, IBE,
    // CZE = 5 // GER, POL, SWI/AU/LI, SLV,
    // SWI/AU/LI = 6 // GER, FRA, CZE, SLV, ITA, BLT, HUN,
    // UK = 7 // (hier) BNL, (hier) FRA, (hier) USA, (hier) ICE, IRE,
    // SCA = 8 // DEN, FIN, RUS,
    // BLT = 9 // POL, FIN, UKR, RUS,
    // FIN = 10 // SCA, BLT, RUS,
    // SLV = 11 // POL, CZE, SWI/AU/LI, UKR, HUN,
    // BEL = 12 // POL, BLT, UKR, RUS,
    // UKR = 13 // POL, SLV, UKR, ROM, RUS, TUR,
    // ITA = 14 // FRA, SWI/AU/LI, ITA, IBE
    // BLK = 15 // SWI/AU/LI, ITA, HUN, GRE/MAC,
    // HUN = 16 // SWI/AU/LI, SLV, UKR, BLT, ROM, GRE/MAC,
    // ROM = 17 // UKR, HUN, GRE/MAC, BUL,
    // GRE/MAC = 18 // BLT, HUN, ROM, BUL,
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
    // OMA = 46 // SAU, YEM, UAE/QAT,
    // IBE = 47 // FRA, ITA, MEX, MID, BRA,
    // UAE/QAT = 48 // SAU, OMA, IRN,
    // IRQ = 49 // TUR, SYR, JOR, SAU, IRN,
    // GEO/ARM/AZE = 50 // RUS, TUR, IRN, GEO/ARM/AZE, TKM,
    // BUL = 51 // ROM, GRE/MAC, TUR,
    // IRN = 52 // TUR, SAU, UAE/QAT, IRQ, GEO/ARM/AZE, PAK, TKM, AFG,
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

    public static String[] countryShortNames = new String[]{"GER", "BNL", "DEN", "POL", "FRA", "CZE", "SWI/AU/LI", "UK", "SCA", "BLT", "FIN", "SLV", "IBE", "UKR", "ITA", "BLK", "HUN", "ROM", "GRE/MAC", "USA", "CAN", "MEX", "MID", "COL", "VEN", "BRA", "ECU", "PER", "GUY", "SUR", "ARG", "CHI", "GRO", "BOL", "PAR", "URU", "ICE", "IRE", "RUS", "TUR", "SYR", "JOR", "ISR/PAL", "LEB", "SAU", "YEM", "OMA", "IBE", "UAE/QAT", "IRQ", "GEO/ARM/AZE", "BUL", "IRN", "PAK", "KAZ", "UZB", "TKM", "TAD", "AFG", "KIR", "IND", "BUR", "BAN", "NEP", "CUB", "SRI", "MON", "CHI"};
    
    public static int[] countryShortNamesBreak = new int[]{42, 18, 48, 50};

    public static String getButtonCountryShortNames(int countryID) {
        if (countryID < 0 || countryID >= countryShortNames.length) {
            return "Unknown";
        }
        else {
            String shortName = countryShortNames[countryID];

            for (int j : countryShortNamesBreak) {
                if (countryID == j) {
                    if (shortName.contains("/")) {
                        shortName = "<html>" + shortName.replace("/", "/<br>") + "</html>";
                        return shortName;
                    } else {
                        return "XXX";
                    }
                }
            }
            return shortName;
        }
    }
    
    //Listet alle Industrietypen
    public static String[][] statNames = new String[][]{
            {"Bergbau", "Bb"},
            {"Landwirtschaft", "Lw"},
            {"Warenproduktion", "Wp"},
            {"Tourismus", "T"},
            {"Energie", "E"},
            {"Wissenschaft", "W"}
    };

    //Berechnet den Preis eines Landes nach der Formel BIP in Mio. USD / 1.000
    public static int getCountryPrice(int countryID) {
        try {
            return Math.round((float) countryData[countryID][2] / 1000);
        } catch (Exception e) {
            // Handle the error gracefully, e.g., return a default value or log the error lol Copilot go brr
            return -1; // Default value indicating an error
        }
    }

    public static int getCountryExpenses(int countryID) {
        return Math.round((float) countryData[countryID][1] / 1000000);
    }

    /* Diese Formeln müssen beim Balancing angepasst werden
    public static int[] getCountryIndustryCaps(int countryID) {
        // Mining Cap: Flächen-Dependant + sekundär Einwohner-Dependant (Arbeitskräfte)
        int miningCap = Math.round(((float) countryData[countryID][0] / 50000) + ((float) countryData[countryID][1] / 100000000));

        // LW-Cap: Flächen-Dependant
        int agricultureCap = Math.round((float) countryData[countryID][0] / 50000);

        // Produktionscap: Einwohner-Dependant + sekundär Flächen-Dependant
        int productionCap = Math.round(((float) countryData[countryID][1] / 1000000) + ((float) countryData[countryID][0] / 50000));

        // Tourismuscap: Einwohner-Dependant
        int tourismCap = Math.round(((float) countryData[countryID][1] / 1000000));

        // Energiecap: Flächen-Dependant minus sekundär Einwohner, da die eigene Bevölkerung den Energieexport limitiert
        int energyCap = Math.round(((float) countryData[countryID][0] / 50000) - ((float) countryData[countryID][1] / 10000000));

        if (miningCap < 1) {
            miningCap = 1;
        } else if (miningCap > 50) {
            miningCap = 50 + Math.round((float) (miningCap - 50) / 4);
        }

        if (agricultureCap < 1) {
            agricultureCap = 1;
        } else if (agricultureCap > 50) {
            agricultureCap = 50 + Math.round((float) (agricultureCap - 50) / 4);
        }

        if (productionCap < 1) {
            productionCap = 1;
        } else if (productionCap > 50) {
            productionCap = 50 + Math.round((float) (productionCap - 50) / 20);
        }

        if (tourismCap < 1) {
            tourismCap = 1;
        } else if (tourismCap > 50) {
            tourismCap = 50 + Math.round((float) (tourismCap - 50) / 20);
        }

        if (energyCap < 1) {
            energyCap = 1;
        } else if (energyCap > 50) {
            energyCap = 50 + Math.round((float) (energyCap - 50) / 4);
        }
        return new int[]{miningCap, agricultureCap, productionCap, tourismCap, energyCap};
    }*/}
