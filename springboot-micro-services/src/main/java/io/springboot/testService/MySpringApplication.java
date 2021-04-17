package io.springboot.testService;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;

public class MySpringApplication extends SpringApplication{
	

	@Override
	public void setBanner(Banner banner) {
		super.setBanner(banner);
	}

}
