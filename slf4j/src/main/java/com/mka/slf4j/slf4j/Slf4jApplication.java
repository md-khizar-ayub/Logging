package com.mka.slf4j.slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Slf4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Slf4jApplication.class, args);
		Slf4jExample1.test();
	}

}
