package com.zss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class);
	}
}
