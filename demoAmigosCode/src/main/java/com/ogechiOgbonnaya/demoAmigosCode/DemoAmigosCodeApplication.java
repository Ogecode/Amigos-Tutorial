package com.ogechiOgbonnaya.demoAmigosCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAmigosCodeApplication {

	public static void main(String[] args) {SpringApplication.run(DemoAmigosCodeApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet(){
		return "Hello";
	}

}
