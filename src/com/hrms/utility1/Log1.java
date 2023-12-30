package com.hrms.utility1;





import org.apache.log4j.Logger;

public class Log1 {
	
	//Initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log1.class.getName());
        // Need to create these methods, so that they can be called
   public static void info(String message) {
    Log.info(message);

	
	
   }  
}
