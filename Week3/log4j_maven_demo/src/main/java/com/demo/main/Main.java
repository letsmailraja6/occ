package com.demo.main;

import org.apache.log4j.Logger;

import com.demo.service.LogService;

public class Main {

	private static Logger log=Logger.getLogger(Main.class);
	public static void main(String[] args) {
		
		log.trace("Hello from TRACE");
		log.debug("Hello from DEBUG");
		log.info("Hello from INFO");
		log.warn("Hello from WARN");
		log.error("Hello from ERROR");
		log.fatal("Hello from FATAL");
		
		LogService service=new  LogService();
		log.debug("Making call to LogService");
		service.helloLogService();
		log.debug("Completed call from LogService");

	}

}
