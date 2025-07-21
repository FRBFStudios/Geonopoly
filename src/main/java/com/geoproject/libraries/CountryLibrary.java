package com.geoproject.libraries;

public class CountryLibrary {
    public static final int AREA = 0;
    public static final int POPULATION = 1;
    public static final int GDP = 2;

    public static final int GER = 0;
    public static final int BNL = 1;
    public static final int DEN = 2;
    public static final int POL = 3;
    public static final int FRA = 4;
    public static final int CZE = 5;
    public static final int SWI = 6;
    public static final int UK = 7;
    public static final int SCA = 8;
    public static final int BLT = 9;
    public static final int FIN = 10;
    public static final int SLV = 11;
    public static final int BEL = 12;
    public static final int UKR = 13;
    public static final int ITA = 14;
    public static final int BLK = 15;
    public static final int HUN = 16;
    public static final int ROM = 17;
    public static final int GRE = 18;
    public static final int USA = 19;
    public static final int CAN = 20;
    public static final int MEX = 21;
    public static final int MID = 22;
    public static final int COL = 23;
    public static final int VEN = 24;
    public static final int BRA = 25;
    public static final int ECU = 26;
    public static final int PER = 27;
    public static final int GUY = 28;
    public static final int SUR = 29;
    public static final int ARG = 30;
    public static final int CHI = 31;
    public static final int GRN = 32;
    public static final int BOL = 33;
    public static final int PAR = 34;
    public static final int URU = 35;
    public static final int ICE = 36;
    public static final int IRE = 37;
    public static final int RUS = 38;
    public static final int TUR = 39;
    public static final int SYR = 40;
    public static final int JOR = 41;
    public static final int ISR = 42;
    public static final int LEB = 43;
    public static final int SAU = 44;
    public static final int YEM = 45;
    public static final int OMA = 46;
    public static final int IBE = 47;
    public static final int UAE = 48;
    public static final int IRQ = 49;
    public static final int GEO = 50;
    public static final int BUL = 51;
    public static final int IRN = 52;
    public static final int PAK = 53;
    public static final int KAZ = 54;
    public static final int UZB = 55;
    public static final int TKM = 56;
    public static final int TAJ = 57;
    public static final int AFG = 58;
    public static final int KYR = 59;
    public static final int IND = 60;
    public static final int MYA = 61;
    public static final int BAN = 62;
    public static final int NEP = 63;
    public static final int CUB = 64;
    public static final int SRI = 65;
    public static final int MON = 66;
    public static final int CHN = 67;

