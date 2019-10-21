package com.demoproject.devopsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DevopsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsdemoApplication.class, args);
	}

	@RestController
	public static class SomeController {

		@RequestMapping("/hello")
		public String hello() {
			return "hello world";
		}

	}

	public class LogzioLogbackExample {
		public void main(String[] args) {
			Logger logger = LoggerFactory.getLogger(LogzioLogbackExample.class);

			logger.info("Testing logz.io!");
			logger.warn("Winter is coming");
		}
	}


}

