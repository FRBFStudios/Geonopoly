package com.geoproject;
import com.geoproject.gui.*;
import com.geoproject.libraries.CountryLibrary;

//This class runs everything.
public class Geonopoly {
    public static void main(String[] args) {
        Player player = new Player(0);
        if (CountryLibrary.countryNames.length == CountryLibrary.statsMultiplier.length) {
            if (CountryLibrary.countryNames.length == player.countryValues.length) {
                new UI();
                System.out.println(CountryLibrary.countryNames.length);
                System.out.println(CountryLibrary.statsMultiplier.length);
                System.out.println(player.countryValues.length);
            }
            else {System.out.println("CountryLibrary.countryNames.length !>= player.countryValues.length");}
        } else {System.out.println("CountryLibrary.countryNames.length !>= CountryLibrary.statsMultiplier.length");}
    }
}
