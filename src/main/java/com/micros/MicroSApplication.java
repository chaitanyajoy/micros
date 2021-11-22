package com.micros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.micros.*", "com.paypal.*" })
public class MicroSApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroSApplication.class, args);
	}
}
