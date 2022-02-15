package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Demo {
	
	static Logger log= LogManager.getLogger(Log4j_Demo.class);

	public static void main(String[] args) {
		System.out.println("Heeloo \n");
		
		log.info("Logger");
		log.error("Error msg");
		log.warn("Warning msg");
		log.fatal("fatal msg");
		log.trace("trace msg");
		
		

	}

}
