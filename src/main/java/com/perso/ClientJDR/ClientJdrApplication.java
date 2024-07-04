package com.perso.ClientJDR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ClientJdrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientJdrApplication.class, args);
	}

}
