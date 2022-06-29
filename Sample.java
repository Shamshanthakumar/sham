package log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {
	static Logger log=Logger.getLogger(Sample.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("helloe");
		log.warn("Miss splelled");
	    log.error("Check last letter");
	    log.fatal("Fixable");
	    log.debug("replace with o");
		
	}

}

