package beta;

import org.apache.logging.log4j.*;

public class Test2 {
	//creates a Log object and assign this class to it using the getLogger method of LogManager
	private static Logger log = LogManager.getLogger(Test2.class.getName());
	public static void main (String[] args) {
		
		log.debug("I am debugging.");
		 
		log.info("Object is present");	
		
		log.error("Object is not present");

		
		log.fatal("This is fatal");
		
	}
}