    public static int[][] borders = new int[][]{
            {BNL, DEN, POL, FRA, CZE, SWI}, // Germany = 0
            {GER, FRA, UK}, // BeNeLux = 1
            {GER, SCA, GRN}, // Denmark = 2
            {GER, CZE, BLT, SLV, BEL, UKR}, // Poland = 3
            {GER, BNL, SWI, UK, 14, 47}, // France = 4
            {GER, POL, SWI, SLV}, // Czechia = 5
            {GER, FRA, CZE, SLV, ITA, BLK, HUN}, // SwiAuLi
            {BNL, FRA, USA, ICE, IRE}, // UK = 7
            {DEN, FIN}, // Scandinavia = 8
            {POL, FIN, BEL, RUS}, // Baltics = 9
            {SCA, BLT, RUS}, // Finland = 10
            {POL, CZE, SWI, UKR, HUN}, // Slovakia = 11
            {POL, BLT, UKR, RUS},//Belarus = 12
            {POL, SLV, BEL, ROM, RUS, TUR}, // Ukraine = 13
            {FRA, SWI, BLK, IBE}, // Italy = 14
            {SWI, ITA, HUN, GRE}, // Balkan = 15
            {SWI, SLV, UKR, BLK, ROM, GRE}, // Hungary = 16
            {UKR, HUN, GRE, BUL}, // Romania = 17
            {BLK, HUN, ROM, BUL}, // Greece = 18
            {UK, CAN, MEX, RUS, CUB}, // USA = 19
            {USA, GRN}, // Canada = 20
            {MEX, MID, IBE, CUB}, // Mexico = 21
            {MEX, COL, IBE}, // Middle America = 22
            {MID, VEN, BRA, ECU, PER}, // Columbia = 23
            {COL, BRA, GUY, CUB}, // Venezuela = 24
            {COL, VEN, PER, GUY, SUR, BOL, PAR, URU, IBE}, // Brazil = 25
            {COL, PER}, // Ecuador = 26
            {COL, BRA, ECU, BOL, CHI}, // Peru = 27
            {VEN, BRA, SUR}, // Guyana = 28
            {BRA, GUY}, // Suriname = 29
            {CHI, BOL, PAR, URU}, // Argentina = 30
            {PER, ARG, BOL}, // Chile = 31
            {DEN, CAN, ICE}, // Greenland = 32
            {BRA, PER, ARG, CHI, PAR}, // Bolivia = 33
            {BRA, ARG, BOL}, // Paraguay = 34
            {BRA, ARG}, // Uruguay = 35
            {UK, GRN, IRE}, // Iceland = 36
            {UK, ICE}, // Ireland = 37
            {BLT, FIN, BEL, UKR, USA, GEO, KAZ, MON, CHN}, // Russia = 38
            {UKR, GRE, SYR, IRQ, GEO, BUL, IRN}, // Türkiye = 39
            {TUR, JOR, ISR, LEB, IRQ}, // Syria = 40
            {SYR, ISR, SAU, IRQ}, // Jordan = 41
            {SYR, JOR, LEB}, // Israel und Palestine = 42
            {SYR, ISR}, // Lebanon = 43
            {JOR, YEM, OMA, UAE}, // Saudi Arabia = 44
            {SAU, OMA}, // Yemen = 45
            {SAU, YEM, UAE}, // Oman = 46
            {FRA, ITA, MEX, MID, BRA}, // Iberian Peninsula = 47
            {SAU, OMA},// VAE = 48
            {TUR, SYR, JOR, SAU, IRN}, // Iraq = 49
            {RUS, TUR, IRN, KAZ, TKM}, // GeArAz = 50
            {ROM, GRE, TUR}, // Bulgaria = 51
            {TUR, IRQ, GEO, PAK, TKM, AFG}, // Iran = 52
            {IRN, TKM, AFG, IND, CHN}, // Pakistan = 53
            {RUS, GEO, UZB, TKM, KYR, CHN}, // Kazakhstan = 54
            {KAZ, TKM, TAJ, AFG, KYR}, // Uzbekistan = 55
            {GEO, IRN, KAZ, UZB, AFG}, // Turkmenistan = 56
            {UZB, AFG, KYR, CHN}, // Tajikistan = 57
            {IRN, PAK, UZB, TKM, TAJ, CHN}, //Afghanistan = 58
            {KAZ, UZB, TAJ, CHN}, // Kyrgyzstan = 59
            {PAK, MYA, NEP, BAN, SRI, CHN},//India = 60
            {IND, NEP, BAN, CHN}, // Myanmar = 61
            {IND, MYA}, // Bangladesh = 62
            {IND, MYA, CHN}, // Nepal = 63
            {USA, MEX, VEN}, // Cuba = 64
            {IND}, // Sri Lanka = 65
            {RUS, CHN}, // Mongolia = 66
            {RUS, PAK, KAZ, TAJ, AFG, KYR, IND, MYA, NEP, MON}, // China = 67
    };

    // Area (in km²), Population, GDP in Mio. USD
    // Some GDPs have been adjusted manually for balancing purposes
    public static int[][] countryData = new int[][]{
            {357022, 84552242, 2000000},//GER
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
            {9525067, 345426571, 3000000},//USA
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
            {2166086, 55840, 3236},//GRN
            {1098581, 12413315, 45468},//BOL
            {406752, 6929153, 42955},//PAR
            {176215, 3386588, 77241},//URU
            {103000, 393396, 31325},//ICE
            {70273, 5262009, 551554},//IRE
            {17098242, 144820423, 2500000},//RUS
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
            {144100, 10590927, 11855},//TAJ
            {652230, 42647492, 17329},//AFG
            {199951, 7186009, 13993},//KYR
            {3287263, 1450935791, 3567552},//IND
            {676578, 54500091, 64505},//MYA
            {148460, 173562364, 451534},//BAN
            {147181, 29651054, 40907},//NEP
            {110860, 10979783, 104055},//CUB
            {65610, 23103565, 74239},//SRI
            {1564116, 3475540, 20315},//MON
            {9596960, 1419321278, 1700000},//CHN
    };

