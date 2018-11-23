package testgrp;

import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import ch.qos.logback.classic.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	MDC.put("key", "value");
        System.out.println( "Hello World!" );
        logger.debug("Debug message");
        MDC.put("key", "value2");
        logger.debug("Debug message 2");
        MDC.clear();
    }
}
