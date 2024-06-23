package com.mka.slf4j.slf4j;

import org.slf4j.*;

public class Slf4jExample1 {
	private static Logger logger = LoggerFactory.getLogger(Slf4jExample1.class);
	
	public static void test() {
		logger.info("Info level Log");
		logger.error("Info level Log");
	}
}
