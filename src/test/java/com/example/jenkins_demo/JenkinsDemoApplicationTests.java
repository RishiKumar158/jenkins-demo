package com.example.jenkins_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {


	public static Logger logger = org.slf4j.LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Jenkins Demo Application Test Initialized");
		assertEquals(true, true);
	}

}
