package org.example.MyLogAppender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogging {
    private static Logger logger = LoggerFactory.getLogger(MyLogging.class);

    public static void someVoid() {
        int a =12;
        logger.warn("Warning {}", a);
        logger.error("Error");
        logger.info("Info");
        logger.trace("Trace");
        logger.debug("Debug");
    }
}
