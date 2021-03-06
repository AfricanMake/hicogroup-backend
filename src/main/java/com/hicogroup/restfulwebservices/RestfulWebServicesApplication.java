package com.hicogroup.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestfulWebServicesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		System.out.println("App Has Started Successfully");
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(RestfulWebServicesApplication.class);
	}

}
