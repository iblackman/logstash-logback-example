package testgrp;

import org.slf4j.LoggerFactory;

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
        System.out.println( "Hello World!" );
        logger.debug("Debug message");
    }
}
