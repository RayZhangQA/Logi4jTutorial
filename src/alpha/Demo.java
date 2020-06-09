package alpha;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");

		log.info("Object is not present");
		log.error("object is not present");
		log.fatal("this is fatal");
	}

}
