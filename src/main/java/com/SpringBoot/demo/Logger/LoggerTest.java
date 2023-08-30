package com.SpringBoot.demo.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerTest {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);
@RequestMapping("/")
	public String doSomething() {
		LOGGER.debug("Debug message");
		LOGGER.info("Info message");
		LOGGER.warn("Warning message");
		LOGGER.error("Error message");
return "Programe run";
	}


}
