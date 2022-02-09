package com.orgofarms.awsgitcicdapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
public class AwsGitCiCdAppApplication extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(AwsGitCiCdAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AwsGitCiCdAppApplication.class, args);
	}
	@PostConstruct
	public void postConstruct(){
		LOGGER.info("my-first-app Post construct.");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AwsGitCiCdAppApplication.class);
	}
}
