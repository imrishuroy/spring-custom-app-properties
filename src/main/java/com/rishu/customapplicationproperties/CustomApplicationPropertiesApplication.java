package com.rishu.customapplicationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class CustomApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomApplicationPropertiesApplication.class, args);
	}

}
