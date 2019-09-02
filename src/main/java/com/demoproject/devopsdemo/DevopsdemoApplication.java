package com.demoproject.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsdemoApplication.class, args);
		SpringApplication.run(Lab3Application.class, args);
	}

	@RestController
	public static class SomeController {

		@RequestMapping("/hello")
		public String hello() {
			return "world";
		}

	}
}

