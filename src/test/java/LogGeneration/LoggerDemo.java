package LogGeneration;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[] args) 
	{
		//create object of logger
		Logger log =LogManager.getLogger("LoggerDemo");
		System.out.println("this is logger demo");
		log.info("for info only");
		log.fatal("fetal msg");
		log.debug("this is debug");
		log.error("for error message");
		log.warn("for warning");
		

	}

}
