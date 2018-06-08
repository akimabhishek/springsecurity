package com.techprimers.security.securitydbexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SecurityDbExampleApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SecurityDbExampleApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityDbExampleApplication.class, args);
	}
}
