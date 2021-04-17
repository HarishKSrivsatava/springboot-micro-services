package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class SpringBootApp 
{
	@GetMapping("/")
	String sayHello(){
		return "Hello World !!! SpringBoot Application";
	}
	
    public static void main(String[] args ) {
    	SpringApplication.run(SpringBootApp.class, args);
      }
}
