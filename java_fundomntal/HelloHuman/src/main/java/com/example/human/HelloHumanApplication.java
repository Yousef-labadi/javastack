package com.example.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping("/")
	public String Hello() {
		return "<h1> Hello Human </h1>";
	}
	@RequestMapping("/first")
	public String First_name(@RequestParam(value="q", required=false) String first_name) {
		return " Hello" + first_name;
	}
	@RequestMapping("/full")
	public String full(@RequestParam(value="q", required=false) String first_name,@RequestParam(value="q1", required=false) String last_name) {
		return " Hello : " + first_name + last_name;
	}
	@RequestMapping("/hello/{v}")
	public String number(@PathVariable("v") int x,@RequestParam(value="q", required=false) String first_name) {
		String h="";
		for (int i=0;i<x;i++) {
			h+="hello"+" "+first_name+" ";
		}
	return h;
	}
}

