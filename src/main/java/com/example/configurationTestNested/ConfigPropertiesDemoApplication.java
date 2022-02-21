package com.example.configurationTestNested;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { JsonProperties.class })
public class ConfigPropertiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigPropertiesDemoApplication.class, args);
		// new SpringApplicationBuilder(ConfigPropertiesDemoApplication.class).run();
	}
}
