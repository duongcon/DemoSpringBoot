package com.example.bookdetails.util.loggers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Loggers {
    private Logger logger = LoggerFactory.getLogger(Loggers.class);

    public void info(String message) {
        logger.info(message);
    }

    public void debug(String message) {
        logger.info(message);
    }

    public void error(Throwable t) {
        logger.error("", t);
    }
}
