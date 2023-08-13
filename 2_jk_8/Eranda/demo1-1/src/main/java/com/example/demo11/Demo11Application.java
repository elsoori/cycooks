package com.example.demo11;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo11Application {


	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World, Welcome to 309 with Eranda";
	}

	@GetMapping("/userWelcome")
	public String getUsers(@RequestParam(name = "userName") String name){
		return "Welcome to 309 " + name + "!!!";
	}

}


