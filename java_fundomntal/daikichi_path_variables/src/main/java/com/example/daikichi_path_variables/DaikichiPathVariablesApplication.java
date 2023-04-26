package com.example.daikichi_path_variables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
	 @RequestMapping("/daikichi/travel/{x}")
	    public String display (@PathVariable("x") String y){
	    	return "Congratulations! You will soon travel to  : "+y;
	    }
	 @RequestMapping("/daikichi/lotte/{e}")
	    public String chose(@PathVariable("e") int z){
	    	if(z%2==0) {
	    		return "You will take a grand journey in the near future, but be weary of tempting offers";
	    	}
	    	else {
	    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	    	}
	    }
	

}
