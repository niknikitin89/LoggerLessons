package org.example.MyLogAppender;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class MyLogAppender extends AppenderSkeleton {
    @Override
    protected void append(LoggingEvent event) {
        System.err.println(
                event.getLevel() + " " +
                        event.getLoggerName() +
                        ". Message: " +
                        event.getMessage().toString());
    }

    @Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}
