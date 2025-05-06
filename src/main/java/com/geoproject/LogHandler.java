package com.geoproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class LogHandler {
    private static Logger logger;

    public static Logger getLogger() {
        if (logger == null) {
            try {
                setupLogger();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return logger;
    }

    private static void setupLogger() throws IOException {
        logger = Logger.getLogger("GlobalLogger");

        // Remove any default handlers
        Logger rootLogger = Logger.getLogger("");
        for (Handler h : rootLogger.getHandlers()) {
            rootLogger.removeHandler(h);
        }

        // Create log file name with timestamp
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String logFileName = "logs/log_" + timestamp + ".txt";

        // Create logs/ directory if it doesn't exist
        new java.io.File("logs").mkdirs();

        // Setup file handler
        FileHandler fileHandler = new FileHandler(logFileName);
        fileHandler.setFormatter(new LogFormatter());

        // Set up logger
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false); // Avoid printing to console
        logger.setLevel(Level.ALL);
    }
}

class LogFormatter extends Formatter {
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public String format(LogRecord record) {
        String timestamp = sdf.format(new Date(record.getMillis()));



        String logMessage = String.format("[%s] [%s] %s%n", timestamp, record.getLevel(), record.getMessage());

        Throwable thrown = record.getThrown();
        if (thrown != null) {
            StringWriter sw = new StringWriter();
            thrown.printStackTrace(new PrintWriter(sw));
            logMessage += "\n" + sw.toString();
        }
        return logMessage + "\n";
    }
}
