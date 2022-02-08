package com.orgofarms.awsgitcicdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AwsGitCiCdAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(AwsGitCiCdAppApplication.class, args);
	}
}
