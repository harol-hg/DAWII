package com.aldebsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApiAldebesa2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiAldebesa2Application.class, args);
	}

}
