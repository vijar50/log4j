package alpha;

import org.apache.logging.log4j.*;

public class Test1 {
	//creates a Log object and assign this class to it using the getLogger method of LogManager
	private static Logger log = LogManager.getLogger(Test1.class.getName());
	public static void main (String[] args) {
		//Log can be used for any java based testing framework
		//debug used to describe an action
		log.debug("I have clicked on the button.");
		//info used to inform of an event
		log.info("Button is displayed");	
		//error used to inform of failure
		log.error("Button is not displayed");
		//fatal used to inform of failing to initialise
		log.fatal("Button is missing");
		
	}
}
