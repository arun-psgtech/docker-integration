package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.example")
public class DockerintegrationApplication {
	
	@GetMapping(path = "hello-world")
	public String getMessage() {
		return "Hello World123";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerintegrationApplication.class, args);
	}

}
