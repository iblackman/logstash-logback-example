package main.java.hello;

import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import ch.qos.logback.classic.Logger;

public class App {
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
        logger.debug("Debug message  2");
        //print of exception
        try {
			int[] a = new int[2];
			System.out.println(a[3]+"Debug message");
		} catch (Exception e) {
			//e.printStackTrace();
	        logger.debug("Exception: "+e, e);
		}
        MDC.clear();
    }
}