    // Mining, Agriculture, Production, Tourism, Energy
    public static int[][] industryProfitMultipliers = new int[][]{
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
            {10, 2, 2, 5, 5},//GRN
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
            {10, 8, 15, 7, 12},//CHN
    };

    // Do not delete or add entries!
    public static String[] countryNames = new String[]{"Germany", "BeNeLux Countries", "Denmark", "Poland", "France & Monaco",
            "Czechia", "Austria, Liechtenstein & Switzerland", "United Kingdom", "Scandinavia", "Baltics", "Finland",
            "Slovakia", "Belarus", "Ukraine & Moldavia", "Italy", "Balkan", "Hungary", "Romania", "Greece & North Macedonia",
            "United States", "Canada", "Mexico", "Middle American Countries", "Columbia", "Venezuela", "Brazil", "Ecuador",
            "Peru", "Guyana", "Suriname", "Argentina", "Chile", "Greenland", "Bolivia", "Paraguay", "Uruguay", "Island", "Ireland", "Russia",
            "Türkiye & Cyprus", "Syria", "Jordan", "Israel & Palestine", "Lebanon", "Saudi Arabia", "Yemen", "Oman", "Iberian Peninsula",
            "VAE & Qatar", "Iraq", "Georgia, Armenia & Azerbaijan", "Bulgaria", "Iran", "Pakistan", "Kazakhstan", "Uzbekistan", "Turkmenistan",
            "Tajikistan", "Afghanistan", "Kyrgyzstan", "India", "Myanmar", "Bangladesh", "Nepal", "Cuba", "Sri Lanka", "Mongolia", "China"
    };

    public static String[] countryShortNames = new String[] {
                    "GER", "BNL", "DEN", "POL", "FRA", "CZE", "SWI/AU/LI", "UK", "SCA", "BLT", "FIN", "SLV", "IBE", "UKR", "ITA", "BLK", "HUN", "ROM", "GRE/MAC",
                    "USA", "CAN", "MEX", "MID", "COL", "VEN", "BRA", "ECU", "PER", "GUY", "SUR", "ARG", "CHI", "GRN", "BOL", "PAR", "URU", "ICE", "IRE",
                    "RUS", "TUR", "SYR", "JOR", "ISR/PAL", "LEB", "SAU", "YEM", "OMA", "IBE", "UAE/QAT", "IRQ", "GEO/ARM/AZE", "BUL", "IRN", "PAK",
                    "KAZ", "UZB", "TKM", "TAD", "AFG", "KYR", "IND", "BUR", "BAN", "NEP", "CUB", "SRI", "MON", "CHN"
    };
    
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

    public static String[][] industryNames = new String[][]{
            {"Mining", "MN"},
            {"Agriculture", "AG"},
            {"Production", "PR"},
            {"Tourism", "TO"},
            {"Energy", "EN"},
            {"Science", "SC"}
    };

    public static int getCountryPrice(int countryID) {
        try {
            return Math.round((float) countryData[countryID][GDP] / 1000);
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getCountryExpenses(int countryID) {
        return Math.round((float) countryData[countryID][POPULATION] / 1000000);
    }

    /* Only uncomment this block of code if you can actually balance the caps and bring all of them below at least 50
    public static int[] getCountryIndustryUpgradeCaps(int countryID) {
        // Mining cap: Area-dependant + secondary population-dependant
        int miningCap = Math.round(((float) countryData[countryID][AREA] / 50000) + ((float) countryData[countryID][POPULATION] / 100000000));

        // Agriculture cap: Area-dependant
        int agricultureCap = Math.round((float) countryData[countryID][AREA] / 50000);

        // Production cap: Population-dependant + secondary area-dependant
        int productionCap = Math.round(((float) countryData[countryID][POPULATION] / 1000000) + ((float) countryData[countryID][AREA] / 50000));

        // Tourism cap: Population-Dependant
        int tourismCap = Math.round(((float) countryData[countryID][POPULATION] / 1000000));

        // Energy cap: Area-dependant minus secondary population, since the population of a country limits how much energy it can export
        int energyCap = Math.round(((float) countryData[countryID][0] / 50000) - ((float) countryData[countryID][1] / 10000000));

        // Remnants of previous balancing attempts
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
        return new int[] {
                miningCap, agricultureCap, productionCap, tourismCap, energyCap
        };
    }*/
}
