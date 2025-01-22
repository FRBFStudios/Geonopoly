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
        {1, 2, 4, 9, 10, 0},//DEN
        {1, 3, 6, 10, 12, 13},//POL
        {1, 2, 7, 8, 14, 15},//FRA
        {1, 0, 0, 0, 0, 0},//CZE
    };

    @SuppressWarnings("unused")
    public static String[] Names = new String[] {"DE", "BENELUX", "DEN", "POL", "FRA", "CZE"};
}
