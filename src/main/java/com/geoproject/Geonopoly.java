package com.geoproject;

import com.geoproject.gui.UI;
import com.geoproject.libraries.CountryLibrary;

import java.util.logging.Logger;

public class  Geonopoly {
    private static final Logger logger = LogHandler.getLogger();

    public static void main(String[] args) {
        Player player = new Player(0, 0);
        if (CountryLibrary.countryNames.length != player.countryValues.length) {
            logger.severe("Error 1");
            System.out.println("Error 1: Country names and country values do not match in length.");
            return;
        }

        logger.info("Running Geonopoly");
        logger.info("Creating new UI object...");
        new UI();
        logger.info("Created new UI object. Geonopoly booted correctly.");
    }
}