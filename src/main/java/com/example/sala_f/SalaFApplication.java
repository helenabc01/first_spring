package com.example.sala_f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SalaFApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalaFApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Germinare Tech - Lena";
	}

}
