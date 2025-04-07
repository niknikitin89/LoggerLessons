package org.example.FileLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileLogging {
    private static Logger logger = LoggerFactory.getLogger(FileLogging.class);

    public static void someVoid(){
        logger.warn("Warning");
        logger.error("Error");
        logger.info("Info");
        logger.trace("Trace");
        logger.debug("Debug");
    }
}
