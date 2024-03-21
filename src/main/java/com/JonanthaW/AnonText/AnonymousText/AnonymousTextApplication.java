package com.JonanthaW.AnonText.AnonymousText;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.JonanthaW.AnonText.AnonymousText")
public class AnonymousTextApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnonymousTextApplication.class, args);
	}
}
