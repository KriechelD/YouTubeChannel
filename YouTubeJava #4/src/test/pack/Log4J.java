package test.pack;

import org.apache.log4j.Logger;

public class Log4J {

	private static final Logger log = Logger.getLogger(Log4J.class);

	public static void main(String[] args) {

		try {
			throw new Exception("New Exception");
		} catch (Exception e) {
			log.error(e, e);
		}

	}

}
