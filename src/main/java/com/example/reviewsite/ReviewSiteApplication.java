package com.example.reviewsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses=ReviewsInventoryController.class)
@SpringBootApplication
public class ReviewSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewSiteApplication.class, args);
	}
}
