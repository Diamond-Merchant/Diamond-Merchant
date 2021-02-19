package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")	// By Default Scan Current Package or Sub Package of Current Package.
@EntityScan(basePackages = "com.bean")	//Scan Entity Classes with
@EnableJpaRepositories(basePackages="com") // By Default JPA Repository Enable in Same Package or Current Package.
public class SpringBootWithBillCurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithBillCurdOperationApplication.class, args);
		System.out.println("Spring Boot Server Started.....hi");
	}

}
