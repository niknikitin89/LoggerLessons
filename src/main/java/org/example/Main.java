package org.example;


import org.example.ConsoleLogging.ConsoleLogging;
import org.example.FileLogging.FileLogging;
import org.example.MyLogAppender.MyLogging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.warn("Warning message");
        logger.error("Error message");
        logger.info("Info message");
        logger.debug("Debug message");
        logger.trace("Trace message");

        FileLogging.someVoid();
        ConsoleLogging.someVoid();
        MyLogging.someVoid();
    }
}




