package com.practice.user_core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
	
   private static final Logger log = LoggerFactory.getLogger(LoggerTest.class);

	public static void main(String[] args) {
		  log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	}
}
