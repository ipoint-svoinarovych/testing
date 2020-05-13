package com.db.test.demo;

import com.db.test.demo.properties.AdditionalDataSourceProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({ AdditionalDataSourceProperties.class })
@SpringBootApplication
public class DbTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbTestApplication.class, args);
	}

}
