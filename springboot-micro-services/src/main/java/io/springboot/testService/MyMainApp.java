package io.springboot.testService;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyMainApp {
	public static void main(String[] args) {
		/*SpringApplication sa = new SpringApplication(MyMainApp.class);
		sa.setBanner(new MyBanner());
		//sa.setBannerMode(Banner.Mode.OFF);
		sa.run(args);*/
		
		SpringApplication.run(MyMainApp.class, args);
		
	/*	new SpringApplicationBuilder()
			.sources(Parent.class)
			.child(MyMainApp.class)
			.bannerMode(Banner.Mode.OFF)
			.run(args);*/
	}
}
