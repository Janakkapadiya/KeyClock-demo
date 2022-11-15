package com.Keyclock.demo.KeyclockDemo;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class KeyclockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyclockDemoApplication.class, args);
	}
}
