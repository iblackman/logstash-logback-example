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
    	// Mapped Diagnostic Context 
    	MDC.put("key", "value");
    	//comparison between a normal message and a message using the logstash-logback encoder
        System.out.println("Debug message");
        logger.debug("Debug message");
        //update MDC "key" value
        MDC.put("key", "value2");
        logger.debug("Debug message 2");
        MDC.clear();
    }
}
