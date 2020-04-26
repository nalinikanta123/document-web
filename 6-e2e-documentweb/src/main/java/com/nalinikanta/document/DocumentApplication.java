package com.nalinikanta.document;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DocumentApplication extends SpringBootServletInitializer{

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(DocumentApplication.class);
}
	public static void main(String[] args) {
		SpringApplication.run(DocumentApplication.class, args);
	}

}
