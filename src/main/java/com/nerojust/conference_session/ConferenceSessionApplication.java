package com.nerojust.conference_session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferenceSessionApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceSessionApplication.class, args);
		System.out.println("Started");
	}

}
