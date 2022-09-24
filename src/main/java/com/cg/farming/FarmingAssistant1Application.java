package com.cg.farming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.cg.farming.service"})
public class FarmingAssistant1Application {

	public static void main(String[] args) {
		SpringApplication.run(FarmingAssistant1Application.class, args);
	}

}
