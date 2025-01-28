package com.geoproject.libraries;

//Welche Länder grenzen an welche?
//Author: Theodor
//Version: 21/1/2025

public class CountryLibrary
{
    @SuppressWarnings("unused")
    public static int[][] borders = new int[][] {
        {2, 3, 4, 5, 6, 7},//DE
        {1, 3, 5, 8, 0, 0},//BENELUX
        {1, 2, 4, 9, 19, 23},//DEN
        {1, 3, 6, 10, 12, 13},//POL
        {1, 2, 7, 8, 14, 15},//FRA
        {1, 4, 7, 12, 0, 0},//CZE
        {1, 5, 6, 12, 16, 17},//SWI/AU
        {2, 5, 18, 19, 20, 0},//UK
        {3, 4, 10, 11, 21, 0},//SCAN
        {4, 9, 11, 21, 22, 0},//BALT
        {9, 10, 21, 0, 0, 0},//FIN
        {4, 6, 7, 13, 17, 0},//SLOVA
        {4, 12, 17, 21, 22, 24},//UKR
        {},//
    };

    @SuppressWarnings("unused")
    public static String[] countryNames = new String[] {"Deutschland", "BeNeLux", "Dänemark", "Polen", "Frankreich",
            "Tschechien", "Österreich und Schweiz", "Vereinigtes Königreich", "Skandinavien", "Baltikum", "Finnland",
            "Slowakei", "Ukraine", "Spanien", "Italien", "Slowenien", "Ungarn", "Irland", "Island", "Vereinigte Staaten",
            "Russland", "Belarus", "Kanada", "Romänien"};

    //Ich glaube, das kann weg
    @SuppressWarnings("unused")
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
