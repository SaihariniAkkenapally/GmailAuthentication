package com.authentication.GmailAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class GmailAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmailAuthenticationApplication.class, args);
	}

}
