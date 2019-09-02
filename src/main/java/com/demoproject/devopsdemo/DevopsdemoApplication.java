package com.demoproject.devopsdemo;

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
			return "world";
		}

	}
}

