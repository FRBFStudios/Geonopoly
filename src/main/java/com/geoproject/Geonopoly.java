package com.geoproject;

import com.geoproject.gui.*;
import com.geoproject.libraries.CountryLibrary;

import java.util.logging.Logger;

//This class runs everything.
public class Geonopoly {
    private static final Logger logger = LogHandler.getLogger();

    public static void main(String[] args) {
        Player player = new Player(0);
        if (CountryLibrary.countryNames.length != player.countryValues.length) {logger.severe("Error 1"); return;}

        logger.info("Running Geonopoly");
        logger.info("Creating new UI object...");
        new UI();
        logger.info("Created new UI object. Geonopoly booted correctly.");
    }
}
