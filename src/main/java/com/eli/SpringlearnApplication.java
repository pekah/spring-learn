package com.eli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"beans.xml"})
public class SpringlearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlearnApplication.class, args);
	}
}
