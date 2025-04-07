package org.example.ConsoleLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleLogging {
    private static Logger logger = LoggerFactory.getLogger(ConsoleLogging.class);

    public static void someVoid(){
        logger.warn("Warning");
        logger.error("Error");
        logger.info("Info");
        logger.trace("Trace");
        logger.debug("Debug");
    }
}
