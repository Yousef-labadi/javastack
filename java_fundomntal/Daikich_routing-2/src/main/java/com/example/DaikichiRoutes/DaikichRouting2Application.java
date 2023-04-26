package com.example.DaikichiRoutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichRouting2Application {

	public static void main(String[] args) {
		SpringApplication.run(DaikichRouting2Application.class, args);
	}
	@RequestMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String welcom() { // 3
            return "<h1>welcom! </h1>";
    }
	@RequestMapping("/daikichi/today")
	public String Today() {
		return  "<h1>Today you will find luck in all your endeavors! </h1>";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return  "<h1>Tomorrow, an opportunity will arise, so be sure to be open to new ideas! </h1>";
	}
	

}
